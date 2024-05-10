package br.unigran.entidades;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serial;

@Getter
@Setter
@Entity
public class Endereco extends Funcionario{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Serial id;
    @Column(name = "logradouro")
    private String logradouro;
    @Column(name = "cep",length = 9)
    private String cep;
    @Column(name = "cidade_id")
    private String cidade_id;
}
