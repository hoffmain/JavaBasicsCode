package com.syntax.utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {
    public static Properties read(String path)  {

        //Properties class that handles the .properties file
        Properties properties=new Properties();
        FileInputStream fileInputStream = null;
        try{
            //Navigate to that location
            fileInputStream=new FileInputStream(path);

            //Loads the data from the hardDrive to RAM
            properties.load(fileInputStream);
        }catch (IOException io){
            System.out.println("Please check the file at this path if it is present= "+path);
        }finally {
            if(fileInputStream!=null){
                try{
                    fileInputStream.close();
                }catch (IOException ioException){
                    System.out.println("Error while closing the file ");
                }
            }
        }
        return properties;
    }
}
