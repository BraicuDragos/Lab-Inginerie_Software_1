package org.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Scoala {
    private Map<String, Clasa> clase;
    private Map<String, Activitate> activitati;

    public Scoala () {
        clase = new HashMap<>();
        activitati = new HashMap<>();
    }

    public void adaugaClasa (String id, Clasa clasa) {
        clase.put(id, clasa);
    }
    public void eliminaClasa(String id) {
        clase.remove(id);
    }

    public void adaugaElevInClasa(String id, Elev elev) {
        Clasa clasa = clase.get(id);
        clasa.adaugaElev(elev);
    }

    public void eliminaElevDupaNume(String nume) {
        for (Clasa clasa : clase.values()) {
            Elev gasit = null;
            for (Elev e : clasa.getElevi()) {
                if (e.getNume().equals(nume)) {
                    gasit = e;
                    break;
                }
            }
            if (gasit != null) {
                clasa.eliminaElev(gasit);
                return;
            }
        }
    }

    public void adaugaActivitate(Activitate activitate) {
        activitati.put(activitate.getNume(), activitate);
    }

    public void eliminaActivitate(String nume) {
        Activitate activitate = activitati.remove(nume);
        if (activitate != null) {
            for (Elev e : activitate.getElevi()) {
                e.eliminaActivitate(nume);
            }
        }
    }

    public void inscrieElevLaActivitate(String numeActivitate, Elev elev) {
        Activitate activitate = activitati.get(numeActivitate);
        if (activitate != null) {
            activitate.adaugaElev(elev);
        }
    }

    public void eliminaElevDinActivitate(String numeActivitate, Elev elev) {
        Activitate activitate = activitati.get(numeActivitate);
        if (activitate != null) {
            activitate.eliminaElev(elev);
        }
    }

    public void printTopActivitate() {
        List<Activitate> top = new ArrayList<>(activitati.values());
        top.sort((a, b) -> b.getElevi().size() - a.getElevi().size());
        int loc = 1;
        for (Activitate a : top) {
            System.out.println(loc++ + ". " + a.getNume() + " - " + a.getElevi().size() + " elevi");
        }
    }

    public int getNumarEleviCuActivitate() {
        Set<Elev> participanti = new HashSet<>();
        for (Activitate a : activitati.values()) {
            participanti.addAll(a.getElevi());
        }
        return participanti.size();
    }

    public int getNumarActivitati() {
        return activitati.size();
    }

    public int getNumarClase() {
        return clase.size();
    }

    public int getTotalElevi() {
        int total = 0;
        for (Clasa clasa : clase.values()) {
            total += clasa.getTotalElevi();
        }
        return total;
    }
}
