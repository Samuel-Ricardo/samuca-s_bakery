package com.bakery.model;

import com.bakery.abstractions.Padeiro;

public class ChefeDeCozinha implements Padeiro {
    @Override
    public int fazerPao(int pao) {
        return pao;
    }

    @Override
    public Bolo fazerBolo() {
        return fazerBoloDeMorango(2);
    }

    public Bolo fazerBoloDeMorango(float peso){
        return new Bolo(Bolo.Sabor.Morango, Cobertura.Morango, peso);
    }
}
