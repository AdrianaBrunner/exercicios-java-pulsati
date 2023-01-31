package com.mycompany.exercicioheranca3;

public class cachorro extends mamiferos{
    private int quantidadeCauda;
    
    public void corre() {
        System.out.println("O cachorro corre.");
    }
    
    public void trota() {
        System.out.println("O cachorro trota.");
    }

    @Override
       public void caminha(){
        System.out.println("O cachorro caminha");
    }
    public int getQuantidadeCauda() {
        return quantidadeCauda;
    }

    public void setQuantidadeCauda(int quantidadeCauda) {
        this.quantidadeCauda = quantidadeCauda;
    }
}
