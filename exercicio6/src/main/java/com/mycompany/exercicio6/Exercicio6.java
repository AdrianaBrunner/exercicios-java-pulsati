package com.mycompany.exercicio6;

public class Exercicio6 {

    public static void main(String[] args) {
        professor professor1 = new professor();
        professor1.nome = "Paulo";
        professor1.curso = "Administração";
        
        professor professor2 = new professor();
        professor2.nome = "Jonas";
        professor2.curso = "Direito";
        
        professor1.imprimeProfessor();
        professor2.imprimeProfessor();
    }
}
