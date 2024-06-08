package br.unigran.entidades;

import java.util.Date;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2024-06-08T16:44:59", comments="EclipseLink-2.7.12.v20230209-rNA")
@StaticMetamodel(Produtos.class)
public class Produtos_ { 

    public static volatile SingularAttribute<Produtos, String> marca;
    public static volatile SingularAttribute<Produtos, Double> precoVenda;
    public static volatile SingularAttribute<Produtos, Double> precoProduto;
    public static volatile SingularAttribute<Produtos, Date> dataValidade;
    public static volatile SingularAttribute<Produtos, String> categoria;
    public static volatile SingularAttribute<Produtos, String> nome;
    public static volatile SingularAttribute<Produtos, Integer> id;
    public static volatile SingularAttribute<Produtos, String> fornecedor;
    public static volatile SingularAttribute<Produtos, Integer> quantRecebida;
    public static volatile SingularAttribute<Produtos, Integer> quant_min_estoque;

}