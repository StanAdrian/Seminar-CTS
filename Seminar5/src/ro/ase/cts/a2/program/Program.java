package ro.ase.cts.a2.program;

import ro.ase.cts.a2.clase.Factory;
import ro.ase.cts.a2.clase.FactorySingleton;
import ro.ase.cts.a2.clase.PersonalMedical;
import ro.ase.cts.a2.clase.TipPersonal;

public class Program {
    public static void main(String[] args) {
        Factory factory = new Factory();

        PersonalMedical medic = factory.create(TipPersonal.MEDIC, "Ionescu", 7000);
        PersonalMedical asistent = factory.create(TipPersonal.ASISTENT, "Popescu", 3000);

        System.out.println(medic);
        System.out.println(asistent);

        PersonalMedical medic2 = FactorySingleton.getInstance().create(TipPersonal.MEDIC,"Pop", 6500);



    }
}
