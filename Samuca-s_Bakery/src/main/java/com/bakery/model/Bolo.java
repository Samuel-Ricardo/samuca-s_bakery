package com.bakery.model;

// Forma/molde de Bolo ( ingredientes e preparativos )
public class Bolo {


    public enum Sabor {
        Morango("Morango"),
        Chocolate("Chocolate"),
        Cenoura("Cenoura");

        String flavor;

        private Sabor(String flavor){ this.flavor = flavor; }

    }
}

