package com.bakery.model;

// Forma/molde de Bolo ( ingredientes e preparativos )
public class Bolo {
    private Sabor sabor;
    private Cobertura cobertura;
    private final float peso;
    private float quantidade;
    //private Massa massa;

    public Bolo(){
        peso = 1;
    }



    public enum Sabor {
        Morango("Morango"),
        Chocolate("Chocolate"),
        Cenoura("Cenoura");

        String flavor;

        private Sabor(String flavor){ this.flavor = flavor; }

    }
}

