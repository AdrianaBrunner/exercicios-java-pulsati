package com.mycompany.exercicio4;

public class Exercicio4 {

    public static void main(String[] args) {
        casa casa1 = new casa();
        casa1.metrosQuadrados = 6;
        casa1.cor = "Amarela";
        
        casa casa2 = new casa();
        casa2.metrosQuadrados = 9;
        casa2.cor = "Rosa";
        
        casa1.imprimeCasa();
        casa2.imprimeCasa();
    }
}
