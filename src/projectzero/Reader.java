package projectzero;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import projectzero.Person;

public class Reader {
	public static List<Person> read() throws FileNotFoundException {
		Scanner sc = new Scanner(new File("us-500.csv"));
		List<Person> persons = new ArrayList<>();
		
		sc.nextLine();
		
		while (sc.hasNext()) {
			String[] line = sc.nextLine().split(",");
			String firstName= line[0];
			String lastName = line[1];

			String city = line[4];
			String email = line[10];
			
			persons.add(new Person(firstName + " " + lastName, city, email));
		}
                
                return persons;
	}
}