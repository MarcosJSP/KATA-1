package kata.pkg1;

import java.util.Date;

public class Kata1 {
    public static void main(String [] args){
        Person pedro = new Person("Pedro", new Date(98,11,18));
        System.out.println(pedro.getName() + " tiene " + pedro.getAge() + " años");
    }
}
