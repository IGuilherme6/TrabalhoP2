package br.unigran.entidades;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serial;
import java.util.ArrayList;
import java.util.Date;

@Getter
@Setter
@Entity
public class Funcionario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Double id;
    @Column(name = "nomeCompleto")
    private String nomeCompleto;
    @Column(name = "cpf")
    private String cpf;
    @Column(name = "sexo")
    private String sexo;
    @Column(name = "email")
    private String email;
    @Column(name = "dataAdmissao")
    private String dataAdmissao;
    @Column(name = "cargo")
    private String cargo;
    @Column(name = "funcao")
    private String funcao;
    @Column(name = "dataNascimento")
    private Date dataNascimento;
    @Column(name = "salario")
    double salario;

    public void Cadastrar(){}
    public void Alterar(){}
    public void EfetuaLogin(){}
    public void Permissao(){}
    public ArrayList Listar(){return null;}
    public void Buscar(){}

}
