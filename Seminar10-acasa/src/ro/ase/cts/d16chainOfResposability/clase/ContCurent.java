package ro.ase.cts.d16chainOfResposability.clase;

public class ContCurent extends Cont{
    public ContCurent(float sold) {
        super(sold);
    }


    @Override
    public void realizarePlata(float suma) {
        if (super.getSold() >= suma){
            System.out.println("S-a realizat plata in valoare de " + suma + " lei din contul curent.");
            super.setSold(super.getSold() - suma);
        } else if (super.getContSuccesor() != null) {
            super.getContSuccesor().realizarePlata(suma);
        } else {
            System.out.println("Fonduri insuficiente - Nu se poate realiza plata!");
        }

    }
}
