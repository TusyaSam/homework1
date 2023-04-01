package org.example;

import java.util.Arrays;

public class HW1 {



    public static void main(String[] args) {
//        System.out.println(isSumBetween10And20(5, 15)); // true
//        System.out.println(isSumBetween10And20(7, 15)); // false
//        System.out.println(isSumBetween10And20(2, 6)); // false

//        System.out.println(isPositive(5)); // true
//        System.out.println(isPositive(-3)); // false

//        printString("abcd", 5); // abcdabcdabcdabcdabcd

//        System.out.println(isLeapYear(2100)); // false
//        System.out.println(isLeapYear(2112)); // true
//        System.out.println(isLeapYear(2044)); // true
//        System.out.println(isLeapYear(2003)); // false


//        System.out.println(Arrays.toString(createArray(5, 6)));
//        System.out.println(Arrays.toString(createArray(5, 1)));
//        System.out.println(Arrays.toString(createArray(6, 99)));

        //1.
//        int[] array2 = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
//        System.out.println(Arrays.toString(changeOneZero (array2)));  //[0, 0, 1, 1, 0, 1, 0, 0, 1, 1]
        //2.
//        int[] array1 = { 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 };
//        System.out.println(Arrays.toString(beforeSix (array1)));  //[6, 30, 18, 12, 11, 24, 30, 12, 24, 8, 9, 6]
        //3.
        int[][] array = new int[4][4]; // [[1, 0, 0, 0], [0, 1, 0, 0], [0, 0, 1, x], [0, 0, 0, 1]]
        int x = array[2][3];

        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array[i].length; j++){
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }


    }






    /**
     * 1. Написать метод, принимающий на вход два целых числа и проверяющий,
     * что их сумма лежит в пределах от 10 до 20 (включительно), если да – вернуть true, в противном случае – false.
     */
    private static boolean isSumBetween10And20(int a, int b) {
        if (10 <= (a + b) && (a + b) <= 20) {
            return true;
            // проверить, что сумма a и b лежит между 10 и 20
        }
        return false;
    }

    private static boolean isPositive(int x) {
        if (x >= 0) {
            return true;
            // проверить, что х положительное
        }
        return false;
    }

    private static void printString(String source, int repeat) {
        for (int i = 0; i < repeat; i++){
            System.out.println("source");
            // напечатать строку source repeat раз
        }
    }

    private static boolean isLeapYear(int year) {
        if (year % 4 == 0){
            if (year % 100 !=0) {
                return true;
                // проверить, является ли год високосным. если да - return true
                // год является високосным, если он делится на 4, но не делится на 100, но делится на 400
            }
        }
        return false;
    }

    private static int[] createArray(int len, int initialValue) {
        int[] arr = new int[len];
        for (int i = 0; i < len; i++) {
            arr[i] = initialValue;
        }
        // должен вернуть массив длины len, каждое значение которого равно initialValue
        return arr;
    }

/*
 * 1. Задать целочисленный массив, состоящий из элементов 0 и 1.
 * Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. С помощью цикла и условия заменить 0 на 1, 1 на 0;
 */
    private static int[] changeOneZero(int[] array) {
        for (int i = 0; i < array.length; i++){
            if (array[i] == 1) {
                array[i] = 0;
            }
            else {
                array[i] = 1;
            }
        }
        return array;

    }

 /*
 * 2. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньшие 6 умножить на 2;
 */

    private static int[] beforeSix(int[] array) {
        for (int i = 0; i < array.length; i++){
            if (array[i] < 6) {
                array[i] = array[i] * 6;
            }
        }
        return array;
    }


/*
 * 3. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
 * и с помощью цикла(-ов) заполнить его диагональные элементы единицами (можно только одну из диагоналей, если обе сложно).
 * Определить элементы одной из диагоналей можно по следующему принципу: индексы таких элементов равны, то есть [0][0], [1][1], [2][2], …, [n][n];
 * * Также заполнить элементы побочной диагонали
 * int [][] array = new int[4][4];
 *
 */
    public static int[][] OneOnDiag(int[][] array){
        int size = array.length;
        for (int i = 0; i < size; i++){
            array[i][i] = 1; //заполняем главную диагональ
            array[i][size-i-1] = 1; //заполняем вторую диагональ
        }
        return array;
    }
}
