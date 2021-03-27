package ro.ase.cts.a2.clase;

public class Asistent extends PersonalMedical{

    public Asistent(String nume, float salariul) {
        super(nume, salariul);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Asistent{");
        sb.append(super.toString()).append('}');
        return sb.toString();
    }
}
