package com.prajwal.RestApp.service.impl;

import com.prajwal.RestApp.dto.Person;
import com.prajwal.RestApp.service.PersonService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service

public class PersonServiceImpl implements PersonService {

    Person amit=new Person("Amit","Bhopal","M",20,"B.tech");

    Person vijay=new Person("Vijay","Bhopal","M",21,"BCA");

    Person akash=new Person("Akash","Nagpur","M",22,"B.tech");

    Person priya=new Person("Priya","Jabalpur","F",20,"B.com");

    Person anjali=new Person("Anjali","Indore","F",19,"B.tech");

    List<Person> person=new ArrayList<>();

    String userGender;

    @Value("${user.gender}")

    @Override
    public List<Person> getAllData() {

        person.add(amit);
        person.add(vijay);
        person.add(akash);
        person.add(priya);
        person.add(anjali);

        return person;
    }

    @Override
    public List<Person> FilterAllDataBaseOnGen(List<Person> person) {
        List<Person> per =new ArrayList<>();
        for (Person obj : person)
        {
            if (!userGender.equalsIgnoreCase(obj.getGender()))
            {
                per.add(obj);
            }
        }
        return per;
    }
}
