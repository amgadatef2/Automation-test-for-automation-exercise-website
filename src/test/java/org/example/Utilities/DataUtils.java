package org.example.Utilities;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.gson.JsonPrimitive;

import java.io.*;
import java.util.Properties;

public class DataUtils {
    private static final String Test_Data_Path = "src/test/resources/TestData/";

    //json
    public static String Get_jsonData(String filename, String Key) throws FileNotFoundException {


        FileReader  reader = new FileReader(Test_Data_Path + filename + ".json");

        JsonElement JsonElement = JsonParser.parseReader(reader);
        return JsonElement.getAsJsonObject().get(Key).getAsString();


    }


    public static void Set_jsonData(String filename, String Key, String value) {
        FileReader reader = null;
        try {
            reader = new FileReader(Test_Data_Path + filename + ".json");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        JsonElement JsonElement = JsonParser.parseReader(reader);

        JsonObject jsonObject = JsonElement.getAsJsonObject();
//set the new value
        jsonObject.add(Key, new JsonPrimitive(value));

        FileWriter Writer = null;
        try {
            Writer = new FileWriter(Test_Data_Path + filename + ".json");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        try {
            Writer.write(jsonObject.toString());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        try {
            Writer.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    public static String get_properties(String Key) throws IOException {
        Properties Prop = new Properties();

        Prop.load(new FileInputStream(Test_Data_Path + "enviroment.properties"));

        return Prop.getProperty(Key);

    }


    public static void set_properties(String Key, String Value) {
        Properties prop = new Properties();
        FileInputStream in = null;
        try {
            in = new FileInputStream(Test_Data_Path + "enviroment.properties");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        try {
            prop.load(in);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        try {
            in.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        FileOutputStream Out = null;
        try {
            Out = new FileOutputStream(Test_Data_Path + "enviroment.properties");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        prop.setProperty(Key, Value);
        try {
            prop.store(Out, null);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        try {
            Out.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
