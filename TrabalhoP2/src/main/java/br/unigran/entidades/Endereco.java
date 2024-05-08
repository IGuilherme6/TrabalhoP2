package br.unigran.entidades;

import lombok.Getter;
import lombok.Setter;

import java.io.Serial;

@Getter
@Setter
public class Endereco extends Funcionario{
    private Serial id;
    private String logradouro,cep,cidade_id;
}
