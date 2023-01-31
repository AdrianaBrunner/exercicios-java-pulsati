
package com.mycompany.exercicio1heranca;

public class gato extends animal {
    
   @Override
    public void caminha() {
        System.out.println("O gato "+getNome()+ " da raça "+getRaca()+ " está caminhando!");
    }
    public void mia() {
        System.out.println("O gato faz miau");
    }
}
