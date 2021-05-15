package ro.ase.cts.e12Observer.clase;

import java.util.ArrayList;
import java.util.List;

public abstract class Subiect {

    private List<Observer> listaObservari;

    public Subiect() {
        this.listaObservari = new ArrayList<>();
    }

    public void adaugaAbonat(Observer observer){
        this.listaObservari.add(observer);
    }
    public void stergereAbonat(Observer observer){
        this.listaObservari.remove(observer);
    }
    public void  trimiteNotificare(String mesaj){
        for (Observer o : listaObservari) {
            o.receptionareMesaj(mesaj);
        }
    }

}
