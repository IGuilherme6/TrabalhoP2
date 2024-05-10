package br.unigran.entidades;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serial;

@Getter
@Setter
@Entity
public class Cod_Barra extends Estoque{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Serial id;
    @Column(name = "tipo")
    private String tipo;
    @Column(name = "estoque_id")
    private String estoque_id;
}
