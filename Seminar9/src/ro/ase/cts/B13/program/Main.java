package ro.ase.cts.B13.program;

import ro.ase.cts.B13.clase.Masa;

public class Main {
    public static void main(String[] args) {
        Masa masa = new Masa(1);

        masa.cerereEliberare();

        masa.cerereRezervare();
        masa.cerereRezervare();

        masa.cerereOcupare();
        masa.cerereOcupare();

        masa.cerereEliberare();
    }
}
