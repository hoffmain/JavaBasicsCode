package com.syntax.utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {
    public static Properties read(String path) throws IOException {
        //Navigate to that location
        FileInputStream fileInputStream=new FileInputStream(path);
        //Properties class that handles the .properties file
        Properties properties=new Properties();
        //Loads the data from the hardDrive to RAM
        properties.load(fileInputStream);
        return properties;
    }
}
