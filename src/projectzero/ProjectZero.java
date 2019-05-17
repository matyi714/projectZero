
package projectzero;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;


public class ProjectZero {

    
    public static void main(String[] args) throws FileNotFoundException {
        List<Person> al = new ArrayList<>();
        al = Reader.read();
        al.sort(new nameCoparator());
        List<Person> ch = Filter.cityFilter("Chicago", al);
        for (Person person : ch) {
            System.out.println(person.getEmail());
        }
    }

}
