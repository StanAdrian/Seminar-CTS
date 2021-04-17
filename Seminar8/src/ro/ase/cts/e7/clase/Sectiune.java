package ro.ase.cts.e7.clase;

import java.util.ArrayList;

public class Sectiune implements ComponentaAbstracta{
    private String numeSectiune;
    private ArrayList<ComponentaAbstracta> listaComponenteAbstracte = new ArrayList<>();

    public Sectiune(String numeSectiune) {
        this.numeSectiune = numeSectiune;
    }

    @Override
    public void printareElement() {
        System.out.println("Sectiunea " + this.numeSectiune);
        for (ComponentaAbstracta c: listaComponenteAbstracte){
            c.printareElement();
        }
    }

    @Override
    public void adaugaNod(ComponentaAbstracta componentaAbstracta) {
      if(componentaAbstracta != null)
        listaComponenteAbstracte.add(componentaAbstracta);
    }

    @Override
    public void stergeNod(ComponentaAbstracta componentaAbstracta) {
        if(componentaAbstracta != null)
        listaComponenteAbstracte.remove(componentaAbstracta);
    }

    @Override
    public ComponentaAbstracta getNod(int pozitie) {
        if(pozitie>=0 && pozitie<listaComponenteAbstracte.size()){
            listaComponenteAbstracte.get(pozitie);
        }
        return (ComponentaAbstracta) new IndexOutOfBoundsException();
    }
}
