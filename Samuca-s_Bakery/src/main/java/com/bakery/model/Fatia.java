package com.bakery.model;

public class Fatia {
    private Bolo.Sabor sabor;
    private Cobertura cobertura;
    private Tamanho tamanho;



    public enum Tamanho {
        GRANDE(0.250, "Grande"),
        MEDIA(0.200, "Media"),
        PEQUENA(0.150, "Pequena");

        double peso;
        String name;

        private Tamanho (double peso, String name){
            this.peso = peso;
            this.name = name;
        }

        public double getPeso() {
            return peso;
        }

        public String getName() {
            return name;
        }
    }
}
