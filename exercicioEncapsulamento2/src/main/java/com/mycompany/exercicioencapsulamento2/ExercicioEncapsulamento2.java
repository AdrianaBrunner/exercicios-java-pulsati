package com.mycompany.exercicioencapsulamento2;

public class ExercicioEncapsulamento2 {

    public static void main(String[] args) {
        aluno aluno1 = new aluno();
        aluno1.setNome("Pedro");
        aluno1.setNota(8.5);
        
        System.out.println("Aluno: "+aluno1.getNome()+" Nota: "+aluno1.getNota());
    }
}
