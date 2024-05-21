package br.unigran.banco;
import br.unigran.entidades.Funcionario;

import java.util.List;
public class FuncionarioDao {
    Dao dao= new Dao();
    public void Salvar(Object o){
        dao.salvar(o);
    }
    public void Remover(Object o){
        dao.remover(o);
    }
    public List<Funcionario> Listar(){
        return (List<Funcionario>) dao.listar(Funcionario.class);
    }
}
