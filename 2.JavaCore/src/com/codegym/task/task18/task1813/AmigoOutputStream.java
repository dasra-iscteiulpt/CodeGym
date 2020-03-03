package com.codegym.task.task18.task1813;


import java.io.*;

/* 
AmigoOutputStream

*/

public class AmigoOutputStream extends FileOutputStream{
    public static String fileName = "C:/tmp/result.txt";
    FileOutputStream fo;

    @Override
    public void write(byte[] b) throws IOException {
        fo.write(b);
    }

    @Override
    public void write(byte[] b, int off, int len) throws IOException {
        fo.write(b, off, len);
    }

    public AmigoOutputStream(FileOutputStream fileOutputStream) throws FileNotFoundException {
            super(fileName);
            this.fo=fileOutputStream;
    }

    @Override
    public void write(int b) throws IOException {
        fo.write(b);
    }

    @Override
    public void close() throws IOException {
        flush();
        fo.write("CodeGym © All rights reserved.".getBytes());
        fo.close();
    }

    @Override
    public void flush() throws IOException {
        fo.flush();
    }

    public static void main(String[] args) throws FileNotFoundException {
        new AmigoOutputStream(new FileOutputStream(fileName));
    }

}
