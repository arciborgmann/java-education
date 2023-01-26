package br.com.inter.orangetech.backend.metodos;

public class Main {
    public static void main(String[] args) {

        // Calculadora
        System.out.println("Exercício da Calculadora");
        Calculadora.soma(3, 4);
        Calculadora.subtracao(8, 3);
        Calculadora.multiplicacao(12, 4);
        Calculadora.divisao(5, 2);

        // Saudação
        System.out.println("Exercício de Saudação");
        Saudacao.obterMensagem(4);
        Saudacao.obterMensagem(13);
        Saudacao.obterMensagem(5);

        // Empréstimo
        System.out.println("Exercício de Empréstimo");
        Emprestimo.calcular(1000, Emprestimo.getDuasParcelas());
        Emprestimo.calcular(1000, Emprestimo.getTresParcelas());
        Emprestimo.calcular(1000, 4);
    }
}