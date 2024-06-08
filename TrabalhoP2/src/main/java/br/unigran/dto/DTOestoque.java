package br.unigran.dto;

import javax.persistence.Column;
import java.io.Serial;
import java.io.Serializable;

public class DTOestoque extends DTO implements Serializable {
    private String id;
    private Long estoqueAtual;
    private Long estoqueAnterior;
    private Long quantidadeSaida;
    private Long quantidadeEntrada;
    @Override
    public Object builder() {
        return null;
    }
}
