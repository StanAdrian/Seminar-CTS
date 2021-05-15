package ro.ase.cts.b6Facade.program;

import ro.ase.cts.b6Facade.clase.Facade;
import ro.ase.cts.b6Facade.clase.Masa;

public class Program {
    public static void main(String[] args) {

        if(Facade.esteMasaPregatita(new Masa(2,4))){
            System.out.println("Poftiti la masa!");
        } else {
            System.out.println("Va rugam mai asteptati putin.");
        }

    }

}
