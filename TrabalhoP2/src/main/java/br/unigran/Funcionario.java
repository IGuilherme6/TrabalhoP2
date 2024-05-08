package br.unigran;

import lombok.Getter;
import lombok.Setter;

import java.io.Serial;
import java.util.Date;

@Getter
@Setter
public class Funcionario {
    private Serial id,loginId;
    private String nomeCompleto,cpf,sexo,email,dataAdmissao,cargo,funcao,endereco;
    private Date dataNascimento;
    double salario;
}
