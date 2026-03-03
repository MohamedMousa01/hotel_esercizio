package it.prova.models;


public class Rappresentante extends Cliente {

    private float sommaDaPagare;

    public Rappresentante(String nome, String cognome, float sommaDaPagare){
        super(nome, cognome);
        this.sommaDaPagare = sommaDaPagare;
    }

    public double sommaRealeDaPagare(){

        double sum = 0.8 * sommaDaPagare;
        return sum;
    }

}
