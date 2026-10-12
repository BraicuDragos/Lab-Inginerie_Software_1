package org.example;

import java.util.HashSet;
import java.util.Set;

public class Activitate {
    private String nume;
    private Profesor coordonator;
    private Set<Elev> elevi;

    public Activitate(String nume, Profesor coordonator) {
        this.nume = nume;
        this.coordonator = coordonator;
        this.elevi = new HashSet<>();
    }

    public String getNume() {
        return nume;
    }

    public Profesor getCoordonator() {
        return coordonator;
    }

    public Set<Elev> getElevi() {
        return elevi;
    }

    public void adaugaElev(Elev elev) {
        if (elevi.add(elev)) {
            elev.adaugaActivitate(nume);
        }
    }

    public void eliminaElev(Elev elev) {
        if (elevi.remove(elev)) {
            elev.eliminaActivitate(nume);
        }
    }


    @Override
    public String toString() {
        return "Activitate{" +
                "nume='" + nume + '\'' +
                ", coordonator=" + coordonator +
                ", elevi=" + elevi +
                '}';
    }
}
