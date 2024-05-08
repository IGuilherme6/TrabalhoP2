package br.unigran;

import lombok.Getter;
import lombok.Setter;

import java.io.Serial;

@Getter
@Setter
public class Estado extends Cidade{
    private Serial id;
    private String nomeEstado,siglaEstado;
}
