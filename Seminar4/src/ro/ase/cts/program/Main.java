package ro.ase.cts.program;

import ro.ase.cts.clase.ParlamentLazy;
import ro.ase.cts.clase.Parlament;

public class Main {
    public static void main(String[] args) {
        Parlament parlament1 = Parlament.getInstance();
        Parlament parlament2 = Parlament.getInstance();
        System.out.println(parlament1.toString());
        System.out.println(parlament2.toString());
        System.out.println("=====================");
        parlament1.setNumeTara("Belgia");
        parlament2.setNrParlamentari(300);
        System.out.println(parlament1.toString());
        System.out.println(parlament2.toString());
        System.out.println("================================================");

        ParlamentLazy parlamentLazy1 = ParlamentLazy.getInstance("Serbia",400, 8, "Sediul Serbiei");
        ParlamentLazy parlamentLazy2 = ParlamentLazy.getInstance("UK",100, 2, "Sediul UK");
        System.out.println(parlamentLazy1.toString());
        System.out.println(parlamentLazy2.toString());
        System.out.println("========================");



    }


}
