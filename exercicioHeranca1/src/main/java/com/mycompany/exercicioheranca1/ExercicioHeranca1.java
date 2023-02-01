package com.mycompany.exercicioheranca1;

public class ExercicioHeranca1 {
    
    public static void imprimeMensagem(veiculo v) {
       v.imprime();
    }

    public static void main(String[] args) {
        aviao objaviao = new aviao();
        moto objmoto = new moto();
        
        objaviao.setQuantidadeJanela(100);
        objaviao.setQuantidadePassageiros(150);
        
        objmoto.setComprimentoGuidao(25);
        objmoto.setQuantidadePassageiros(2);
        
        imprimeMensagem(objmoto);
        imprimeMensagem(objaviao);
    }
}
