package br.unigran.entidades;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serial;
import java.util.ArrayList;

@Getter
@Setter
@Entity
public class Estoque {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "estoqueAtual")
    private Long estoqueAtual;
    @Column(name = "estoqueAnterior")
    private Long estoqueAnterior;
    @Column(name = "quantidadeSaida")
    private Long quantidadeSaida;
    @Column(name = "quantidadeEntrada")
    private Long quantidadeEntrada;

    public void Acessar(){
    }
    public void Entrada(){
    }
    public void Buscar(){
    }
    public void Saida(){}
    public ArrayList Listar(){
        return null;
    }

}
