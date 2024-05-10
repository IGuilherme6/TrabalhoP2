package br.unigran.entidades;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serial;

@Getter
@Setter
@Entity
public class Estado extends Cidade{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Serial id;
    @Column(name = "nomeEstado")
    private String nomeEstado;
    @Column(name = "siglaEstado")
    private String siglaEstado;
}
