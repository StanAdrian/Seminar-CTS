package ro.ase.cts.e1.clase;

public class FabricaPortar implements FabricaJucator{

    @Override
    public Jucator creazaJucator(String nume, int nrTricou) {
        return new Portar(nume, nrTricou);
    }

}
