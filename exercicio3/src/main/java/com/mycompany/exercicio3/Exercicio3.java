package com.mycompany.exercicio3;

public class Exercicio3 {

    public static void main(String[] args) {
        
        aluno aluno1 = new aluno();
        aluno1.nome = "Pedro";
        aluno1.nota = 8.5;
        
        aluno aluno2 = new aluno();
        aluno2.nome = "João";
        aluno2.nota = 10;
        
        aluno1.imprimeAluno();
        aluno2.imprimeAluno();
    }
}
