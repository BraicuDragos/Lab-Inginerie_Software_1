package org.example;

public class Main {

    public static void main(String[] args) {
        Scoala scoala = new Scoala();

        Clasa c1 = new Clasa(26, NumarClasa.I, "A");
        Clasa c2 = new Clasa(25, NumarClasa.II, "C");
        Clasa c3 = new Clasa(28, NumarClasa.III, "E");

        scoala.adaugaClasa("1A", c1);
        scoala.adaugaClasa("2C", c2);
        scoala.adaugaClasa("3E", c3);

        Elev e1 = new Elev("Dragos", Gen.Masculin);
        Elev e2 = new Elev("Larisa", Gen.Feminin);
        Elev e3 = new Elev("Andrei", Gen.Masculin);
        Elev e4 = new Elev("andreea", Gen.Feminin);
        Elev e5 = new Elev("Marius", Gen.Masculin);

        scoala.adaugaElevInClasa("1A", e1);
        scoala.adaugaElevInClasa("1A", e2);
        scoala.adaugaElevInClasa("2C", e3);
        scoala.adaugaElevInClasa("3E", e4);
        scoala.adaugaElevInClasa("1A", e5);

        print(scoala);

        c2.eliminaElev(e3);
        System.out.println("\nDupa eliminarea elev:");
        print(scoala);

        scoala.eliminaClasa("3E");
        System.out.println("\nDupa eliminarea clasa:");
        print(scoala);

        scoala.eliminaElevDupaNume("Marius");
        System.out.println("\nDupa eliminare elev dupa nume:");
        print(scoala);

        scoala.adaugaActivitate(new Activitate("Fotbal", new Profesor("Florea")));
        scoala.adaugaActivitate(new Activitate("cor", new Profesor("Brad")));

        scoala.inscrieElevLaActivitate("Fotbal", e1);
        scoala.inscrieElevLaActivitate("Fotbal", e3);
        scoala.inscrieElevLaActivitate("cor", e2);

        System.out.println("\nActivitati: " + scoala.getNumarActivitati());

        System.out.println("activitati e1: " + e1.getActivitati());

        scoala.eliminaElevDinActivitate("Fotbal", e1);
        System.out.println("Activitati e1 dupa eliminare: " + e1.getActivitati());

        scoala.eliminaActivitate("cor");
        System.out.println("Activitati dupa eliminare: " + scoala.getNumarActivitati());
    }

    private static void print(Scoala scoala) {
        System.out.println("Numar clase: " + scoala.getNumarClase());
        System.out.println("Total elevi: " + scoala.getTotalElevi());
    }
}
