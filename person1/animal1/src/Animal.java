import java.util.Random;
import java.util.Vector;

/**
 * Created by Kolya on 01.08.2018.
 * 
 1. Расширить задачу про котов и тарелки с едой
 2. Сделать так, чтобы в тарелке с едой не могло получиться отрицательного количества еды (например, в миске 10 еды, а кот пытается покушать 15-20)
 3. Каждому коту нужно добавить поле сытость (когда создаем котов, они голодны). Если коту удалось покушать (хватило еды), сытость = true
 4. Считаем, что если коту мало еды в тарелке, то он ее просто не трогает, то есть не может быть наполовину сыт (это сделано для упрощения логики программы)
 5. Создать массив котов и тарелку с едой, попросить всех котов покушать из этой тарелки и потом вывести информацию о сытости котов в консоль
 6. Добавить в тарелку метод, с помощью которого можно было бы добавлять еду в тарелку
 */
public class Animal {
    protected String name;
    protected int age;
    protected boolean flag_swim = false, flag_speed = false, flag_jump = false;
    protected final int speed_size_max = new Random().nextInt(1000);
    protected int swing_size_max = 0;
    protected final int jump_size_max = new Random().nextInt(50);
    protected int speed, swing, jump;

    Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    Animal() {
    }

    protected void speed() {
        speed = new Random().nextInt(1000);
        if (speed < speed_size_max)
            flag_speed = true;
    }

    ;

    protected void swing() {
        swing = new Random().nextInt(1000);
        if (swing < swing_size_max)
            flag_swim = true;
    }

    ;

    protected void jump() {
        jump = new Random().nextInt(1000);
        if (jump < jump_size_max)
            flag_jump = true;
    }

    ;

    protected void info_animal() {
        System.out.println(name + " age " + age + "  speed " + speed_size_max + " swim " + swing_size_max + " jump " + jump_size_max);
    }

    protected boolean run() {
        final int ten_block = 10;
        int index , inform = 0;
        for (int i = 0; i < ten_block; i++) {
            index = new Random().nextInt(2);
            switch (index) {
                case 0:
                    speed();
                    if(speed>speed_size_max){
                    System.out.println(name+" пробежал "+ speed);
                        inform++;
                    }
                    else {
                        System.out.println(name+" не до бежал "+ speed);

                    }
                    break;
                case 1:
                    swing();
                    if(swing>swing_size_max){
                        System.out.println(name+" проплыл "+ swing);
                        inform++;
                    }
                    else {
                        System.out.println(name+" не до плыл "+ swing);

                    }
                    break;
                case 2:
                    jump();
                    if(jump>jump_size_max){
                        System.out.println(name+" перепрыгнул "+ jump);
                        inform++;
                    }
                    else {
                        System.out.println(name+" не до прыгнул "+ jump);

                    }
                    break;
                default:
                    break;
            }
        }
if(inform==ten_block)
return true;
        else return false;
    }
}

