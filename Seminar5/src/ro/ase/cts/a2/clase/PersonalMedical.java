package ro.ase.cts.a2.clase;

public abstract class PersonalMedical {
    private String nume;
    private float salariul;

    public PersonalMedical(String nume, float salariul) {
        this.nume = nume;
        this.salariul = salariul;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("PersonalMedical{");
        sb.append("nume='").append(nume).append('\'');
        sb.append(", salariul=").append(salariul);
        sb.append('}');
        return sb.toString();
    }
}
