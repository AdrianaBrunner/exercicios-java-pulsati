package com.mycompany.exercicioheranca2;

public class contaEspecial extends conta {

    private double limite;

    @Override
    public void sacar(double valorSacado) {
        if (valorSacado > getSaldo()) {
            System.out.println(getCliente()+" Você não tem limite suficiente, não poderá sacar o valor de R$" + valorSacado);
        } else {
            System.out.println(getCliente() + " Saldo Atual: R$" + getSaldo());
            System.out.println(getCliente() + " o valor de " + valorSacado + " foi sacado na sua conta. Seu novo saldo é de " + (getSaldo() - valorSacado));
        }
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }
}
