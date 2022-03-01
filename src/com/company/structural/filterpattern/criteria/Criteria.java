package com.company.structural.filterpattern.criteria;

import com.company.structural.filterpattern.Person;

import java.util.List;

public interface Criteria {
    public List<Person> meetCriteria(List<Person> persons);
}
