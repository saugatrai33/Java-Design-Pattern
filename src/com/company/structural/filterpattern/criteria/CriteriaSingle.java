package com.company.structural.filterpattern.criteria;

import com.company.structural.filterpattern.Person;

import java.util.ArrayList;
import java.util.List;

public class CriteriaSingle implements Criteria {
    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> personList = new ArrayList<>();
        for (Person person : persons) {
            if (person.getGender().equalsIgnoreCase("SINGLE")) {
                personList.add(person);
            }
        }
        return personList;
    }
}
