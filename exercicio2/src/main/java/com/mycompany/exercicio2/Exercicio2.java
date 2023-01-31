package com.mycompany.exercicio2;

public class Exercicio2 {

    public static void main(String[] args) {
        
        computador computador1 = new computador();
        computador1.memoria = 500;
        computador1.processador = "Intel";
        
        computador computador2 = new computador();
        computador2.memoria = 250;
        computador2.processador = "Intel 2";
        
        computador1.imprimeComputador();
        computador2.imprimeComputador();
    }
}
