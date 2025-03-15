package com.prajwal.RestApp.service;

import com.prajwal.RestApp.dto.Person;

import java.util.List;

public interface PersonService {
    List<Person> getAllData();

    List<Person> FilterAllDataBaseOnGen(List<Person> person);
}
