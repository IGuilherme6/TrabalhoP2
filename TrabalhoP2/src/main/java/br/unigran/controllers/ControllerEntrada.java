package br.unigran.controllers;

import br.unigran.dto.DTO;

import java.awt.event.ActionListener;
import java.util.List;

public class ControllerEntrada implements Controller{
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
