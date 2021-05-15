package ro.ase.cts.e14Template.clase;

public class SpectatorVip extends SpectatorAbstract{
    private String nume;
    private int nrLoja;

    public SpectatorVip(String nume, int nrLoja) {
        this.nume = nume;
        this.nrLoja = nrLoja;
    }



    @Override
    public void asezareLaCoada() {

    }

    @Override
    public void prezentareBilet() {
        System.out.println(this.nume +  " prezinta biletul pentri loja.");
    }

    @Override
    public void controlCorporal() {
        System.out.println(this.nume + " - control corporal.");
    }

    @Override
    public void ocupaLoc() {
        System.out.println(this.nume + " ocupa locul de la loja.");
    }

}
