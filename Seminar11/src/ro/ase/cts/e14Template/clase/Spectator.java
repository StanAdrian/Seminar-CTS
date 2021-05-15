package ro.ase.cts.e14Template.clase;

public class Spectator extends SpectatorAbstract{
    private String nume;

    public Spectator(String nume) {
        this.nume = nume;
    }

    @Override
    public void asezareLaCoada() {
        System.out.println(this.nume + " se aseaza la coada.");
    }

    @Override
    public void prezentareBilet() {
        System.out.println(this.nume + " prezinta bilet.");
    }

    @Override
    public void controlCorporal() {
        System.out.println(this.nume + " - control corporal.");
    }

    @Override
    public void ocupaLoc() {
        System.out.println(this.nume + " ocupa loc.");
    }


}
