package br.unigran.entidades;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Getter
@Setter
@Entity
public class Entrada {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Double id;
    @Column(name = "notaFiscal_Associada")
    private String notaFiscal_Associada;
    @Column(name = "sessao")
    private String sessao;
    @Column(name = "dataEntrada")
    private Date dataEntrada;

    public void Login() {

    }

    public void EfetuarSaida() {

    }

    public void AlterarSaida() {

    }
}
