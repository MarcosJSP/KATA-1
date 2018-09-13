package kata.pkg1;
import java.time.LocalDate;
import java.time.Month;

public class Kata1 {
    public static void main(String [] args){
        LocalDate birthday = LocalDate.of(1998, Month.DECEMBER, 18);
        Person pedro = new Person("Pedro", birthday);
        System.out.println(pedro.getName() + " tiene " + pedro.getAge() + " años");
    }
}