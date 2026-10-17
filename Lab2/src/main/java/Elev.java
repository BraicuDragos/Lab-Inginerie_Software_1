import org.example.Gen;

public class Elev {

    private String nume;
    private Gen gen;

    public Elev(String nume, Gen gen) {
        this.nume = nume;
        this.gen = gen;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public Gen getGen() {
        return gen;
    }

    public void setGen(Gen gen) {
        this.gen = gen;
    }

    @Override
    public String toString() {
        return "Elev{" +
                "nume='" + nume + '\'' +
                ", gen=" + gen +
                '}';
    }
}