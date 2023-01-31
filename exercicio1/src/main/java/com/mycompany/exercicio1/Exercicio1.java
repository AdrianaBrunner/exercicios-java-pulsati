package com.mycompany.exercicio1;

public class Exercicio1 {

    public static void main(String[] args) {
        pessoa pessoa1 = new pessoa();
        pessoa1.nome = "Fernanda";
        pessoa1.idade = 25;
        
        pessoa pessoa2 = new pessoa();
        pessoa2.nome = "João";
        pessoa2.idade = 15;
        
        pessoa1.imprimePessoa();
        pessoa2.imprimePessoa();
    }
}
