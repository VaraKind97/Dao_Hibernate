package ru.netology.dao_hibernate.repository;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;

import java.util.List;

@org.springframework.stereotype.Repository
public class Repository {

    @PersistenceContext
    private EntityManager entityManager;

    public List getPersonByCity(String city) {
        Query query = entityManager.createQuery("select p from Person p where p.city = :city");
        query.setParameter("city", city);
        return query.getResultList();
    }
}