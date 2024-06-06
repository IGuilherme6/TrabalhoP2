package br.unigran.banco;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.io.Serializable;
import java.util.List;

public class Dao implements Serializable {
    private EntityManagerFactory emf;

    public Dao() {
        emf = Persistence.createEntityManagerFactory("minha-unidade-persistencia");
    }

    public void salvar(Object o) {
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        em.persist(o);
        em.getTransaction().commit();
        em.close();
    }

    public void remover(Object o) {
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        o = em.merge(o);
        em.remove(o);
        em.getTransaction().commit();
        em.close();
    }

    public List<?> listar(Class<?> entityClass) {
        EntityManager em = emf.createEntityManager();
        List<?> entities = em.createQuery("SELECT e FROM " + entityClass.getName() + " e", entityClass).getResultList();
        em.close();
        return entities;
    }
}