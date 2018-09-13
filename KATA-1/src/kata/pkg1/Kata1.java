package kata.pkg1;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Kata1 {
    public static void main(String [] args){        
        Calendar birthday = GregorianCalendar.getInstance();
        birthday.set(1998, 11, 18);
        
        Person pedro = new Person("Pedro", birthday);
        System.out.println(pedro.getName() + " tiene " + pedro.getAge() + " años");
    }
}