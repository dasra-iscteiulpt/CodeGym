package com.codegym.task.task14.task1414;

/* 
MovieFactory

*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        boolean b = true;

        while (b) {
            String s = reader.readLine();
            Movie movie = MovieFactory.getMovie(s);
            //System.out.println(s);

            if ((s.equals("soapOpera"))) {

                System.out.println(movie.getClass().getSimpleName());

            }
            else if ((s.equals("cartoon"))) {

                System.out.println((movie.getClass().getSimpleName()));
            }
            else if ((s.equals("thriller"))) {

                System.out.println((movie.getClass().getSimpleName()));
            } else {
                b = false;
            }
        }
    }

    static class MovieFactory {

        static Movie getMovie(String key) {
            Movie movie = null;

            // Create a SoapOpera object for the key "soapOpera"
            if ("soapOpera".equals(key)) {
                movie = new SoapOpera();
            }
            if ("cartoon".equals(key)) {
                movie = new Cartoon();
            }
            if ("thriller".equals(key)) {
                movie = new Thriller();
            }
            return movie;
        }
    }


    static abstract class Movie {
    }

    static class SoapOpera extends Movie {
    }

    static class Cartoon extends Movie {
    }

    static class Thriller extends Movie {
    }
}

