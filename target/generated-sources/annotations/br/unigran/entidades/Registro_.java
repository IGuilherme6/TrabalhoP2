package br.unigran.entidades;

import java.util.Date;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2024-06-08T16:44:59", comments="EclipseLink-2.7.12.v20230209-rNA")
@StaticMetamodel(Registro.class)
public class Registro_ { 

    public static volatile SingularAttribute<Registro, Date> dataAcessoSaida;
    public static volatile SingularAttribute<Registro, Date> dataAcessoEntrada;
    public static volatile SingularAttribute<Registro, Integer> id;
    public static volatile SingularAttribute<Registro, Date> dataEntradaProduto;
    public static volatile SingularAttribute<Registro, Date> dataSaidaProduto;

}