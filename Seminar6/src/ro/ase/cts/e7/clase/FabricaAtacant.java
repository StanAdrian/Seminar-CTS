package ro.ase.cts.e7.clase;

public class FabricaAtacant implements FabricaJucator{

    @Override
    public Jucator creazaJucator(String nume, int nrTricou) {
        return new Atacant(nume, nrTricou);
    }
}
