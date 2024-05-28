package br.unigran.controllers;

import java.util.List;
import br.unigran.dto.DTO;

public class ControllerProduto implements Controller{
    @Override
    public String[] getTitulosColunas() {
        return new String[0];
    }

    @Override
    public Object[] getDados(DTO dto) {
        return new Object[0];
    }

    @Override
    public List getListaDados() {
        return List.of();
    }

    @Override
    public void remover(DTO dto) {

    }

    @Override
    public void salvar(DTO dto) throws Exception {

    }
}
