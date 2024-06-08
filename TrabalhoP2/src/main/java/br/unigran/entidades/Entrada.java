package br.unigran.entidades;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Getter
@Setter
@Entity
public class Entrada implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Double id;
    @Column(name = "notaFiscal_Associada")
    private String notaFiscal_Associada;
    @Column(name = "sessao")
    private String sessao;
    @Column(name = "dataEntrada")
    private Date dataEntrada;

}
