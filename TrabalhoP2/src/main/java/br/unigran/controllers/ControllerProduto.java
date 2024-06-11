package br.unigran.controllers;

import br.unigran.banco.ProdutosDao;
import br.unigran.entidades.Produtos;

import java.util.List;


public class ControllerProduto {
    public void CadastrarProduto(Produtos produtos){
        ProdutosDao produtosDao = new ProdutosDao();
        produtosDao.Salvar(produtos);
    }

    public void AlterarProduto(){

    }

    public List listarProduto(){
        return null;
    }

    public void BuscarProduto(){

    }
}
