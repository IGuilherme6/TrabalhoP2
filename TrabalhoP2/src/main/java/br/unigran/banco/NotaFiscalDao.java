package br.unigran.banco;

import br.unigran.entidades.NotaFiscal;

import java.util.List;

public class NotaFiscalDao{
    Dao dao= new Dao();
    public void Salvar(Object o){
        dao.salvar(o);
    }
    public void Remover(Object o){
        dao.remover(o);
    }
    public List<NotaFiscal> Listar(){
        return (List<NotaFiscal>) dao.listar(NotaFiscal.class);
    }
}
