package ro.ase.cts.d15command.program;

import ro.ase.cts.d15command.clase.*;

public class Main {
    public static void main(String[] args) {
        ManagerComenzi managerComenzi = new ManagerComenzi();

        Executant cont = new Executant("Petrica");

        ComandaConstituire comandaConstituire = new ComandaConstituire(cont, 1000);
        managerComenzi.adaugaComanda(comandaConstituire);

        managerComenzi.adaugaComanda(new ComandaRetragere(cont, 200));

        managerComenzi.executaComanda();

        managerComenzi.adaugaComanda(new ComandaDepunere(cont, 500));

        managerComenzi.adaugaComanda(new ComandaRetragere(cont, 2000));

        managerComenzi.executaComanda();
        managerComenzi.executaComanda();
        managerComenzi.executaComanda();

    }
}
