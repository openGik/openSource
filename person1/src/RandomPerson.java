import java.util.Random;

/**
 * Created by Kolya on 30.07.2018.
 */
public class RandomPerson {
    private String name[]={"fedor" , "petr" , "vania" , "gena" , "igor"} ,
            lastname[] = {" petrov" , "ivanov" , "stavruchenko" , "jorin" , "buhtin"} ,
            surname[] = {"ivanovich" , "sidorovich" , "gennadievich" , "chehovich" , "jorovich"} ,
            number[] = {" 8-907-999-98-89 ", "8-999-909-99-99" ," 8-495-495-48-48 ", "8-903-237-22-33"} ,
            job[] = {"ingener ","mihanik "," voditel" , "partnoy"};
    private double zp[] ={90000 , 9000 , 83222 , 8888888 , 50000 , 63277 , 34000} ;
    private int age[] ={34,56,67,79,23,35,21,89,76,54,43,32,90} ;
    private Random rand = new Random();
    public Person[] create(int kol){
        Person pers[] = new Person[kol];
        for(int i = 0 ; i < kol ; i++){
            pers[i] = new Person(name[rand.nextInt(Math.abs(name.length-1))] ,
                    surname[rand.nextInt(Math.abs(surname.length-1))] ,
                    lastname[rand.nextInt(Math.abs(lastname.length-1))]
                    , number[rand.nextInt(Math.abs(number.length-1))] ,
                    job[rand.nextInt(Math.abs(job.length-1))] ,
                    zp[rand.nextInt(Math.abs(zp.length-1))] ,
                    age[rand.nextInt(Math.abs(age.length-1))]);
        }
        return pers;
    }
}
