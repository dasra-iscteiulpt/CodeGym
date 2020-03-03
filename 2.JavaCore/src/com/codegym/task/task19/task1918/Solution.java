package com.codegym.task.task19.task1918;

/* 
Introducing tags

*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Stack;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution {
    public static int ordinalIndexOf(String str, String substr, int n) {
        int pos = -1;
        do {
            pos = str.indexOf(substr, pos + 1);
        } while (n-- > 0 && pos != -1);
        return pos;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String filename = br.readLine();
        br.close();
        BufferedReader reader = new BufferedReader(new FileReader(filename));

        String data = "";
        String line;
        while ((line = reader.readLine()) != null) {
            data += line;
        }
        reader.close();

        String openingTag = "<" + args[0];
        String closingTag = "</" + args[0] + ">";
        String alpha = "α";
        String omega = "Ω";
        data = data.replaceAll(openingTag, alpha);
        data = data.replaceAll(closingTag, omega);
        data = data.substring(data.indexOf(alpha));
        ArrayList<String> al = new ArrayList<String>();
        while (data.contains(alpha)) {
            int alphaCount = 0;
            int omegaCount = 0;
            for (int i = 0; i < data.length(); i++) {
                if (alpha.equals(String.valueOf(data.charAt(i)))) {
                    alphaCount++;
                } else if (omega.equals(String.valueOf(data.charAt(i)))) {
                    omegaCount++;
                }
                if (alphaCount > 0 && alphaCount == omegaCount) {
                    String tags = data.substring(data.indexOf(alpha), i + 1);
                    data = data.replace(tags, "");
                    tags = tags.replaceAll(alpha, openingTag);
                    tags = tags.replaceAll(omega, closingTag);
                    System.out.println(tags);

                    try {
                        tags = tags.replaceAll(openingTag, alpha);
                        tags = tags.replaceAll(closingTag, omega);
                        tags = tags.substring(ordinalIndexOf(tags, alpha, 1), tags.lastIndexOf(omega));

                    } catch (Exception e) {
                       // System.out.println("Exception");
                        break;
                    }
                    alphaCount = 0;
                    omegaCount = 0;

                    for (int x = 0; x < tags.length(); x++) {
                        if (alpha.equals(String.valueOf(tags.charAt(x)))) {
                            alphaCount++;
                        } else if (omega.equals(String.valueOf(tags.charAt(x)))) {
                            omegaCount++;
                        }
                        if (alphaCount == 1 && omegaCount == 1) {
                            String aux = tags.substring(tags.indexOf(alpha), tags.indexOf(omega)) + omega;
                            aux = aux.replaceAll(alpha, openingTag);
                            aux = aux.replaceAll(omega, closingTag);
                            System.out.println(aux);
                            tags = tags.replaceAll(alpha, openingTag);
                            tags = tags.replaceAll(omega, closingTag);
                            tags = tags.replace(aux, "");
                            tags = tags.replaceAll(openingTag, alpha);
                            tags = tags.replaceAll(closingTag, omega);
                            omegaCount = 0;
                            alphaCount = 0;
                            x = -1;

                        } else if (alphaCount == omegaCount && alphaCount > 0) {
                            while (alphaCount > 1) {
                                tags = tags.replaceAll(alpha, openingTag);
                                tags = tags.replaceAll(omega, closingTag);
                                System.out.println(tags);
                                try {
                                    tags = tags.replaceAll(openingTag, alpha);
                                    tags = tags.replaceAll(closingTag, omega);
                                    tags = tags.substring(ordinalIndexOf(tags, alpha, 1), tags.lastIndexOf(omega, tags.lastIndexOf(omega) - 1))+omega;
                                } catch (Exception e) {
                                    System.out.println("Exception");
                                    break;
                                }
                                alphaCount--;
                            }
                            omegaCount = 0;
                            alphaCount = 0;
                            x = -1;
                        }
                    }
                }






                   /* if (alphaCount == 1 && omegaCount == 1) {
                        data = data.substring(data.indexOf(alpha, data.indexOf(alpha) + 1));
                        i = 0;
                        alphaCount = 0;
                        omegaCount = 0;
                    }
                    alphaCount--;
                    if (alphaCount > 0) {
                        for (int count = 1; count <= alphaCount; count++) {
                            tags = tags.replaceAll(openingTag, alpha);
                            tags = tags.replaceAll(closingTag, omega);
                            if (count == alphaCount) {
                                String aux = tags.substring(tags.lastIndexOf(alpha), tags.indexOf(omega)) + omega;
                                //tags = tags.substring(tags.indexOf(alpha, tags.indexOf(alpha) + count), tags.indexOf(omega, tags.indexOf(omega) + count - 1))+omega;
                                tags = tags.replace(aux, "");
                                aux = aux.replaceAll(alpha, openingTag);
                                aux = aux.replaceAll(omega, closingTag);
                                System.out.println(aux);
                                tags = tags.replaceAll(alpha, openingTag);
                                tags = tags.replaceAll(omega, closingTag);
                            } else {
                                String aux = tags.substring(tags.indexOf(alpha, tags.indexOf(alpha) + 1), tags.indexOf(omega, tags.indexOf(omega) - 1)) + omega;
                                tags = tags.substring(tags.indexOf(alpha, tags.indexOf(alpha) + val), tags.indexOf(omega, tags.indexOf(omega) - val)) + omega;
                                aux = aux.replaceAll(alpha, openingTag);
                                aux = aux.replaceAll(omega, closingTag);
                                System.out.println(aux);
                                tags = tags.replaceAll(alpha, openingTag);
                                tags = tags.replaceAll(omega, closingTag);
                                val++;
                            }

                        }
                        data = data.substring(i + 1);
                        break;
                    }*/
            }
        }

    }
}

