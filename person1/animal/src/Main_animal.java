/**
 * Created by Kolya on 28.07.2018.
 */
public class Main_animal {
    public static void main(String[] args){
    Cat cat = new Cat("barsic",13);
        Cat cat1 = new Cat("vov",20);
        Cat cat2 = new Cat("plushka",34);
        Dog dog = new Dog("barsic",13);
        Dog dog1 = new Dog("vov",20);
        Dog dog2 = new Dog("plushka",34);
        dog.info_animal_dog();
        cat1.info_animal_cat();
        }
}
