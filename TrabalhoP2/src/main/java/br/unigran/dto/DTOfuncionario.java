package br.unigran.dto;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import java.io.Serial;
import java.util.Date;

@Getter
@Setter
public class DTOfuncionario extends DTO {

    private String nomeCompleto;
    private String cpf;
    private String sexo;
    private String email;
    private Date dataAdmissao;
    private String cargo;
    private String funcao;
    private String endereco;
    private Date dataNascimento;
    private Double salario;

    @Override
    public Object builder() {
        return null;
    }
}
