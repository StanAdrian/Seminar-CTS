package ro.ase.cts.e.clase;

public class Ceas {
    private String numeBrand;
    private String tipCeas;
    private float pret;

    private Ceas() {
        this.numeBrand = "";
        this.tipCeas = "";
        this.pret = 0;
    }

    private Ceas(String numeBrand, String tipCeas, float pret) {
        this.numeBrand = numeBrand;
        this.tipCeas = tipCeas;
        this.pret = pret;
    }



    private static Ceas ceas = null;

    public static synchronized Ceas getInstance( String numeBrand,
            String tipCeas,
             float pret){
        if(ceas==null){
            ceas = new Ceas(numeBrand,tipCeas,pret);
        }
        return ceas;
    }




    public void setNumeBrand(String numeBrand) {
        this.numeBrand = numeBrand;
    }

    public void setTipCeas(String tipCeas) {
        this.tipCeas = tipCeas;
    }

    public void setPret(float pret) {
        this.pret = pret;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Ceas{");
        sb.append("numeBrand='").append(numeBrand).append('\'');
        sb.append(", tipCeas='").append(tipCeas).append('\'');
        sb.append(", pret=").append(pret);
        sb.append('}');
        return sb.toString();
    }
}
