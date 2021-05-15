package ro.ase.cts.d15command.clase;

import java.util.List;
import java.util.ArrayList;

public class ManagerComenzi {
    private List<ComandaAbstracta> listaComenzi = new ArrayList<>();

    public void adaugaComanda(ComandaAbstracta comanda) {
        this.listaComenzi.add(comanda);
    }

    public void executaComanda() {
        if (listaComenzi.size() != 0){
            this.listaComenzi.get(0).executa();
            this.listaComenzi.remove(0);
        } else {
            throw new IndexOutOfBoundsException();
        }

    }

}
