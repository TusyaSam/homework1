package org.example;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

// java.io  java.nio non-blocking
public class FileDemo {

    public static void main(String[] args) {
        Path path = Path.of("file.txt"); // точка входа

        try {
            Files.createFile(path); //исключения Checked(проверяемые) и Unckecked(непроверяемые)
        } catch (IOException e) {

        }


        if (File.exists(path)) { // есть метод notexists - возвращает тру или фолс
            System.out.println(("Найден файл"));
        } else {
            System.out.println("Файл не найден");
        }

        if (Files.isRegularFile(path)) {
            System.out.println(("файл"));
        }
        if (Files.isDirectory(path)) {
            System.out.println(("директория"));

        }

    }
}