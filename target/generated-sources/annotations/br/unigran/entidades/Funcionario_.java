package br.unigran.entidades;

import java.util.Date;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2024-06-15T09:48:45", comments="EclipseLink-2.7.12.v20230209-rNA")
@StaticMetamodel(Funcionario.class)
public class Funcionario_ { 

    public static volatile SingularAttribute<Funcionario, String> funcao;
    public static volatile SingularAttribute<Funcionario, Double> salario;
    public static volatile SingularAttribute<Funcionario, String> cpf;
    public static volatile SingularAttribute<Funcionario, String> sexo;
    public static volatile SingularAttribute<Funcionario, String> dataAdmissao;
    public static volatile SingularAttribute<Funcionario, String> cargo;
    public static volatile SingularAttribute<Funcionario, Date> dataNascimento;
    public static volatile SingularAttribute<Funcionario, String> email;
    public static volatile SingularAttribute<Funcionario, String> nomeCompleto;

}