package com.bakery.model;

// Forma/molde de Bolo ( ingredientes e preparativos )
public class Bolo {
    private final Sabor sabor;
    private Cobertura cobertura;
    private final float peso;
    private float quantidade;

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

    public Fatia pegarUmaFatia(Fatia.Tamanho tamanhoDaFatia) throws GulosoException {
        if (diminuirAquantidade((float) tamanhoDaFatia.peso)) return new Fatia(this, tamanhoDaFatia);
        throw new GulosoException("Deixe de ser Guloso >:()");
    }

    public boolean aumentarQuantidade(float quantidade){
        float total = this.quantidade + quantidade;
        boolean consegueAumentar = total > peso;

        if (!consegueAumentar) { System.out.println("O bolo não aquenta toda essa quantidade <:()"); }
        else { this.quantidade = total;}

        return consegueAumentar;
    }

    private boolean diminuirAquantidade(float quantidade){
        float total = this.quantidade - quantidade;
        boolean consegueDiminuir = total >= 0;

        if (!consegueDiminuir) { System.out.println("Você não tem toda essa Quantidade de Bolo >:()"); }
        else { this.quantidade = total;}

        return consegueDiminuir;
    }



    public Sabor getSabor() {
        return sabor;
    }

    public Cobertura getCobertura() {
        return cobertura;
    }

    public void mudarCobertura(Cobertura cobertura){
        this.cobertura = cobertura;
    }

    public enum Sabor {
        Morango("Morango"),
        Chocolate("Chocolate"),
        Cenoura("Cenoura");

        String flavor;

        private Sabor(String flavor){ this.flavor = flavor; }

    }
}

