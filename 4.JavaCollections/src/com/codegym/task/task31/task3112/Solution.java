package com.codegym.task.task31.task3112;

import java.io.IOException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import static java.nio.file.StandardCopyOption.REPLACE_EXISTING;

/* 
File downloader

*/
public class Solution {

    public static void main(String[] args) throws IOException {
        Path passwords = downloadFile("https://codegym.cc/testdata/secretPasswords.txt", Paths.get("C:/Users/Diana Salvador/Downloads"));

        for (String line : Files.readAllLines(passwords)) {
            System.out.println(line);
        }
    }

    public static Path downloadFile(String urlString, Path downloadDirectory) throws IOException {
        URL url = new URL(urlString);
        String fileName = urlString.substring(urlString.lastIndexOf('/') + 1, urlString.length());
        Path tempFile = Files.createTempFile("temp-",".tmp");
        Files.copy(url.openStream(), tempFile,REPLACE_EXISTING);
        Path path = Paths.get(downloadDirectory+"/" + fileName);
        System.out.println(path.toString());
        Files.move(tempFile, path);
        return path;
    }
}
