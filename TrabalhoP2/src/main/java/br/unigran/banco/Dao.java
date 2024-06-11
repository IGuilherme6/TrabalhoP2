package br.unigran.banco;

import br.unigran.entidades.Produtos;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.List;

public class Dao {
    private EntityManagerFactory emf;

    public Dao() {
        emf = Persistence.createEntityManagerFactory("br.unigran_TrabalhoP2_jar_1.0-SNAPSHOTPU");
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
        List<?> entities = em.createQuery("SELECT e FROM " + entityClass.getSimpleName() + " e", entityClass).getResultList();
        em.close();
        return entities;
    }

    public void AlterarProduto(Object o) {
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        em.merge(o);
        em.getTransaction().commit();
        em.close();
    }
}