package persons.gik;

import java.util.Vector;

/**
 * Created by Kolya on 28.07.2018.
 *
 * * Создать класс "Сотрудник" с полями: ФИО, должность, email, телефон, зарплата, возраст;
 * Конструктор класса должен заполнять эти поля при создании объекта;
 * Внутри класса «Сотрудник» написать метод, который выводит информацию об объекте в консоль;
 * Создать массив из 5 сотрудников
 Пример:
 Person[] persArray = new Person[5]; // Вначале объявляем массив объектов
 persArray[0] = new Person("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", "892312312", 30000, 30); // потом для каждой ячейки массива задаем объект
 persArray[1] = new Person(...);
 ...
 persArray[4] = new Person(...);

 * С помощью цикла вывести информацию только о сотрудниках старше 40 лет;
 */
public class Person {
private String name , surname , lastname , working , numbers ;
private double zp;
private int age;


Person(){
    name = "ivan";
    lastname = "ivanovich";
    surname = "ivanov";
    working = "programmist";
    numbers = "8-909-894-34-22";
    zp = 85222;
    age = 35;
}
}
