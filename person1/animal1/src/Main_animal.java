/**
 * Created by Kolya on 28.07.2018.
 */
public class Main_animal {
    public static void main(String[] args){
    Cat cat = new Cat("barsic",13);
        Dog dog = new Dog("puh",17);
        dog.info_animal();
        dog.info_animal_dog();
        cat.info_animal();
        cat.info_animal_cat();
        }
}
