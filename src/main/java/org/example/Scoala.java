package org.example;

import java.util.HashMap;
import java.util.Map;

public class Scoala {
    private Map<String, Clasa> clase;

    public Scoala () {
        clase = new HashMap<>();
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
