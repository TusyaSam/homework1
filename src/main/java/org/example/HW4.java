package org.example;
import java.util.ArrayList;
import java.util.List;

public class HW4 {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        String input = "";
        while (!input.equals("exit")) {
            // Читаем строку из стандартного входа
            input = System.console().readLine();
            if (input.equals("print")) {
                for (int i = strings.size() - 1; i >= 0; i--) {
                    System.out.println(strings.get(i));
                }
            } else if (input.equals("revert")) {
                if (!strings.isEmpty()) {
                    strings.remove(strings.size() - 1);
                }
            } else {
                strings.add(input);
            }
        }
    }
}
