package br.unigran;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.List;

@Getter
@Setter

public class Produtos {

    private Integer cod_Prod;
    private String nome;
    private Validade dataValidade;
    private String marca;
    private String categoria;
    private String fornecedor;
    private Double precoProduto;
    private Double precoVenda;
    private Integer quantRecebida;
    private Integer quant_min_estoque;

    public void CadastrarProduto(){

    }

    public void AlterarProduto(){

    }

    public List listarProduto(){
        return null;
    }

    public void BuscarProduto(){

    }

}
