package com.mycompany.exercicio5;

public class Exercicio5 {

    public static void main(String[] args) {
        carro carro1 = new carro();
        carro1.litrosTanque = 50;
        carro1.montadora = "Ford";
        
        carro carro2 = new carro();
        carro2.litrosTanque = 60;
        carro2.montadora = "Chevrolet";
        
        carro1.imprimeCarro();
        carro2.imprimeCarro();
    }
}
