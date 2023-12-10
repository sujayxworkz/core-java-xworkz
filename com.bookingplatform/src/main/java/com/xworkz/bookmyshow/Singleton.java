package com.xworkz.bookmyshow;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Singleton {

    private static final EntityManagerFactory factory = Persistence.createEntityManagerFactory("com_xworkz");


//    private constructor to avoid client applications using the constructor
    private Singleton(){}
    public static EntityManagerFactory getFactory() {
        return factory;
    }
}
