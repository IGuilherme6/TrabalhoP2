package br.unigran.entidades;

import lombok.Getter;
import lombok.Setter;

import java.io.Serial;
import java.util.Date;

@Getter
@Setter
public class Registro extends Login{
    private Serial id;
    private Date dataAcessoEntrada,dataEntradaProduto,dataAcessoSaida,dataSaidaProduto;
    private String login_id;
}
