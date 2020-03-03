package com.codegym.task.task17.task1721;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Transactionality

*/

public class Solution {
    public static List<String> allLines = new ArrayList<>();
    public static List<String> linesForRemoval = new ArrayList<>();

    public static void main(String[] args) throws CorruptedDataException {
        Solution s = new Solution();
        BufferedReader objReader=null;
        BufferedReader br=null;
        try {
            String strCurrentLine, text = "";
            br = new BufferedReader(new InputStreamReader(System.in));
            String file1 = br.readLine();
            String file2 = br.readLine();

            objReader = new BufferedReader(new FileReader(file1));
            while ((strCurrentLine = objReader.readLine()) != null) {
                allLines.add(strCurrentLine);
            }
            objReader = new BufferedReader(new FileReader(file2));
            while ((strCurrentLine = objReader.readLine()) != null) {
                linesForRemoval.add(strCurrentLine);
            }
            s.joinData();
        } catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            try {
                objReader.close();
                br.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public void joinData() throws CorruptedDataException {
        if(allLines.containsAll(linesForRemoval))
            allLines.removeAll(linesForRemoval);
        else{
            allLines.clear();
            throw new CorruptedDataException();
        }
    }
}