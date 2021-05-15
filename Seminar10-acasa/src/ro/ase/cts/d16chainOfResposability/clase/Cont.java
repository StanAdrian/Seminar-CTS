package ro.ase.cts.d16chainOfResposability.clase;

public abstract class Cont{
    private float sold;
    private Cont contSuccesor;

    public Cont(float sold) {
        this.sold = sold;
        this.contSuccesor = null;
    }

    public float getSold() {
        return sold;
    }

    public void setSold(float sold) {
        this.sold = sold;
    }

    public Cont getContSuccesor() {
        return contSuccesor;
    }

    public void setCont(Cont cont) {
        this.contSuccesor = cont;
    }

    public abstract void realizarePlata(float suma);

}
