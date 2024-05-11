package br.unigran.entidades;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serial;
@Getter
@Setter
@Entity
public class Login extends Funcionario{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Serial id;
    @Column(name = "nomeLogin")
    private String nomeLogin;
    @Column(name = "senha")
    private String senha;
    @Column(name = "funcionario_id")
    private String funcionario_id;
    @Column(name = "estoque_id")
    private String estoque_id;
}
