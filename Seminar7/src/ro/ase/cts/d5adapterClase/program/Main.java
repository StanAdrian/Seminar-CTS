package ro.ase.cts.d5adapterClase.program;

import ro.ase.cts.d5adapterClase.classes.AdapterLeasing;
import ro.ase.cts.d5adapterClase.classes.Creditable;

public class Main {
    public  static void printeazaInfoCredite(Creditable credit){
        credit.creditare();
    }

    public static void main(String[] args) {
        AdapterLeasing adapterLeasing = new AdapterLeasing("Gigel", 123456);
        printeazaInfoCredite(adapterLeasing);
    }
}
