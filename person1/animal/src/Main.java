/**
 * Created by Kolya on 28.07.2018.
 */
public class Main {
    public static void main(String[] args){
    Cat cat = new Cat("barsic",13);
        Cat cat1 = new Cat("vov",20);
        Cat cat2 = new Cat("plushka",34);
    Dog dog = new Dog();
    dog.speed();
    cat.speed();
    cat.info_animal_cat();
        cat1.info_animal_cat();
        cat2.info_animal_cat();
    System.out.print(cat.run());
        }
}
