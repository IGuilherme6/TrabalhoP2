package br.unigran.banco;
import br.unigran.entidades.Produtos;

import java.io.Serializable;
import java.util.List;

public class ProdutosDao implements Serializable {
    Dao dao= new Dao();
    public void Salvar(Object o){
        dao.salvar(o);
    }
    public void Remover(Object o){
        dao.remover(o);
    }
    public List<Produtos> Listar(){
        return (List<Produtos>) dao.listar(Produtos.class);
    }
}
