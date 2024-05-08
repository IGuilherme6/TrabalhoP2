package br.unigran.entidades;

import lombok.Getter;
import lombok.Setter;

import java.io.Serial;
import java.util.ArrayList;
import java.util.Date;

@Getter
@Setter
public class Funcionario {
    private Serial id,loginId;
    private String nomeCompleto,cpf,sexo,email,dataAdmissao,cargo,funcao,endereco;
    private Date dataNascimento;
    double salario;

    public void Cadastrar(){}
    public void Alterar(){}
    public void EfetuaLogin(){}
    public void Permissao(){}
    public ArrayList Listar(){return null;}
    public void Buscar(){}

}
