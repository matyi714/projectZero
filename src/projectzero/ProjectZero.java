package projectzero;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ProjectZero {

    public static List<Person> al = new ArrayList<>();
    public static List<Person> ch = new ArrayList<>();

    public static void main(String[] args) {
        try {
            al = Reader.read();
        } catch (FileNotFoundException ex) {
            System.out.println("File not found");
        }
        al.sort(new nameCoparator());
        for (int i = 0; i < 10; i++) {
            System.out.println("##");
        }
        ch = Filter.cityFilter("Chicago", al);
        chicagoPeople();
    }

    public static void chicagoPeople() {
        for (Person person : ch) {
            System.out.print(person.getName()); 
            System.out.println(person.getEmail());

        }
    }
    
    public static void printPersonsFromCity() throws FileNotFoundException {
        System.out.println("Kérem adjon meg egy várost:");
        
        Scanner sc = new Scanner(System.in);
        
        String city = sc.nextLine();
        
        List<Person> persons = Filter.cityFilter(city, Reader.read());
        
        if (persons.isEmpty()) {
            System.out.println("Ebben a városban lakó emberről nincs adatunk!");
        }
        else {
            System.out.println("Az ebben a városban lakó emberek:");
            for (Person person : persons) {
                System.out.println(person.getName());
            }
        }
    }

}
