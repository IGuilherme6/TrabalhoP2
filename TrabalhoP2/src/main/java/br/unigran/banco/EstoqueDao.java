package br.unigran.banco;

import br.unigran.entidades.Estoque;

import java.io.Serializable;
import java.util.List;

public class EstoqueDao implements Serializable {
    Dao dao= new Dao();
    public void Salvar(Object o){
        dao.salvar(o);
    }
    public void Remover(Object o){
        dao.remover(o);
    }
    public List<Estoque> Listar(){
        return (List<Estoque>) dao.listar(Estoque.class);
    }
}
