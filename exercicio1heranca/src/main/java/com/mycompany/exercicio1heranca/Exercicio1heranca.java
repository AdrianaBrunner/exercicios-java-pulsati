package com.mycompany.exercicio1heranca;

public class Exercicio1heranca {

    public static void main(String[] args) {
        
        cachorro cachorro1 = new cachorro();
        cachorro1.setNome("Toby");
        cachorro1.setRaca("Pinscher");
        cachorro1.caminha();
        cachorro1.late();

        gato gato1 = new gato();
        gato1.setNome("Fluffy");
        gato1.setRaca("Siamês");
        gato1.caminha();
        gato1.mia();
    }
}
