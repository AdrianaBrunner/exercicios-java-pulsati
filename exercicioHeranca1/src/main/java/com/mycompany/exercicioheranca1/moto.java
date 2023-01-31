package com.mycompany.exercicioheranca1;

public class moto extends veiculo{

    public double getComprimentoGuidao() {
        return comprimentoGuidao;
    }

    public void setComprimentoGuidao(double comprimentoGuidao) {
        this.comprimentoGuidao = comprimentoGuidao;
    }

    public int getQuantidadeRetrovisor() {
        return quantidadeRetrovisor;
    }

    public void setQuantidadeRetrovisor(int quantidadeRetrovisor) {
        this.quantidadeRetrovisor = quantidadeRetrovisor;
    }
    private double comprimentoGuidao;
    private int quantidadeRetrovisor;
}
