package br.unigran.entidades;

import java.util.Date;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2024-06-08T16:44:59", comments="EclipseLink-2.7.12.v20230209-rNA")
@StaticMetamodel(Entrada.class)
public class Entrada_ { 

    public static volatile SingularAttribute<Entrada, String> sessao;
    public static volatile SingularAttribute<Entrada, Date> dataEntrada;
    public static volatile SingularAttribute<Entrada, String> notaFiscal_Associada;
    public static volatile SingularAttribute<Entrada, Double> id;

}