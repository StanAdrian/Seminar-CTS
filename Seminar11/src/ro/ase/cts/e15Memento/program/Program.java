package ro.ase.cts.e15Memento.program;

import ro.ase.cts.e15Memento.clase.ManagerMemento;
import ro.ase.cts.e15Memento.clase.Meci;

public class Program {
    public static void main(String[] args) {
        ManagerMemento manager = new ManagerMemento();

        Meci meci = new Meci("Steaua", "Craiova", 1040, 1000, 120);
        manager.adaugaMemento(meci.creareMemento());

        meci.setEchipaGazda("Rapid");
        meci.setNrBilete(1500);
        meci.setNrSpectatori(1495);
        manager.adaugaMemento(meci.creareMemento());
        System.out.println(meci);
        System.out.println("============================");

        meci.setMemento(manager.getMemento(0));
        System.out.println(meci);
        System.out.println("===============================");

        meci.setMemento(manager.getLastMemento());
        System.out.println(meci);


    }
}
