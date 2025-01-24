package com.example.jsfproject.repository;

import com.example.jsfproject.model.Url;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class UrlRepository {
    public static void main(String[]args){
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("Url");
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        Url url = new Url();
        url.setUrl("www.google.com");
        url.setUrlShort("www.goo.com");
        em.persist(url);
        em.getTransaction().commit();
        em.close();
        emf.close();

    }
}
