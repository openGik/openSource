import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Kolya on 28.07.2018.
 *
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
    private String name , lastname , surname , number , job , email;
    private double zp , value;
    private int age ;
    Person(){
        this.name = "fedor";
        this.surname = "ladinov";
        this.lastname = "petrovich";
        this.number = "8-916-254-98-36";
        this.job ="ingener";
        this.zp = 125666.23;
        this.age = 45;
    }
    Person(String name ,String surname , String lastname , String number , String job ,String email , double zp , int age){
        this.name = name;
        this.surname = surname;
        this.lastname = lastname;
        this.number = number;
        this.job =job;
        this.email = email;
        this.zp = zp;
        this.age = age;
    }


    private String proverkaUsl(String usl){
        String result ="" ;
        char znak[] = {'>', '<' , '='};
        boolean flag = false;
        int size_usl =usl.length();
        if(usl!="") {
            for (int i = 1; i < size_usl; i++)
                result += usl.charAt(i);
            value = new Double(result);
            result = "";

            for (int i = 0; i < size_usl; i++) {
                if (znak[0] != usl.charAt(0) && !flag && i != size_usl) {
                    for (int j = 1; j < znak.length; j++) {
                        if (znak[j] == usl.charAt(i)) {
                            result += znak[j];
                            flag = true;
                            break;
                        }
                    }
                } else {
                    result += znak[0];
                    flag = true;
                    break;
                }
                if (flag)
                    break;


            }
        }
        return  result;
    }
    public void printPersonAgeUsl(String usl){
       switch(proverkaUsl(usl)){
           case ">":
               if(age>value)
               printPersonAll();
               break;
           case "<":
               if(age<value)
                   printPersonAll();
               break;
           case "=":
               if(age==value)
                   printPersonAll();
               break;
            default:
                printPersonAll();
                break;

       }
    }

    public void printPersonAll(){
        System.out.println(name+" "+surname+" "+lastname+" "+number+" "+job+" "+email+" "+zp+" "+age);
    }
}
