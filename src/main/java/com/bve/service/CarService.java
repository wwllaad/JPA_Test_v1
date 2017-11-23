package com.bve.service;

import com.bve.model.Car;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

public class CarService{

    public EntityManager entityManager = Persistence.createEntityManagerFactory("bve").createEntityManager();

    public Car add(Car car){
        entityManager.getTransaction().begin();
        Car carFromDB = entityManager.merge(car);
        entityManager.getTransaction().commit();
        return carFromDB;
    }
}