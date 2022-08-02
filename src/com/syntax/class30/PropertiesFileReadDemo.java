package com.syntax.class30;

import jdk.nashorn.internal.ir.SplitReturn;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesFileReadDemo {
    public static void main(String[] args) throws IOException {
        /*
        right click on any directory or package
        new => File => give any name and extension
         */
        /*
        steps to get the path in intellij
        1) right click on any file
        2) click on get path reference
        3) select content root path
         */
        //Get the path of a file
        String path="Files/Abdul.properties";
        //Navigate to this location with the help of FileInputStream class if we want to read the
        //data or FileOutStream if we want to write the data to file

        FileInputStream fileInputStream=new FileInputStream(path);

        //Now we need a class that understands how to read the data from this file type
        Properties properties=new Properties();
        //loading the data from the file inside the properties Object
        properties.load(fileInputStream);

        System.out.println(properties.getProperty("user"));

        //close this file to save system resources
        fileInputStream.close();
    }
}
