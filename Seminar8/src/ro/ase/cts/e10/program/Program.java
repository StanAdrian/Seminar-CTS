package ro.ase.cts.e10.program;

import ro.ase.cts.e10.clase.FlyweightFactory;
import ro.ase.cts.e10.clase.Rezervare;

public class Program {
    public static void main(String[] args) {
        Rezervare rezervare1 = new Rezervare(1, 10);
        Rezervare rezervare2 = new Rezervare(2, 11);
        Rezervare rezervare3 = new Rezervare(3, 12);
    }

    FlyweightFactory flyweightFactory = new FlyweightFactory();

}
