package ro.ase.cts.a2.clase;

public class Factory {
    public PersonalMedical create(TipPersonal tipPersonal, String nume, float salariu){
        switch (tipPersonal){
            case MEDIC: return new Medic(nume, salariu);
            case ASISTENT: return new Asistent(nume, salariu);
            case BRANCARDIER: return new Brancardier(nume, salariu);
            default:throw new IllegalArgumentException("Tip invalid");
        }
    }
}