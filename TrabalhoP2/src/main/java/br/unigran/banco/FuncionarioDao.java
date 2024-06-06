package br.unigran.banco;
import br.unigran.entidades.Funcionario;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import java.io.Serializable;
import java.util.List;
public class FuncionarioDao implements Serializable {
    Dao dao = new Dao();
    private EntityManagerFactory emf = Persistence.createEntityManagerFactory("meuPU");

    public void Salvar(Object o) {
        dao.salvar(o);
    }

    public void Remover(Object o) {
        dao.remover(o);
    }

    public List<Funcionario> Listar() {
        return (List<Funcionario>) dao.listar(Funcionario.class);
    }

    public boolean isCpfAlreadyRegistered(String cpf) {
        EntityManager em = emf.createEntityManager();
        try {
            TypedQuery<Long> query = em.createQuery("SELECT COUNT(f) FROM Funcionario f WHERE f.cpf = :cpf", Long.class);
            query.setParameter("cpf", cpf);
            Long count = query.getSingleResult();
            return count > 0;
        } finally {
            em.close();
        }
    }
}
