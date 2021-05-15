package ro.ase.cts.d15command.clase;

public class ComandaConstituire extends ComandaAbstracta{
    public ComandaConstituire(Executant executant, float suma) {
        super(executant, suma);
    }

    @Override
    public void executa() {
        super.getExecutant().creazaCont(super.getSuma());
    }
}
