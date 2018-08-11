/**
 * Created by Kolya on 28.07.2018.
 */
public class Main_animal {
    public static void main(String[] args){
    Cat[] cat = new Cat[5];

            cat[0] = new  Cat("barsik",5 , 12);
            cat[1] = new  Cat("vasia",4 , 20);
            cat[2] = new  Cat("gor",9 , 14);
            cat[3] = new  Cat("fog",23 , 8);
            cat[4] = new  Cat("nok",12 , 5);
            Eat eat = new Eat(20);
                for(int i = 0 ; i<cat.length ; i++)
                    cat[i].eat(eat);
        }
}
