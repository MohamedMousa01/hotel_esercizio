package it.prova.test;

import it.prova.models.*;

import java.util.ArrayList;
import java.util.List;

public class TestHotel {

    public static void main(String[] args){

        Hotel h1 = new Hotel("Hotel Beach", 3);
        List<Cliente> clienti1 = new ArrayList<>();
        Stanza s1 = new Stanza(1, 100, h1, clienti1);

        clienti1.add(new Rappresentante("rappresentante", "rossi", s1));
        clienti1.add(new Turista("Turista", "Verdi", s1));
        clienti1.add(new Premio("Premio", "Bianchi", s1));
        clienti1.add(new Turista("Turista2", "cognome", s1));

        System.out.println(h1.calcolaConto(s1));

    }

}
