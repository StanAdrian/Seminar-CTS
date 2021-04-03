package ro.ase.cts.e1.clase;

public class FabricaAtacant implements FabricaJucator{

    @Override
    public Jucator creazaJucator(String nume, int nrTricou) {
        return new Atacant(nume, nrTricou);
    }
}
