package br.unigran.entidades;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serial;
import java.util.Date;

@Getter
@Setter
public class Registro extends Login{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Serial id;
    private Date dataAcessoEntrada,dataEntradaProduto,dataAcessoSaida,dataSaidaProduto;
    private String login_id;
}
