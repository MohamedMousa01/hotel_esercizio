package it.prova.models;

public class Turista extends Cliente{

    private float sommaDaPagare;

    public Turista( String nome, String cognome, Stanza stanza){
        super(nome, cognome, stanza);
        this.sommaDaPagare = sommaDaPagare;
    }

    public double sommaRealeDaPagare(){
        double tot = getStanza().getQuantoAPersona() * 0.8;
        return tot;
    }
}
