package com.codegym.task.task31.task3113;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;

/* 
What's in the folder?

*/
public class Solution {

    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String fPath = bufferedReader.readLine();
        bufferedReader.close();
        Path path = Paths.get(fPath);
        final int[] countDir = {0};
        final int[] countFiles = {0};
        final long[] length = {0};
        boolean isDirectory = Files.isDirectory(path);   // Check if it's a directory
        if (!isDirectory) {
            System.out.println(fPath + " is not a folder");
        } else {
            Files.walkFileTree(path, new SimpleFileVisitor<Path>(){
                @Override
                public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs)
                        throws IOException {
                    countDir[0] += 1;
                    return FileVisitResult.CONTINUE;
                }

                @Override
                public FileVisitResult visitFile(Path visitedFile, BasicFileAttributes fileAttributes)
                        throws IOException {
                    countFiles[0] += 1;
                    length[0] = length[0] +fileAttributes.size();
                    return FileVisitResult.CONTINUE;
                }
            });

            System.out.println("Total folders: "+(countDir[0]-1));
            System.out.println("Total files: "+countFiles[0]);
            System.out.println("Total size: "+length[0]);
        }
    }
}
