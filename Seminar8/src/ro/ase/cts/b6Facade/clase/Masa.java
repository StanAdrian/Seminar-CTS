package ro.ase.cts.b6Facade.clase;

public class Masa {
    private int nrMasa;
    private int nrLocuri;

    public Masa(int nrMasa, int nrLocuri) {
        this.nrMasa = nrMasa;
        this.nrLocuri = nrLocuri;
    }

    public int getNrMasa() {
        return nrMasa;
    }

    public int getNrLocuri() {
        return nrLocuri;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Masa{");
        sb.append("nrMasa=").append(nrMasa);
        sb.append(", nrLocuri=").append(nrLocuri);
        sb.append('}');
        return sb.toString();
    }
}
