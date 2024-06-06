package br.unigran.banco;

import br.unigran.entidades.Entrada;
import br.unigran.entidades.Funcionario;

import java.io.Serializable;
import java.util.List;

public class EntradaDao implements Serializable {
    Dao dao= new Dao();
    public void Salvar(Object o){
        dao.salvar(o);
    }
    public void Remover(Object o){
        dao.remover(o);
    }
    public List<Entrada> Listar(){
        return (List<Entrada>) dao.listar(Entrada.class);
    }
}
