package com.mycompany.exercicioheranca2;

public class ExercicioHeranca2 {

    public static void main(String[] args) {

        conta conta1 = new conta();
        conta1.setNumero("123456");
        conta1.setCliente("Ana");
        conta1.setSaldo(1000);
        conta1.depositar(200);
        
        conta conta2 = new conta();
        conta2.setNumero("789123");
        conta2.setCliente("Pedro");
        conta2.setSaldo(2000);
        conta2.sacar(200);
        
        contaEspecial contaEspecial1 = new contaEspecial();
        contaEspecial1.setNumero("456789");
        contaEspecial1.setCliente("Paulo");
        contaEspecial1.setSaldo(2500);
        contaEspecial1.setLimite(3000);
        contaEspecial1.depositar(100);
        contaEspecial1.sacar(4000);
    }
}
