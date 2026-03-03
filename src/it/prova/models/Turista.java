package it.prova.models;

public class Turista extends Cliente{

    private float sommaDaPagare;

    public Turista( String nome, String cognome, float sommaDaPagare){
        super(nome, cognome);
        this.sommaDaPagare = sommaDaPagare;
    }

    public double sommaRealeDaPagare(){
        return sommaDaPagare;
    }
}
