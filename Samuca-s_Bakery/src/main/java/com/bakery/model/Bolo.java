package com.bakery.model;

// Forma/molde de Bolo ( ingredientes e preparativos )
public class Bolo {
    private Sabor sabor;
    private Cobertura cobertura;
    private final float peso;
    private float quantidade;
    //private Massa massa;

    //padeiro - ele sabe executar a receitar e trazer um novo bolo
    public Bolo(Sabor sabor, Cobertura cobertura, float peso){
        this.sabor = sabor;
        this.cobertura = cobertura;
        this.peso = peso;
        this.quantidade = peso;
    }

    public void provarBolo(){
        diminuirAquantidade(0.100f);
    }

    public Fatia pegarUmaFatia(){
        return new Fatia(this);
    }



    public enum Sabor {
        Morango("Morango"),
        Chocolate("Chocolate"),
        Cenoura("Cenoura");

        String flavor;

        private Sabor(String flavor){ this.flavor = flavor; }

    }
}

