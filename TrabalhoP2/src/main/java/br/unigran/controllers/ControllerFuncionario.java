package br.unigran.controllers;

import java.util.InputMismatchException;
import java.util.List;


public class ControllerFuncionario {

        public void Cadastrar(){}
        public void Alterar(){}
        public void EfetuaLogin(){}
        public void Permissao(){}
        public void Buscar(){}

    public Boolean validaCPF(String CPF) {
        CPF = CPF.replace(".", "").replace("-", "");

        // Verifica se o CPF tem 11 dígitos
        if (CPF.length() != 11) {

            return false;
        }

        // Verifica se todos os dígitos são iguais, o que não é válido no CPF
        if (CPF.matches("(\\d)\\1{10}")) {
            return false;
        }

        try {
            int[] digitos = new int[11];
            for (int i = 0; i < 11; i++) {
                digitos[i] = Integer.parseInt(CPF.substring(i, i + 1));
            }

            // Cálculo do primeiro dígito verificador
            int soma = 0;
            for (int i = 0; i < 9; i++) {
                soma += digitos[i] * (10 - i);
            }

            int primeiroDigitoVerificador = 11 - (soma % 11);
            if (primeiroDigitoVerificador == 10 || primeiroDigitoVerificador == 11) {
                primeiroDigitoVerificador = 0;
            }

            if (primeiroDigitoVerificador != digitos[9]) {
                return false;
            }

            // Cálculo do segundo dígito verificador
            soma = 0;
            for (int i = 0; i < 10; i++) {
                soma += digitos[i] * (11 - i);
            }

            int segundoDigitoVerificador = 11 - (soma % 11);
            if (segundoDigitoVerificador == 10 || segundoDigitoVerificador == 11) {
                segundoDigitoVerificador = 0;
            }

            if (segundoDigitoVerificador != digitos[10]) {
                return false;
            }

            return true;

        } catch (InputMismatchException e) {
            return false;
        }
    }
}
