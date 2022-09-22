package com.bakery.model;

public class Padaria {
    int estoqueDePao = 100;
    double precoDoPao = 0.2;

    public int getPao(double pago){

        int quantidadeDePao = (int) Math.round(pago/precoDoPao);
        this.estoqueDePao = estoqueDePao = quantidadeDePao;

        return quantidadeDePao;
    }

    private void fazerMaisPao(int quantidade){
        this.estoqueDePao = this.estoqueDePao + quantidade;
    }
}
