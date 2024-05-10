package br.unigran.entidades;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

@Getter
@Setter
@Entity
public class Entrada {


    @Id
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
