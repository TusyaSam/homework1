package org.example;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

/*
// java.io  java.nio non-blocking
public class FileDemo {

    public static void main(String[] args) throws IOException {
        Path path = Path.of("file.txt"); // точка входа

        Files.writeString(path, "my_content"); // записываем строку в файл
        String content = Files.readString(path); // вычитывает целиком  файл
        System.out.println(content);

        // InputStream OutputStream потоки, по которым мы читаем или записываем данные в файл



        try {
            Files.createFile(path); //исключения(это классы, как String) Checked(проверяемые) и Unckecked(непроверяемые)
        } catch (IOException e) {
//            e.getMessage()
//            e.fillInStackTrace() //
            System.out.println(("При создании произошла ошибка" + e.getMessage()));
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

 */