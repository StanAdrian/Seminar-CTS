package ro.ase.cts.e12Observer.program;

import ro.ase.cts.e12Observer.clase.ClientAbonat;
import ro.ase.cts.e12Observer.clase.ManagerSala;

public class Program {
    public static void main(String[] args) {
        ManagerSala managerSala = new ManagerSala("Manager1");

        ClientAbonat clientAbonat1 = new ClientAbonat("Popescu");
        ClientAbonat clientAbonat2 = new ClientAbonat("Ionescu");

        managerSala.adaugaAbonat(clientAbonat1);
        managerSala.adaugaAbonat(clientAbonat2);
        managerSala.anuntaMeci("Volei");

        managerSala.stergereAbonat(clientAbonat1);

        managerSala.anuntaMeci("Fotbal");

    }
}
