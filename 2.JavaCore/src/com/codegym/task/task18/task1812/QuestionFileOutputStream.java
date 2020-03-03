package com.codegym.task.task18.task1812;

import java.io.*;

/* 
Extending AmigoOutputStream

*/

public class QuestionFileOutputStream implements AmigoOutputStream {
    AmigoOutputStream field;
    public QuestionFileOutputStream(AmigoOutputStream a){
        this.field=a;
    }
    @Override
    public void flush() throws IOException {
        field.flush();
    }

    @Override
    public void write(int b) throws IOException {
        field.write(b);
    }

    @Override
    public void write(byte[] b) throws IOException {
        field.write(b);
    }

    @Override
    public void write(byte[] b, int off, int len) throws IOException {
        field.write(b,off,len);
    }

    @Override
    public void close() throws IOException {
        System.out.println("Do you really want to close the stream? Y/N");
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String s=br.readLine();
        if (s.equals("Y")) {
            field.close();
        }

    }
}

