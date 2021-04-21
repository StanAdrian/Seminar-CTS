package ro.ase.cts.B11.program;

import ro.ase.cts.B11.clase.Client;
import ro.ase.cts.B11.clase.PlataCard;
import ro.ase.cts.B11.clase.PlataCash;
import ro.ase.cts.B11.clase.PlataDogecoin;

public class Main {
    public static void main(String[] args) {
        Client client = new Client("Ionel", new PlataCash());
        client.platesteNota(200);

        client.setPlata(new PlataCard());
        client.platesteNota(123);

        client.setPlata(new PlataDogecoin());
        client.platesteNota(10);
    }
}
