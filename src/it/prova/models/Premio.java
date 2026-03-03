package it.prova.models;

public class Premio extends Cliente{

    public Premio(String nome, String cognome, Stanza stanza){
        super(nome, cognome, stanza);
    }



    public double sommaRealeDaPagare(){
        return 0;
    }
}
