package projectzero;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

public class ProjectZero {

    public static List<Person> al = new ArrayList<>();
    public static List<Person> ch = new ArrayList<>();

    public static void main(String[] args) throws FileNotFoundException {
        al = Reader.read();
        al.sort(new nameCoparator());
        ch = Filter.cityFilter("Chicago", al);
        chicagoPeople();
    }

    public static void chicagoPeople() {
        for (Person person : ch) {
            System.out.println(person.getEmail());
        }
    }

}
