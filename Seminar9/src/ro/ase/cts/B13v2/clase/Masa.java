package ro.ase.cts.B13v2.clase;

public class Masa {
    private int nrMasa;
    private Stare stare;

    public Masa(int nrMasa) {
        this.nrMasa = nrMasa;
        this.stare = new StareLibera();
    }

    public void setNrMasa(int nrMasa) {
        this.nrMasa = nrMasa;
    }

    public int getNrMasa() {
        return nrMasa;
    }

    public Stare getStare() {
        return stare;
    }

    void setStare(Stare stare) {
        this.stare = stare;
    }

    public void ocupaMasa(){
        StareOcupata stareOcupata = new StareOcupata();
        stareOcupata.modificaStare(this);
    }

    public void elibereazaMasa(){
        StareLibera stareLibera = new StareLibera();
        stareLibera.modificaStare(this);
    }

    public void rezervareMasa(){
        StareRezervata stareRezervata = new StareRezervata();
        stareRezervata.modificaStare(this);
    }
}
