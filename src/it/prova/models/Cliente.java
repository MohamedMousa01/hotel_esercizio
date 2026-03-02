package it.prova.models;

public abstract class Cliente {

    protected String nome;
    protected String cognome;

    public Cliente(String nome, String cognome){
        this.nome = nome;
        this.cognome = cognome;
    }

    public abstract int sommaRealeDaPagare();

}
