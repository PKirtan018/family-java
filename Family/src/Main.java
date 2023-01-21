import Model.Child;
import Model.Hobbies;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Hobbies> c1hobbies = new ArrayList<Hobbies>();
        Hobbies hub1 = new Hobbies("Cricket");
        Hobbies hub2 = new Hobbies("Football");


        c1hobbies.add(hub1);
        c1hobbies.add(hub2);
        Child c1 = new Child("arjay",c1hobbies,14);

        c1.listHobbies();
        c1.getfullName();
    }
}