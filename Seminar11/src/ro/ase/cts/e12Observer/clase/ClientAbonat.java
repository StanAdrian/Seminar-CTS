package ro.ase.cts.e12Observer.clase;

public class ClientAbonat implements Observer{
    private String numeClient;

    public ClientAbonat(String numeClient) {
        this.numeClient = numeClient;
    }


    @Override
    public void receptionareMesaj(String string) {
        System.out.println(this.numeClient + " a receptionat mesajul: " + string);
    }
}
