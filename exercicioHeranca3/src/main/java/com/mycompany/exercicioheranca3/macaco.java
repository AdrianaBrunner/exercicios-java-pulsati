package com.mycompany.exercicioheranca3;

public class macaco extends mamiferos{
    private int quantidadeCauda;
    
    public void sobeArvores() {
        System.out.println("O macaco sobe árvores.");
    }
    @Override
       public void caminha(){
        System.out.println("O macaco caminha");
    }

    public int getQuantidadeCauda() {
        return quantidadeCauda;
    }

    public void setQuantidadeCauda(int quantidadeCauda) {
        this.quantidadeCauda = quantidadeCauda;
    }
}
