package br.unigran;

import lombok.Getter;
import lombok.Setter;

import java.io.Serial;

@Getter
@Setter
public class Cidade extends Endereco{
    private Serial id;
    private String nome_cidade, id_estado;
}
