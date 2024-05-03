package br.unigran;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.List;

@Getter
@Setter
public class Validade {
    private Date dataFabricacao;

    public void calculaDataFabricacao(){

    }
    public Date ExibirDataVencimento(){
        return null;
    }
    public void alterar(){

    }
    public List Listar(){
        return null;
    }
}
