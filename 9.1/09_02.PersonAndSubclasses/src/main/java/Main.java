import org.w3c.dom.ls.LSOutput;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Main {
    public static void printPersons(ArrayList<Person> persons){
        for (Person person : persons) {
            System.out.println(person);
        }
    }
    public static void main(String[] args) {
        // write your test code here
        ArrayList<Person> persons = new ArrayList<Person>();
        persons.add(new Teacher("Ada Lovelace", "24 Maddox St. London W1S 2QN", 1200));
      //  Teacher esko = new Teacher("Esko Ukkonen", "Mannerheimintie 15 00100 Helsinki", 5400);
      //  System.out.println(esko);
        persons.add(new Student("Ollie", "6381 Hollywood Blvd, Los Angeles 90028"));
    printPersons(persons);
    }
}
