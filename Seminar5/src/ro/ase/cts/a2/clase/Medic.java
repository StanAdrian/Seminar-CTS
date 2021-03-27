package ro.ase.cts.a2.clase;

public class Medic extends PersonalMedical{


    public Medic(String nume, float salariul) {
        super(nume, salariul);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Medic{");
        sb.append(super.toString()).append('}');
        return sb.toString();
    }
}
