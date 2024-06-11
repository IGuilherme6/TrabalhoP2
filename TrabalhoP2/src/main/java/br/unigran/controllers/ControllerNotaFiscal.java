package br.unigran.controllers;

import br.unigran.banco.NotaFiscalDao;
import br.unigran.banco.ProdutosDao;
import br.unigran.entidades.NotaFiscal;
import br.unigran.entidades.Produtos;

public class ControllerNotaFiscal {
    public void CadastrarNotaFiscal(NotaFiscal notaFiscal){
       NotaFiscalDao notaFiscalDao= new NotaFiscalDao();
        notaFiscalDao.Salvar(notaFiscal);
    }
}
