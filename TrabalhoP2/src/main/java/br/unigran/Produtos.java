package br.unigran;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter

public class Produtos {
    private Integer id;
    private String nome;
    private Date dataValidade;
    private String marca;
    private String categoria;
    private String fornecedor;
    private Double precoProduto;
    private Double precoVenda;
    private Integer quantRecebida;
    private Integer quant_min_estoque;

}
