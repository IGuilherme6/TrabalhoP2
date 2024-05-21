package br.unigran.banco;

import br.unigran.entidades.Funcionario;
import br.unigran.entidades.Registro;

import java.util.List;

public class RegistroDao {
    Dao dao= new Dao();
    public void Salvar(Object o){
        dao.salvar(o);
    }
    public void Remover(Object o){
        dao.remover(o);
    }
    public List<Registro> Listar(){
        return (List<Registro>) dao.listar(Registro.class);
    }
}
