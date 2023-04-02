package org.example;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class HW2 {

    public static void main(String[] args) {

        System.out.println(buildString(12, 'a', 'b'));
        System.out.println(buildString(10, 'f', 'o'));
        System.out.println(buildString(5, 'i', 'm'));

        /*
        2 Создать файл file.txt. Если файл уже создан, ничего делать не надо.
         Записать в файл слово TEXT 100 раз: TEXTTEXTTEXTTEXTTEXTTEXT...
         */

        try {
            // Создаем объект для работы с файлом
            File file = new File("file.txt");
            // Проверяем, существует ли файл
            if (file.exists()) {
                System.out.println("Файл уже существует.");
            } else {
                // Создаем новый файл
                file.createNewFile();
                System.out.println("Файл создан.");
            }

            // Открываем поток для записи в файл
            FileWriter writer = new FileWriter(file);
            // Пишем в файл слово TEXT 100 раз
            for (int i = 0; i < 100; i++) {
                writer.write("TEXT");
            }
            // Закрываем поток записи и файл
            writer.close();
            System.out.println("Слово TEXT записано в файл file.txt");
        } catch (IOException e) {
            System.out.println("Ошибка ввода-вывода");
        }
    }

    /*
        1 Дано четное число N (>0) и символы c1 и c2.
                Написать метод, который вернет строку длины N,
                 которая состоит из чередующихся символов c1 и c2,
                  начиная с c1.

        Пример. (n = 6, c1='a', c2='b') -> "ababab"
        (n = 8, c1='x', c2='y') -> "xyxyxyxy"

        */
    public static String buildString(int n, char c1, char c2) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                sb.append(c1);
            } else {
                sb.append(c2);
            }
        }
        return sb.toString();
    }
}

