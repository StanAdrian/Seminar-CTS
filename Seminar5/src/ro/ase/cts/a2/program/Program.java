package ro.ase.cts.a2.program;

import ro.ase.cts.a2.clase.*;

public class Program {
    public static void main(String[] args) {
        Factory factory = new Factory();

        PersonalMedical medic = factory.create(TipPersonal.MEDIC, "Ionescu", 7000);
        PersonalMedical asistent = factory.create(TipPersonal.ASISTENT, "Popescu", 3000);

        System.out.println(medic);
        System.out.println(asistent);


    }
}
