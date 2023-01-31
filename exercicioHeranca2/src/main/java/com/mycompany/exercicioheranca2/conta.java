package com.mycompany.exercicioheranca2;

public class conta {
    private String numero;
    private String cliente;
    private double saldo;
    
    public void depositar(double valorDepositado) {
        System.out.println(getCliente()+ " Saldo Atual: R$"+getSaldo());
        System.out.println(getCliente()+" o valor de "+valorDepositado+ " foi depositado na sua conta. Seu novo saldo é de " + (getSaldo()+valorDepositado));
    }
    
    public void sacar(double valorSacado){
        System.out.println(getCliente()+ " Saldo Atual: R$"+getSaldo());
        System.out.println(getCliente()+" o valor de "+valorSacado+ " foi sacado na sua conta. Seu novo saldo é de " + (getSaldo()-valorSacado));

    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
