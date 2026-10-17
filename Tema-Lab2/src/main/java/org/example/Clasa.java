package org.example;

import java.util.ArrayList;
import java.util.List;

public class Clasa {

    private int capacitate;
    private NumarClasa numar;
    private String litera;
    private List<Elev> elevi;

    public Clasa(int capacitate, NumarClasa numar, String litera) {
        this.capacitate = capacitate;
        this.numar = numar;
        this.litera = litera;
        this.elevi = new ArrayList<>();
    }

    public void adaugaElev(Elev elev) {
        if (elevi.size() <= capacitate) {
            elevi.add(elev);
        }
    }

    public void eliminaElev(Elev elev) {

        elevi.remove(elev);
    }

    public int getTotalElevi() {
        return elevi.size();
    }

    public int getCapacitate() {
        return capacitate;
    }

    public void setCapacitate(int capacitate) {
        this.capacitate = capacitate;
    }

    public NumarClasa getNumar() {
        return numar;
    }

    public void setNumar(NumarClasa numar) {
        this.numar = numar;
    }

    public String getLitera() {
        return litera;
    }

    public void setLitera(String litera) {
        this.litera = litera;
    }

    public List<Elev> getElevi() {
        return elevi;
    }

    @Override
    public String toString() {
        return "Clasa{" +
                "capacitate=" + capacitate +
                ", numar=" + numar +
                ", litera='" + litera + '\'' +
                ", elevi=" + elevi +
                '}';
    }
}