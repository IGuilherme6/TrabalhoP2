package br.unigran.banco;

import br.unigran.entidades.Funcionario;
import br.unigran.entidades.Saida;

import java.io.Serializable;
import java.util.List;

public class SaidaDao implements Serializable {
    Dao dao= new Dao();
    public void Salvar(Object o){
        dao.salvar(o);
    }
    public void Remover(Object o){
        dao.remover(o);
    }
    public List<Saida> Listar(){
        return (List<Saida>) dao.listar(Saida.class);
    }
}
