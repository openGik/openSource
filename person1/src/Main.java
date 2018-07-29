/**
 * Created by Kolya on 28.07.2018.
 */
public class Main {
    public static void main(String[] args){
        Person[] pers;
        int kol_obj = 15;
        pers = new RandomPerson().create(kol_obj);
        for(int i = 0 ; i < kol_obj ; i++)
        pers[i].printPersonAgeUsl(">40");

    }
}
