package org.example.stepDefs;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.apache.commons.io.FileUtils;
import org.example.Utilities.DataUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;

// this file have after and before test
public class Hooks {
    public static WebDriver driver;

    @Before
    public void setup() throws IOException {


        String browserName = DataUtils.get_properties("browser_name");


        if (browserName.contains("edge")) {
            driver = new EdgeDriver();
        } else if (browserName.contains("firefox")) {
            driver = new FirefoxDriver();
        } else {
            driver = new ChromeDriver();
        }
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get(DataUtils.get_properties("URL"));


    }

    @After
    public void quit(Scenario sc) throws InterruptedException {

createDireactionsIfnotExist();
        if (sc.isFailed()) {
            saveScreenshotAsFile(sc, "FAIL", "failed");
        } else {
            saveScreenshotAsFile(sc, "PASS", "passed");
        }
        Thread.sleep(Duration.ofSeconds(3));
        driver.quit();

    }

    private void saveScreenshotAsFile(Scenario sc, String screenshotName, String status) {
        TakesScreenshot ts = (TakesScreenshot) driver;
        File srcFile = ts.getScreenshotAs(OutputType.FILE);
        String timestamp = new SimpleDateFormat("dd-MM-yyyy#HH-mm-ss").format(new Date());
        String scenarioName = sc.getName().replaceAll("[^a-zA-Z0-9]", "_");
        File destFile = new File("src/test/resources/test-outputs/" + status + "/" + screenshotName + "_" + scenarioName + "_" + timestamp + ".png");

        try {
            FileUtils.copyFile(srcFile, destFile);
            // Attach the screenshot to the scenario
            byte[] screenshot = ts.getScreenshotAs(OutputType.BYTES);
            sc.attach(screenshot, "image/png", screenshotName + " - " + scenarioName + " - " + timestamp);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void createDireactionsIfnotExist() {
        new File("src/test/resources/test-outputs/failed").mkdirs();
        new File("src/test/resources/test-outputs/passed").mkdirs();
    }
}
