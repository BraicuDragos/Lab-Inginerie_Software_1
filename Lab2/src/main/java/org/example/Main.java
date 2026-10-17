package org.example;

public class Main {

    public static void main(String[] args) {
        Scoala scoala = new Scoala();

        // Creare clase (capacitate, numar, litera)
        Clasa c1 = new Clasa(30, NumarClasa.I, "A");
        Clasa c2 = new Clasa(25, NumarClasa.II, "B");
        Clasa c3 = new Clasa(20, NumarClasa.III, "C");

        scoala.adaugaClasa("1A", c1);
        scoala.adaugaClasa("2B", c2);
        scoala.adaugaClasa("3A", c3);

        // Adaugare elevi prin Scoala
        Elev e1 = new Elev("Dragos", Gen.Masculin);
        Elev e2 = new Elev("Larisa", Gen.Feminin);
        Elev e3 = new Elev("Andrei", Gen.Masculin);
        Elev e4 = new Elev("andreea", Gen.Feminin);

        scoala.adaugaElevInClasa("1A", e1);
        scoala.adaugaElevInClasa("1A", e2);
        scoala.adaugaElevInClasa("2B", e3);
        scoala.adaugaElevInClasa("3A", e4);

        print(scoala);

        // Test 1: eliminare elev dintr-o clasa
        c1.eliminaElev(e3);
        System.out.println("\nDupa eliminarea unui elev:");
        print(scoala);

        // Test 2: eliminare clasa din scoala
        scoala.eliminaClasa("3A");
        System.out.println("\nDupa eliminarea unei clase:");
        print(scoala);

        // Test 3: eliminare elev dupa nume (indiferent de clasa)
        scoala.eliminaElevDupaNume("Larisa");
        System.out.println("\nDupa eliminarea unui elev dupa nume:");
        print(scoala);
    }

    // Afiseaza numarul de clase si totalul de elevi din scoala
    private static void print(Scoala scoala) {
        System.out.println("Numar clase: " + scoala.getNumarClase());
        System.out.println("Total elevi: " + scoala.getTotalElevi());
    }
}
