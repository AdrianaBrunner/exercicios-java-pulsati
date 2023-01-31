package com.mycompany.exercicioheranca3;

public class ExercicioHeranca3 {

    public static void main(String[] args) {
        cachorro cachorro1 = new cachorro();
        cachorro1.setQuantidadeMamas(8);
        cachorro1.setQuantidadeCauda(1);
        cachorro1.setQuantidadePelos(1000);
        cachorro1.caminha();
        cachorro1.corre();
        cachorro1.trota();
        
        macaco macaco1 = new macaco();
        macaco1.setQuantidadeMamas(2);
        macaco1.setQuantidadeCauda(1);
        macaco1.setQuantidadePelos(1000);
        macaco1.sobeArvores();
        macaco1.caminha();

        
        humano humano1 = new humano();
        humano1.setQuantidadeMamas(4);
        humano1.setQuantidadePelos(1000);
        humano1.caminha();

    }
}
