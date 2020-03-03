package com.codegym.task.task18.task1814;

import java.awt.*;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.UnsupportedEncodingException;

/* 
UnsupportedFileName

*/

public class TxtInputStream extends FileInputStream {
    String filename;

    public TxtInputStream(String fileName) throws IOException, UnsupportedFileNameException {
        super(fileName);
        if(fileName.endsWith(".txt")){
            new FileInputStream(fileName);
        }else{
            super.close();
            throw new UnsupportedFileNameException();
        }
    }

    public static void main(String[] args) throws IOException, UnsupportedFileNameException {
        String fileName = "C:/Users/Diana Salvador/Desktop/test1.txt";
        TxtInputStream t = new TxtInputStream(fileName);

    }
}

