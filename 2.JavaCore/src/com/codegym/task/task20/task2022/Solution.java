package com.codegym.task.task20.task2022;

import java.io.*;

/* 
Overriding serialization in a thread

*/
public class Solution implements Serializable, AutoCloseable {
    private transient FileOutputStream stream;
    private String fileName;

    public Solution(String fileName) throws FileNotFoundException {
        this.fileName=fileName;
        this.stream = new FileOutputStream(fileName);
    }

    public void writeObject(String string) throws IOException {
        stream.write(string.getBytes());
        stream.write("\n".getBytes());
        stream.flush();
    }

    private void writeObject(ObjectOutputStream out) throws IOException {
        out.defaultWriteObject();
    }

    private void readObject(ObjectInputStream in) throws IOException, ClassNotFoundException {
        in.defaultReadObject();
        stream = new FileOutputStream(fileName, true);
    }

    @Override
    public void close() throws Exception {
        System.out.println("Closing everything!");
        stream.close();
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ByteArrayOutputStream arrayOutputStream = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(arrayOutputStream);
        Solution solution= new Solution("C:/Users/Diana Salvador/Desktop/test1.txt");
        oos.writeObject(solution);

        ByteArrayInputStream arrayInputStream = new ByteArrayInputStream(arrayOutputStream.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(arrayInputStream);
        Solution s = (Solution) ois.readObject();
        oos.writeObject(s);
        //System.out.println(s);
    }
}
