/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectzero;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Varga János
 */
public class Filter {
    public static List<Person> cityFilter(String city, List<Person> personList) {
        List<Person> personsFromCity = new ArrayList<>();
        
        for (Person person : personList) {
            if (person.getCity().equals(city)) {
                personsFromCity.add(person);
            }
        }
        
        return personsFromCity;
    }
}
