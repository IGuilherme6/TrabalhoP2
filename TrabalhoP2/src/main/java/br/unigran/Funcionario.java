package br.unigran;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class Funcionario {

    private String nome,endereco,sexo,email,dataAdmissao,cargo,funcao,cpf,telefone;
    private Date dataNascimento;
    double salario;

}
