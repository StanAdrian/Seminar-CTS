package ro.ase.cts.e7.clase;

public class FabricaMijlocas implements FabricaJucator{

    @Override
    public Jucator creazaJucator(String nume, int nrTricou) {
        return new Mijlocas(nume, nrTricou);
    }
}
