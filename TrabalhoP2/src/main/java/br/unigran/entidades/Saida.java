package br.unigran.entidades;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serial;
import java.util.Date;

@Getter
@Setter
public class Saida {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Serial id;
    @Column(name = "motivoSaida")
    private String motivoSaida;
    @Column(name = "dataSaida")
    private Date dataSaida;


    public void Login() {

    }

    public void EfetuarSaida() {

    }

    public void AlterarSaida() {

    }
}
