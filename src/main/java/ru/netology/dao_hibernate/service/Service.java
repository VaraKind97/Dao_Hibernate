package ru.netology.dao_hibernate.service;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.experimental.FieldDefaults;
import ru.netology.dao_hibernate.entity.Person;
import ru.netology.dao_hibernate.repository.Repository;

import java.util.List;

@FieldDefaults(level = AccessLevel.PRIVATE)
@AllArgsConstructor
@org.springframework.stereotype.Service
public class Service {
    Repository repository;

    public List<Person> getPersonByCity(String city) {
        return repository.getPersonByCity(city);
    }

}