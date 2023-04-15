package org.example;
//Создать класс Сотрудник (Employee).
//        У класса должны быть следующие поля:
//        1. Возраст (int)
//        2. Имя (String)
//        3. Фамилия (String)
//        4. Зарплата (double)
//        5. ... можно придумать свои поля
//
//        У класса должно быть 2 конструктора:
//        1. Конструктор, который принимает все аргументы
//        2. Констуктор, который принимает все аргументы КРОМЕ зарплаты; значение зарплаты должно быть задано значением по умолчанию (50.0)
//
//        Переопределить:
//        1. Методы equals и hashCode (поля, которые должны там участвовать, нужно определить самостоятельно)
//        2. Метод toString (в любом формате)
//
//        Реализовать методы:
//        String getFullName() - возвращает полное имя сотрудника
//        boolean olderThan(Employee e) - возвращает true, если текущий сотрудник старше чем тот, который передали в метод.
//        void upgrade(double salary) - повышает зарплату сотрудника НА salary единиц. Пример: Было 50.0, upgrade(20.0) -> стало 70.0
public class Employee {
    private int age;
    private String firstName;
    private String lastName;
    private double salary;
    private String position;
    public Employee(int age, String firstName, String lastName, double salary, String position) {
        this.age = age;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
        this.position = position;
    }

    public Employee(int age, String firstName, String lastName, String position) {
        this(age, firstName, lastName, 50.0, position);
    }

    public String getFullName() {
        return firstName + " " + lastName;
    }

    public boolean olderThan(Employee e) {
        return this.age > e.age;
    }

    public void upgrade(double salary) {
        this.salary += salary;
    }


    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Employee)) {
            return false;
        }
        Employee e = (Employee) obj;
        return this.age == e.age && this.firstName.equals(e.firstName) && this.lastName.equals(e.lastName);
    }


    public int hashCode() {
        int result = 17;
        result = 31 * result + age;
        result = 31 * result + firstName.hashCode();
        result = 31 * result + lastName.hashCode();
        return result;
    }


    public String toString() {
        return "Employee: " + firstName + " " + lastName + ", age " + age + ", position " + position + ", salary " + salary;
    }
}
