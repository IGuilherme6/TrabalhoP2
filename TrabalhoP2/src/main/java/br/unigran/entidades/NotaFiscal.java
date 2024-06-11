package br.unigran.entidades;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter

@Entity
public class NotaFiscal {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer notaFiscal;
    @Column(name = "Produto")
    private String nome_produto;

}
