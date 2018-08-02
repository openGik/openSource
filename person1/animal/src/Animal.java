import java.util.Random;

/**
 * Created by Kolya on 01.08.2018.
 *
 *
 *
 * 1. Создать классы Собака и Кот с наследованием от класса Животное.
 2. Животные могут выполнять действия: бежать, плыть, перепрыгивать препятствие. В качестве параметра каждому методу передается величина, означающая или длину препятствия (для бега и плавания), или высоту (для прыжков).
 3. У каждого животного есть ограничения на действия (бег: кот 200 м., собака 500 м.; прыжок: кот 2 м., собака 0.5 м.; плавание: кот не умеет плавать, собака 10 м.).
 4. При попытке животного выполнить одно из этих действий, оно должно сообщить результат в консоль. (Например, dog1.run(150); -> результат: run: true)
 5. * Добавить животным разброс в ограничениях. То есть у одной собаки ограничение на бег может быть 400 м., у другой 600 м.
 */
public class Animal{
   protected String name;
    protected int age;
    protected boolean flag_swim = false , flag_speed = false , flag_jump = false;
    protected final int speed_size_max = new Random().nextInt(1000);
    protected  int swing_size_max = 0 ;
    protected final int  jump_size_max = new Random().nextInt(50);
    protected int speed , swing , jump;
    Animal(String name){
        this.name = name;

    }
    Animal(){}
    protected   void speed(){
        speed = new Random().nextInt(1000);
        if(speed<speed_size_max)
            flag_speed = true;
     };
    protected void swing(){
        swing = new Random().nextInt(1000);
        if(swing<swing_size_max)
            flag_swim = true;
     };
    protected  void jump(){
        jump = new Random().nextInt(1000);
        if(jump<jump_size_max)
            flag_jump = true;
     };
    protected void info_animal(){
        System.out.println(name+" age "+age+"  speed "+speed_size_max+" swim "+swing_size_max+" jump "+jump_size_max);
    }
    protected boolean run(){
        if(flag_speed||flag_jump||flag_swim){
            if(flag_jump){
                System.out.println("jump");
                flag_jump = false;
            }
            else if(flag_speed){
                System.out.println("speed");
                flag_speed = false;
            }
            else{
                System.out.println("swim");
                flag_swim = false;
            }
            return true;
        }


        return false;
    }
}
