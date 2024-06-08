package br.unigran.dto;

import javax.persistence.Column;
import java.io.Serial;
import java.io.Serializable;
import java.util.Date;

public class DTOproduto extends DTO implements Serializable {
    private String id;
    private String nome;
    private Date dataValidade;
    private String marca;
    private String categoria;
    private String fornecedor;
    private Double precoProduto;
    private Double precoVenda;
    private Integer quantRecebida;
    private Integer quant_min_estoque;

    @Override
    public Object builder() {
        return null;
    }
}
