package org.example;

import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class HW5 {

    public static void main(String[] args) {
        System.out.println(isCorrectParentheses("()")); // true
        System.out.println(isCorrectParentheses("(")); // false
        System.out.println(isCorrectParentheses("())")); // false
        System.out.println(isCorrectParentheses("((()))")); // true
        System.out.println(isCorrectParentheses("()[]{}<>")); // true
        System.out.println(isCorrectParentheses("([)]")); // false
        System.out.println(isCorrectParentheses("][]")); // false
        System.out.println(isCorrectParentheses("[]{<()[]<>>}")); // true
    }

    /**
     * Дана последовательность скобочек. Проверить, что она является корректной.
     */
    static boolean isCorrectParentheses(String parentheses) {
        Deque<Character> stack = new LinkedList<>(); // создаем Deque (очередь)
        // проходимся по символам в выражении
        // создаем маппинг скобок
        Map<Character, Character> bracketMap = new HashMap<>();
        bracketMap.put('(', ')');
        bracketMap.put('[', ']');
        bracketMap.put('{', '}');
        bracketMap.put('<', '>');
        for (char c : parentheses.toCharArray()) {
            if (bracketMap.containsKey(c)) { // если встретили открывающуюся скобку
                stack.addFirst(c); // добавляем ее в начало очереди (Deque)
            } else if (bracketMap.containsValue(c)) { // если встретили закрывающую скобку
                if (!stack.isEmpty() && bracketMap.get(stack.pollFirst()) == c) { // если соответствующая открывающая скобка находится в очереди, удаляем ее из очереди и продолжаем обработку
                    continue;
                } else { // если соответствующая открывающая скобка не найдена, то возвращаем false (выражение невалидно)
                    return false;
                }
           }
        }
        return stack.isEmpty(); // если очередь пустая, значит все скобки были корректно закрыты (выражение валидно)
    }
}
