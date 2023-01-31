package com.mycompany.exercicioheranca3;

public class mamiferos {
    private int quantidadeMamas;
    private int quantidadePelos;
    
    public void caminha(){
        System.out.println("Os mamíferos caminham");
    }

    public int getQuantidadeMamas() {
        return quantidadeMamas;
    }

    public void setQuantidadeMamas(int quantidadeMamas) {
        this.quantidadeMamas = quantidadeMamas;
    }

    public int getQuantidadePelos() {
        return quantidadePelos;
    }

    public void setQuantidadePelos(int quantidadePelos) {
        this.quantidadePelos = quantidadePelos;
    }
}
