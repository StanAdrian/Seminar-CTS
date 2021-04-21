package ro.ase.cts.B11.clase;

public class PlataDogecoin implements Payable{
    @Override
    public void pay(float suma) {
        System.out.println("A fost realizata plata cu Dogecoin in valoare" +
                " de " + suma + " lei.");

    }
}
