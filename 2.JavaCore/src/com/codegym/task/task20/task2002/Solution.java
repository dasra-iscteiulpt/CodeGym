package com.codegym.task.task20.task2002;


import java.io.*;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

/* 
Reading and writing to a file: CodeGym

*/
public class Solution {
    public static void main(String[] args) throws Exception {
        // You can find your_file_name.tmp in your TMP directory or adjust outputStream/inputStream according to your file's actual location
        try {
        //File yourFile = File.createTempFile("C:/Users/Diana Salvador/Desktop/test1.txt", null);
        OutputStream outputStream = new FileOutputStream("C:/Users/Diana Salvador/Desktop/test2.txt");
        InputStream inputStream = new FileInputStream("C:/Users/Diana Salvador/Desktop/test1.txt");
        CodeGym loadedObject = new CodeGym();

        //CodeGym codeGym = new CodeGym();
        // Initialize users field for the codeGym object here
        loadedObject.save(outputStream);
            loadedObject.load(inputStream);
        //outputStream.flush();
        // Here check that the codeGym object is equal to the loadedObject object

        outputStream.close();
        inputStream.close();

        } catch (IOException e) {
            //e.printStackTrace();
            System.out.println("Oops, something is wrong with my file");
        } catch (Exception e) {
            //e.printStackTrace();
            System.out.println("Oops, something is wrong with the save/load method");
        }
    }

    public static class CodeGym {
        public List<User> users = new ArrayList<>();

        public void save(OutputStream outputStream) throws Exception {
            PrintWriter writer = new PrintWriter(outputStream);
            byte separator = 126;

            if (!users.isEmpty()) {
                for (User user : users) {
                    if (user.getFirstName() != null || user.getFirstName().equals("")) {
                        writer.write(user.getFirstName());
                        writer.write("~");
                    } else
                        writer.write("~");

                    if (user.getLastName() != null || user.getLastName().equals("")) {
                        writer.write(user.getLastName());
                        writer.write("~");
                    } else
                        writer.write("~");

                    if (user.getBirthDate() != null || user.getBirthDate().equals("")) {
                        writer.write(user.getBirthDate().toString());
                        writer.write("~");
                    } else
                        writer.write("~");

                    if (String.valueOf(user.isMale()) != null || String.valueOf(user.isMale()).equals("")) {
                        writer.write(String.valueOf(user.isMale()));
                        writer.write("~");
                    }

                    if (user.getCountry() != null || user.getCountry().equals("")) {
                        writer.write(String.valueOf(user.getCountry().getDisplayName()));
                    } else
                        writer.write("~");

                    writer.write(10);
                    writer.flush();

                }
                writer.close();
            }
        }

        public void load(InputStream inputStream) throws Exception {
            BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
            User.Country country = null;
            String line;
            while ((line = reader.readLine()) != null) {
                if (line.equals("")) return;
                String[] data = line.split("~");
                User user = new User();
                if (data[0] != null || !data[0].equals(""))
                    user.setFirstName(data[0]);

                if (data[1] != null || !data[1].equals(""))
                    user.setLastName(data[1]);

                if (data[2] != null || !data[2].equals("")) {
                    SimpleDateFormat formatter = new SimpleDateFormat("EEE MMM dd HH:mm:ss Z yyyy");
                    Date parsedDate = formatter.parse(data[2]);
                    user.setBirthDate(parsedDate);
                }

                if (data[3] != null || !data[3].equals(""))
                    user.setMale(Boolean.parseBoolean(data[3]));

                if (data[4] != null || !data[4].equals("")) {
                    if (data[4].equals((User.Country.UNITED_STATES.getDisplayName()))) {
                        country = User.Country.UNITED_STATES;
                    } else if (data[4].equals(User.Country.UNITED_KINGDOM.getDisplayName())) {
                        country = User.Country.UNITED_KINGDOM;
                    } else {
                        country = User.Country.OTHER;
                    }
                    user.setCountry(country);
                }
                users.add(user);
            }
            reader.close();
        }


        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            CodeGym codeGym = (CodeGym) o;
            return users != null ? users.equals(codeGym.users) : codeGym.users == null;
        }

        @Override
        public int hashCode() {
            return users != null ? users.hashCode() : 0;
        }
    }
}

