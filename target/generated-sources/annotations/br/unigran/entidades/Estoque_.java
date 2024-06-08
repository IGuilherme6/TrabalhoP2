package br.unigran.entidades;

import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2024-06-08T16:44:59", comments="EclipseLink-2.7.12.v20230209-rNA")
@StaticMetamodel(Estoque.class)
public class Estoque_ { 

    public static volatile SingularAttribute<Estoque, Long> estoqueAtual;
    public static volatile SingularAttribute<Estoque, Long> quantidadeSaida;
    public static volatile SingularAttribute<Estoque, Long> quantidadeEntrada;
    public static volatile SingularAttribute<Estoque, Integer> id;
    public static volatile SingularAttribute<Estoque, Long> estoqueAnterior;

}