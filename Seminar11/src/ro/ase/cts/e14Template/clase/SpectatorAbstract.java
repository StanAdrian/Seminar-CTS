package ro.ase.cts.e14Template.clase;

public abstract class SpectatorAbstract {

    public final void intraPeStadion(){
        asezareLaCoada();
        prezentareBilet();
        controlCorporal();
        ocupaLoc();
    }

    public abstract void asezareLaCoada();
    public abstract void prezentareBilet();
    public abstract void controlCorporal();
    public abstract void ocupaLoc();

}
