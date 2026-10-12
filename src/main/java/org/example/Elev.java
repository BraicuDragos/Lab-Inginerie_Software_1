package org.example;

import java.util.HashSet;
import java.util.Set;

public class Elev {
    private String nume;
    private Gen gen;

    private Set<String> activitati = new HashSet<>();

    public Elev(String nume, Gen gen) {
        this.nume = nume;
        this.gen = gen;
    }

    public Set<String> getActivitati() {
        return activitati;
    }

    public void adaugaActivitate(String activitate) {
        activitati.add(activitate);
    }

    public void eliminaActivitate(String activitate) {
        activitati.remove(activitate);
    }

    public String getNume() {
        return nume;
    }

    public Gen getGen() {
        return gen;
    }

    @Override
    public String toString() {
        return "Elev{" +
                "nume='" + nume + '\'' +
                ", gen=" + gen +
                '}';
    }
}