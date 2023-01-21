package Model;

import java.util.ArrayList;

public class Child extends Parent {
    public String Firstname;
    public ArrayList<Hobbies>hobbies;
    public int age;

    public String getFirstname() {
        return Firstname;
    }

    public void setFirstname(String firstname) {
        Firstname = firstname;
    }

    public ArrayList<Hobbies> getHobbies() {
        return hobbies;
    }

    public void setHobbies(ArrayList<Hobbies> hobbies) {
        this.hobbies = hobbies;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Child(String firstname, ArrayList<Hobbies> hobbies, int age) {
        Firstname = firstname;
        this.hobbies = hobbies;
        this.age = age;
    }

    public void getfullName(){
        System.out.println(this.Firstname);
    }

    public  void listHobbies(){
        for( Hobbies st: this.hobbies){
            System.out.println(st.getHobbies());
        }
    }

}

