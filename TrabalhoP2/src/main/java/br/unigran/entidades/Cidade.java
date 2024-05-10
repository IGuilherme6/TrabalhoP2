package br.unigran.entidades;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serial;

@Getter
@Setter
@Entity
public class Cidade extends Endereco{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Serial id;
    @Column(name = "nome_cidade")
    private String nome_cidade;
    @Column(name = "id_estado")
    private String id_estado;
}
