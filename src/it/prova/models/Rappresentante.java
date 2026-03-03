package it.prova.models;


public class Rappresentante extends Cliente {

    private float sommaDaPagare;

    public Rappresentante(String nome, String cognome, Stanza stanza){
        super(nome, cognome, stanza);
        this.sommaDaPagare = sommaDaPagare;
    }

    public double sommaRealeDaPagare(){

        double tot = getStanza().getQuantoAPersona();
        return tot;
    }

}
