package br.unigran.entidades;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serial;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Getter
@Setter

@Entity
public class Produtos implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "nome")
    private String nome;
    @Column(name = "dataValidade")
    private Date dataValidade;
    @Column(name = "marca")
    private String marca;
    @Column(name = "categoria")
    private String categoria;
    @Column(name = "fornecedor")
    private String fornecedor;
    @Column(name = "precoProduto")
    private Double precoProduto;
    @Column(name = "precoVenda")
    private Double precoVenda;
    @Column(name = "quantRecebida")
    private Integer quantRecebida;
    @Column(name = "quant_min_estoque")
    private Integer quant_min_estoque;




}
