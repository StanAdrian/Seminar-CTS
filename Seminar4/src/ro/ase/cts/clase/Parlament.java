package ro.ase.cts.clase;

public class Parlament {
    private String numeTara;
    private int nrParlamentari;
    private int durataMandat;
    private String denumireSediu;

    private static Parlament parlament = new Parlament();

    public static Parlament getInstance(){
        return parlament;
    }

    private Parlament() {
        this.numeTara = "";
        this.nrParlamentari = 0;
        this.durataMandat = 0;
        this.denumireSediu = "";
    }

    private Parlament(String numeTara, int nrParlamentari, int durataMandat, String denumireSediu) {
        this.numeTara = numeTara;
        this.nrParlamentari = nrParlamentari;
        this.durataMandat = durataMandat;
        this.denumireSediu = denumireSediu;
    }


    public String getNumeTara() {
        return numeTara;
    }

    public int getNrParlamentari() {
        return nrParlamentari;
    }

    public int getDurataMandat() {
        return durataMandat;
    }

    public String getDenumireSediu() {
        return denumireSediu;
    }

    public void setNumeTara(String numeTara) {
        this.numeTara = numeTara;
    }

    public void setNrParlamentari(int nrParlamentari) {
        this.nrParlamentari = nrParlamentari;
    }

    public void setDurataMandat(int durataMandat) {
        this.durataMandat = durataMandat;
    }

    public void setDenumireSediu(String denumireSediu) {
        this.denumireSediu = denumireSediu;
    }

    public static void setParlament(Parlament parlament) {
        Parlament.parlament = parlament;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Parlament{");
        sb.append("numeTara='").append(numeTara).append('\'');
        sb.append(", nrParlamentari=").append(nrParlamentari);
        sb.append(", durataMandat=").append(durataMandat);
        sb.append(", denumireSediu='").append(denumireSediu).append('\'');
        sb.append('}');
        return sb.toString();
    }

}
