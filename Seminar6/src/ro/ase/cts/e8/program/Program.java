package ro.ase.cts.e8.program;


import ro.ase.cts.e8.clase.*;
import ro.ase.cts.e8.clase.*;

public class Program {

    public static void afiseazaInformatiiJucator(FabricaJucator fabricaJucator,
                                                 String nume, int nrTricou){
        Jucator jucator = fabricaJucator.creazaJucator(nume, nrTricou);
        System.out.println(jucator);
    }

    public static void main(String[] args) {
        System.out.println("");
        afiseazaInformatiiJucator(new FabricaAtacant(),"Popescu",10);
        afiseazaInformatiiJucator(new FabricaPortar(),"Ionescu",1);
        afiseazaInformatiiJucator(new FabricaMijlocas(),"Scarlat",8);

    }


}
