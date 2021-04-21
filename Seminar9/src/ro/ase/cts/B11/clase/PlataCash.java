package ro.ase.cts.B11.clase;

public class PlataCash implements Payable{

    @Override
    public void pay(float suma) {
        System.out.println("A fost realizata plata cash in valoare" +
                " de " + suma + " lei.");
    }
}
