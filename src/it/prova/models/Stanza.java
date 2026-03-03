package it.prova.models;

import java.util.ArrayList;
import java.util.List;

public class Stanza {

    private int numeroStanze;
    private double quantoAPersona;
    private Hotel hotel;
    private List<Cliente> clienti = new ArrayList<>();


    public Stanza(int numeroStanza, int quantoAPersona, Hotel hotel, List<Cliente> clienti){
        this.numeroStanze = numeroStanza;
        this.quantoAPersona = quantoAPersona;
        this.hotel = hotel;
        this.clienti = clienti;
    }

    public int getNumeroStanze() {
        return numeroStanze;
    }

    public void setNumeroStanze(int numeroStanze) {
        this.numeroStanze = numeroStanze;
    }

    public double getQuantoAPersona() {
        return quantoAPersona;
    }

    public void setQuantoAPersona(double quantoAPersona) {
        this.quantoAPersona = quantoAPersona;
    }

    public Hotel getHotel() {
        return hotel;
    }

    public void setHotel(Hotel hotel) {
        this.hotel = hotel;
    }

    public List<Cliente> getClienti() {
        return clienti;
    }

    public void setClienti(List<Cliente> clienti) {
        this.clienti = clienti;
    }
}
