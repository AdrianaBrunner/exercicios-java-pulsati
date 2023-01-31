
package com.mycompany.exercicio1heranca;

public class cachorro extends animal {
    
    @Override
    public void caminha() {
        System.out.println("O cachorro "+getNome()+ " da raça "+getRaca()+ " está caminhando!");
    }
    public void late() {
        System.out.println("O cachorro faz Au Au");
    }
}
