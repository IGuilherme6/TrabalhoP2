package br.unigran.entidades;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serial;
import java.util.Date;
import java.util.List;

@Getter
@Setter
public class Validade {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Serial id;
    @Column(name = "dataFabricacao")
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
