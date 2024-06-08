package br.unigran.dto;

import java.io.Serializable;

public abstract class DTO implements Serializable {
    private String id;
    public abstract Object builder();
}
