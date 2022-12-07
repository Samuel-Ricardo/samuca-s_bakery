package com.bakery;

import com.bakery.model.Bolo;
import static com.bakery.model.Bolo.Sabor.Cenoura;
import com.bakery.model.Cobertura;
import com.bakery.model.Fatia;
import com.bakery.model.GulosoException;

public class Main {
    public static void main(String[] args) throws GulosoException {
        System.out.println("Hello World");

        Bolo boli = new Bolo(Cenoura, Cobertura.Chocolate, 1);


        Bolo bolo = new Bolo(Cenoura, Cobertura.Chocolate, 1);


        bolo.pegarUmaFatia(Fatia.Tamanho.MEDIA);
        bolo.pegarUmaFatia(Fatia.Tamanho.MEDIA);
        bolo.pegarUmaFatia(Fatia.Tamanho.MEDIA);
        bolo.pegarUmaFatia(Fatia.Tamanho.MEDIA);
        bolo.pegarUmaFatia(Fatia.Tamanho.MEDIA);
        bolo.pegarUmaFatia(Fatia.Tamanho.MEDIA);
        bolo.pegarUmaFatia(Fatia.Tamanho.MEDIA);



        try {
            boli.pegarUmaFatia(Fatia.Tamanho.GRANDE);
        } catch (GulosoException e) {
            System.out.println("AAAAAAAAAAAAAAAAAAAA");
            System.out.println(e.getMessage());
        }

        System.out.println();
    }
}
