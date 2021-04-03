package ro.ase.cts.e2.clase;

public class FabricaFundas implements FabricaJucator{

    @Override
    public Jucator creazaJucator(String nume, int nrTricou) {
        return new Fundas(nume, nrTricou);
    }

}
