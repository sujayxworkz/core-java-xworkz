package com.xworkz.bookmyshow.EntityManagerFactory;

import javax.persistence.EntityManagerFactory;

public class Executer {

    public static void main(String[] args) {


        EntityManagerFactory entityManagerFactory = EntityManagerFactorySingleton.getFactory();
        System.out.println(entityManagerFactory);

        EntityManagerFactory entityManagerFactory1 = EntityManagerFactorySingleton.getFactory();
        System.out.println(entityManagerFactory1);

    }

}
