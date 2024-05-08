package br.unigran.entidades;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class Entrada {

    private Date dataEntrada;
    private NotaFiscal notaFiscal_Associada;
    private String sessao;

    public void Login() {

    }

    public void EfetuarSaida() {

    }

    public void AlterarSaida() {

    }
}
