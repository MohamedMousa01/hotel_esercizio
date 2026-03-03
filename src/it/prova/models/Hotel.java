package it.prova.models;

import java.util.ArrayList;
import java.util.List;

public class Hotel {

    private String ragioneSociale;
    private int stelle;
    private List<Stanza> stanze = new ArrayList<>();


    public Hotel(String ragioneSociale, int stelle){
        this.ragioneSociale = ragioneSociale;
        this.stelle = stelle;
    }

    public String getRagioneSociale() {
        return ragioneSociale;
    }

    public void setRagioneSociale(String ragioneSociale) {
        this.ragioneSociale = ragioneSociale;
    }

    public int getStelle() {
        return stelle;
    }

    public void setStelle(int stelle) {
        this.stelle = stelle;
    }

    public List<Stanza> getStanze() {
        return stanze;
    }

    public void setStanze(List<Stanza> stanze) {
        this.stanze = stanze;
    }

    public double calcolaConto(Stanza input){
        double totSum = 0;

        for(Cliente c : input.getClienti()){
            totSum = totSum + c.sommaRealeDaPagare();
        }
        return totSum;
    }

}
