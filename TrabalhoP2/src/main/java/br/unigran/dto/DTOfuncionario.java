package br.unigran.dto;

import javax.persistence.Column;
import java.io.Serial;
import java.util.Date;

public class DTOfuncionario extends DTO {

    private String nomeCompleto;
    private String cpf;
    private String sexo;
    private String email;
    private String dataAdmissao;
    private String cargo;
    private String funcao;
    private String endereco;
    private Date dataNascimento;
    double salario;

    @Override
    public Object builder() {
        return null;
    }
}
