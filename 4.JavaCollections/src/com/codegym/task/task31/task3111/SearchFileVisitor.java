package com.codegym.task.task31.task3111;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SearchFileVisitor extends SimpleFileVisitor<Path> {
    private String partOfName;
    private String partOfContent;
    private int minSize;
    private int maxSize;
    private boolean maxSizeSet;
    private boolean minSizeSet;
    private List<Path> foundFiles = new ArrayList<>();

    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
        byte[] content = Files.readAllBytes(file); // File size: content.length

        boolean notMatchConditions = false;
        if (partOfName != null){
            if(file.toString().contains(partOfName)){
                if(!foundFiles.contains(file))
                    foundFiles.add(file);
            }else {
                notMatchConditions = true;
            }
        }
        if (partOfContent != null){
            if(fileContains(file, partOfContent)){
                if(!foundFiles.contains(file))
                    foundFiles.add(file);
            }else {
                notMatchConditions = true;
            }
        }
        if (minSizeSet){
            if(content.length > minSize){
                if(!foundFiles.contains(file))
                    foundFiles.add(file);
            }else {
                notMatchConditions = true;
            }
        }
        if (maxSizeSet){
            if(content.length < maxSize){
                if(!foundFiles.contains(file))
                    foundFiles.add(file);
            }else {
                notMatchConditions = true;
            }
        }

        if (notMatchConditions) foundFiles.remove(file);
        return super.visitFile(file, attrs);
    }

    public void setPartOfName(String amigo) {
        this.partOfName = amigo;
    }

    public void setPartOfContent(String programmer) {
        this.partOfContent = programmer;
    }

    public void setMinSize(int i) {
        this.minSize = i;minSizeSet = true;
    }

    public void setMaxSize(int i) {
        this.maxSize = i;maxSizeSet = true;
    }

    public List<Path> getFoundFiles() {
        return this.foundFiles;
    }

    private boolean fileContains(Path file, String partOfContent) {
        try (Scanner reader = new Scanner(file)) {
            while (reader.hasNext()) {
                if (reader.nextLine().contains(partOfContent)) {
                    return true;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return false;
    }
}
