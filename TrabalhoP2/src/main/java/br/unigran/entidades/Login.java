package br.unigran.entidades;

import lombok.Getter;
import lombok.Setter;

import java.io.Serial;
@Getter
@Setter
public class Login extends Funcionario{
    private Serial id;
    private String nomeLogin, senha, funcionario_id,estoque_id;
}
