package ro.ase.cts.a2.clase;

public class Brancardier extends PersonalMedical{

    public Brancardier(String nume, float salariul) {
        super(nume, salariul);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Brancardier{");
        sb.append(super.toString()).append('}');
        return sb.toString();
    }
}
