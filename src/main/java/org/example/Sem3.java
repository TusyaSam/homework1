package org.example;

import java.util.ArrayList;
import java.util.List;

public class Sem3 {

    public static void main(String[] args) {
//        List<Integer> list = new ArrayList<>(); // по умолч это новый список из 10 элементов null
//        // и если будем добавлять 11ый элемент, то автоматом список увеличится в 2 раза
//        // размер динамический,т. е. он может и уменьшаться
//        System.out.println(list.size()); //0
//        list.add(1);
//        System.out.println(list.size()); //1
//        list.remove(0);
//        System.out.println(list.size()); //0

        List<String> text = new ArrayList<>();
        text.add("word");
        text.add("Sun");
        text.add("Moon");
        text.add("Sun");
        text.add("word");
        text.add("java");
        text.add("java");

        countAndPrint(text);
    }

    static void countAndPrint(List<String> strings) {
// Подсчитать слова с повторениями
// Распечатать статистику слов с повторениями
        String temp;
        int count;
        List<String> tempList = new ArrayList<>();
        for (int i = 0; i < strings.size(); i++) {
            temp = strings.get(i);
            if (!tempList.contains(temp)) {
                count = 1;
                for (int j = i + 1; j < strings.size(); j++) {
                    if (temp.equals(strings.get(j))) {
                        count++;
                    }
                }
                System.out.println(temp + " " + count);
                tempList.add(temp);
            }

        }
    }







}


// Iterable <- Collection <- List <- ArrayList
// Iterable <- Collection <- Set
// for (String s: list){
