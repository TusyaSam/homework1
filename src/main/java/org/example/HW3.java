package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class HW3 {

    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        strings.add("string");
        strings.add("40");
        strings.add("-5");
        strings.add("my_string");
        removeIntegers(strings);
        System.out.println(strings); // [string, my_string]


        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        removeEvenNumber(numbers);
        System.out.println(numbers);
    }


    static void removeEvenNumber(List<Integer> numbers) {

        //  Удалить все четные элементы из списка
        Iterator<Integer> iterator = numbers.iterator();
        while (iterator.hasNext()) {
            Integer number = iterator.next();
            if (number % 2 == 0) {
                iterator.remove();
            }
        }
    }


    static void removeIntegers(List<String> strings) {
        // Удалить строки, которые являются целыми числами
        List<String> integers = new ArrayList<>();
            for (String str : strings) {
                try {
                    Integer.parseInt(str);
                    integers.add(str);
                } catch (NumberFormatException e) { // Это не целое число
                }
            }
            strings.removeAll(integers);
    }


}
//Понять, что строка является числом, можно например так:
//
//        try {
//        Integer.parseInt("str");
//// число
//        } catch (NumberFormatException e) {
//// не число
//        }