package ro.ase.cts.clase;

public class ParlamentLazy {
    private String numeTara;
    private int nrParlamentari;
    private int durataMandat;
    private String denumireSediu;

    private static ParlamentLazy parlamentLazy = null;

    public static synchronized ParlamentLazy getInstance(
            String numeTara,
             int nrParlamentari,
             int durataMandat,
            String denumireSediu){
        if(parlamentLazy==null){
            parlamentLazy = new ParlamentLazy(numeTara, nrParlamentari, durataMandat, denumireSediu);
        }
        return parlamentLazy;
    }

    private ParlamentLazy() {
        this.numeTara = "";
        this.nrParlamentari = 0;
        this.durataMandat = 0;
        this.denumireSediu = "";
    }

    private ParlamentLazy(String numeTara, int nrParlamentari, int durataMandat, String denumireSediu) {
        this.numeTara = numeTara;
        this.nrParlamentari = nrParlamentari;
        this.durataMandat = durataMandat;
        this.denumireSediu = denumireSediu;
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

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("ParlamentLazy{");
        sb.append("numeTara='").append(numeTara).append('\'');
        sb.append(", nrParlamentari=").append(nrParlamentari);
        sb.append(", durataMandat=").append(durataMandat);
        sb.append(", denumireSediu='").append(denumireSediu).append('\'');
        sb.append('}');
        return sb.toString();
    }

}
