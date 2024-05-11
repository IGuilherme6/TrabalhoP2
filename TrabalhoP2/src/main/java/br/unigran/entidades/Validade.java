package br.unigran.entidades;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serial;
import java.util.Date;
import java.util.List;

@Getter
@Setter
@Entity
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
