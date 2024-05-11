package br.unigran.entidades;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serial;
import java.util.Date;

@Getter
@Setter
@Entity
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
