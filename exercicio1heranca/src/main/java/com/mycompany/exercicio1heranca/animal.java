package com.mycompany.exercicio1heranca;

public class animal {
    private String nome;
    private String raca;
    
    public void caminha() {
        System.out.println("Caminhando");
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }
}
