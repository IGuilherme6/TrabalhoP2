package br.unigran.entidades;

import lombok.Getter;
import lombok.Setter;

import java.io.Serial;

@Getter
@Setter
public class Cod_Barra extends Estoque{
    private Serial id;
    private Tipo tipo;
    private String estoque_id;
}
