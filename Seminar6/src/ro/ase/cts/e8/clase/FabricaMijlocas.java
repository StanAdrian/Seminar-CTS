package ro.ase.cts.e8.clase;

public class FabricaMijlocas implements FabricaJucator{

    @Override
    public Jucator creazaJucator(String nume, int nrTricou) {
        return new Mijlocas(nume, nrTricou);
    }
}
