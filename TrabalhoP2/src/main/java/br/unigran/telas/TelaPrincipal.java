package br.unigran.telas;

import javax.swing.*;
import java.awt.*;

public class TelaPrincipal extends JFrame{
    private JPanel painel1;
    private JButton botaoSair;
    private JButton botaoCadastrarProdutos;
    private JButton botaoCadastrarFuncionarios;
    private JButton botaoGerenciarEstoque;
    public TelaPrincipal(){
        componentes();
        acoes();
        configuracoes();
    }


    private void componentes() {
        setLayout(new BorderLayout());
        painel1= new JPanel(new GridLayout());
        botaoCadastrarFuncionarios = new JButton("Cadastrar Funcionario");
        botaoCadastrarProdutos = new JButton("Cadastrar Produtos");
        botaoSair = new JButton("Sair");
        botaoGerenciarEstoque= new JButton("Gerenciar Estoque");
        painel1.setBackground(Color.BLACK);
        painel1.add(botaoCadastrarFuncionarios);
        painel1.add(botaoCadastrarProdutos);
        painel1.add(botaoGerenciarEstoque);
        painel1.add(botaoSair);
        add(painel1);
    }
    private void acoes() {
        botaoSair.addActionListener(e -> {
            dispose();
        });
    }
    private void configuracoes() {
        setTitle("Tela de entrada");
        setSize(700,100);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }
}
