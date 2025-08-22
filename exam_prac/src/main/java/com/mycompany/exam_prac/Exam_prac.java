package com.mycompany.exam_prac;

import static java.lang.Integer.parseInt;

public class Exam_prac {

    public static void main(String[] args) {
        String s = "25mangos 10grapes 5bananas 15papayas";
        int num = 5;
        String[] words = s.split(" ");
        String[] Updwords = new String[words.length];
        for(int i=0;i<words.length;i++){
            String word = words[i];
        int j = 0;
            while (j < word.length() && Character.isDigit(word.charAt(j))) {
                j++;            
            }
            String digit = word.substring(0,j);
            String fruit = word.substring(j);
            int number = parseInt(digit);
            number = num+number;
            Updwords[i] = number+fruit;
        }
        StringBuilder output = new StringBuilder();
        for (int i = Updwords.length - 1; i >= 0; i--) {
            output.append(Updwords[i]);
            if (i != 0) {
                output.append(" ");
            }
        }
        System.out.println(output.toString());
    }
}