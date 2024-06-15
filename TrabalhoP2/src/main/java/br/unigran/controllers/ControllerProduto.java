package br.unigran.controllers;

import br.unigran.banco.FuncionarioDao;
import br.unigran.banco.ProdutosDao;
import br.unigran.entidades.Entrada;
import br.unigran.entidades.Funcionario;
import br.unigran.entidades.Produtos;
import br.unigran.telas.EntradaProduto;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;

import javax.persistence.EntityManager;
import java.util.List;


public class ControllerProduto {
    public void CadastrarProduto(Produtos produtos){
        ProdutosDao produtosDao = new ProdutosDao();
        produtosDao.Salvar(produtos);
    }

    public Boolean AlterarProduto(Integer quant, Integer codBarra, int i){
        ProdutosDao produtosDao = new ProdutosDao();
        List<Produtos> produtosList = produtosDao.Listar();
        if(i == 1) {
            for (Produtos produtos : produtosList) {
                if (produtos.getCod_barra().equals(codBarra)) {
                    Integer quantAtual = produtos.getQuantRecebida() + quant;
                    produtos.setQuantRecebida(quantAtual);
                    produtosDao.Alterar(produtos);
                    return true;
                }
            }
        }
        for (Produtos produtos : produtosList) {
            if (produtos.getCod_barra().equals(codBarra)) {
                if (produtos.getQuantRecebida() < quant) {
                    return false;
                }
                Integer quantAtual = produtos.getQuantRecebida() - quant;
                produtos.setQuantRecebida(quantAtual);
                produtosDao.Alterar(produtos);
                return true;
            }
        }
        return false;

    }


    public List<Produtos> BuscarProduto(){
        ProdutosDao produtosDao = new ProdutosDao();
       return produtosDao.Listar();
    }

    public JRBeanCollectionDataSource listaProdutosJRDataSource(){
        List<Produtos> produtosList = BuscarProduto();
        JRBeanCollectionDataSource dataSource = new JRBeanCollectionDataSource(produtosList);
        return dataSource;
    }


}
