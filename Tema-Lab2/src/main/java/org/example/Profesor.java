package org.example;

public class Profesor {
    private String nume;

    public Profesor(String nume) {
        this.nume = nume;
    }

    public String getNume() {
        return nume;
    }

    @Override
    public String toString() {
        return "Profesor{" +
                "nume='" + nume + '\'' +
                '}';
    }
}
