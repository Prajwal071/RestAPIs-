package com.prajwal.RestApp.controller;

import com.prajwal.RestApp.dto.Person;
import com.prajwal.RestApp.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api")
public class TinderController {
    @Autowired
    PersonService personService;

    @GetMapping("/getPersons")
    public List<Person> getAllPerson()
    {
        List<Person> allData= personService.getAllData();
        List<Person> filterData= personService.FilterAllDataBaseOnGen(allData);
        return filterData;
    }

    @PostMapping("/create-person")
    public Person CreatePerson(@RequestBody Person person)
    {
       return person;
    }

}
