import java.util.Random;

/**
 * Created by Kolya on 01.08.2018.
 * * 1. Создать классы Собака и Кот с наследованием от класса Животное.
 2. Животные могут выполнять действия: бежать, плыть, перепрыгивать препятствие. В качестве параметра каждому методу передается величина, означающая или длину препятствия (для бега и плавания), или высоту (для прыжков).
 3. У каждого животного есть ограничения на действия (бег: кот 200 м., собака 500 м.; прыжок: кот 2 м., собака 0.5 м.; плавание: кот не умеет плавать, собака 10 м.).
 4. При попытке животного выполнить одно из этих действий, оно должно сообщить результат в консоль. (Например, dog1.run(150); -> результат: run: true)
 5. * Добавить животным разброс в ограничениях. То есть у одной собаки ограничение на бег может быть 400 м., у другой 600 м.
 */
public class Cat extends Animal {
    private int eat_fuul = 0;
    private boolean flag_eat = false;
Cat(String name , int age){
    super(name , age);
    eat_fuul = new Random().nextInt(20);
    if(eat_fuul<10)
        eat_fuul+=10;
}
    Cat(String name , int age , int eat){
        super(name , age);
        eat_fuul = eat;

    }
    public void speed() {
        super.speed();
    }

    public void swing() {
        super.swing();
    }

    public void jump() {
        super.jump();
    }

    public void info_animal_cat(){
        if(run())
            super.info_animal();
        else
            System.out.print("error");
    }
    public void eat(Eat eat_caposite){
        if (!eat_caposite.isFlag_no_fuul()&eat_caposite.getCaposite()>=eat_fuul) {
            eat_caposite.setCaposite(eat_caposite.getCaposite() - eat_fuul);
            System.out.println("кот наелся");
        }
        else if(eat_caposite.isFlag_no_fuul())
            System.out.println("еды нет");
        else
            System.out.println("не хватило еды");

    }

}
