package org.example;

import java.util.Objects;

public class Sem2 {
    public static void main(String[] args) {
//    stringEqals();



    }

    /* Напишите метод, сжимающий строку
    aaaabbbcdd -> a4b3cd2
    abcda -> abcda
     */
    static String compress(String source){
        String result = "";
        int counter = 1;
        char[] chars = source.toCharArray();
        char current = chars[0];
        result += current;
        for (int i = 1; i < chars.length; i++) {
            if (chars[i] == current) {
                counter++;
            } else {
                if (counter != 1) {
                    result += counter;
                }
                result += chars[i];
                current = chars[i];
                counter = 1;
            }
        }
        if (counter != 1) {
            result += counter;
        }
        return  result;

//        int length = source.length();
//        for (int i =0; i < length; i++){
//            char c = source.charAt(i); //ровно один символ, получение символа по индексу
//        }
    }


    private static void stringEqals(){
        // String Poll (String Table) ["string" == A1, "new_value" == A5]
        String s1 = "string"; // -> A1
        String s2 = "string"; // -> A1
        String s3 = new String("string"); // -> A3
        String s4 = new String("string"); // -> A4
        String s5 = null;

        s1 = s1.replace('s', 'm'); // создает новую строку, которая записывается в s1
        System.out.println(s1); // т е меняется ссылка на объект. Строки неизменяемые

        System.out.println(s1 == s2); // true
        System.out.println(s1 == s3); // false
        System.out.println(s3 == s4); // false

        System.out.println(s1.equals(s2)); // true
        System.out.println(s1.equals(s3)); // true
        System.out.println(s3.equals(s4)); // true
        System.out.println(Objects.equals(s5, s1));
    }

    static boolean isPslindrome(String source){
        int length = source.length();
        int half = length / 2;
        for (int i = 0; i < half; i++) {
            if (source.charAt(i) != source.charAt(length - 1 - i)) {
                return false;
            }
        }

        return true;



//        String reversed = new StringBuilder(source).reverse().toString();
//        return Objects.equals(source, reversed);
//        Igor Chestnov: StringBuilder stringBuilder = new StringBuilder();
//        stringBuilder.insert(0, "abcde");
//        stringBuilder.deleteCharAt(2); // abde
//        stringBuilder.reverse(); // edba
//        stringBuilder.append("_suffix"); // edba_suffix
//        stringBuilder.setCharAt(0, 'x'); // xdba_suffix
//        stringBuilder.insert(0, "prefix_"); // prefix_xdba_suffix
//
//        System.out.println(stringBuilder.toString());
    }






}
