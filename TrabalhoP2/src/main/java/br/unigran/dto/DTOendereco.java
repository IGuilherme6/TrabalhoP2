package br.unigran.dto;

import javax.persistence.Column;
import java.io.Serial;
import java.io.Serializable;

public class DTOendereco extends DTO implements Serializable {

    private Serial id;
    private String logradouro;
    private String cep;
    private String cidade_id;
    @Override
    public Object builder() {
        return null;
    }
}
