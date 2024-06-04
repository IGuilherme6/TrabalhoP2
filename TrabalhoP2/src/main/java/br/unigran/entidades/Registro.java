package br.unigran.entidades;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serial;
import java.util.Date;

@Getter
@Setter
@Entity
public class Registro{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "dataAcessoEntrada")
    private Date dataAcessoEntrada;
    @Column(name = "dataEntradaProduto")
    private Date dataEntradaProduto;
    @Column(name = "dataAcessoSaida")
    private Date dataAcessoSaida;
    @Column(name = "dataSaidaProduto")
    private Date dataSaidaProduto;
}
