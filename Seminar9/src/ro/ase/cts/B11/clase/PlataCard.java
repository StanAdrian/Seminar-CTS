package ro.ase.cts.B11.clase;

public class PlataCard implements Payable{
    @Override
    public void pay(float suma) {
        System.out.println("A fost realizata plata prin card in valoare" +
                " de " + suma + " lei.");
    }
}
