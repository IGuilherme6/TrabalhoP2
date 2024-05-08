package br.unigran.entidades;

import lombok.Getter;
import lombok.Setter;

import java.io.Serial;
import java.util.ArrayList;

@Getter
@Setter
public class Estoque {
    private Serial id;
    private Long estoqueAtual,estoqueAnterior,quantidadeSaida,quantidadeEntrada;

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
