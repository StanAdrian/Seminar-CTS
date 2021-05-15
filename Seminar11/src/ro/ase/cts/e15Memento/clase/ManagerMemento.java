package ro.ase.cts.e15Memento.clase;

import java.util.ArrayList;
import java.util.List;

public class ManagerMemento {
    private List<Memento> mementos;

    public ManagerMemento() {
        this.mementos = new ArrayList<>();
    }

    public void adaugaMemento(Memento memento){
        this.mementos.add(memento);
    }

    public Memento getLastMemento(){
        if(this.mementos.size()!=0){
            return this.mementos.get(this.mementos.size()-1);
        } else {
            throw new IndexOutOfBoundsException();
        }
    }

    public Memento getMemento(int index){
        if(index >= 0 && index < this.mementos.size()){
            return this.mementos.get(index);
        } else {
            throw new IndexOutOfBoundsException();
        }
    }


}
