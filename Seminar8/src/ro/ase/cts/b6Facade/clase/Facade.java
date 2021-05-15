package ro.ase.cts.b6Facade.clase;

public class Facade {
    public static boolean esteMasaPregatita(Masa masa1) {

        if (OperatorMese.esteLibera(masa1.getNrMasa())) {
            Picolo picolo1 = new Picolo("Andrei");
            if (picolo1.esteDebarasataMasa(masa1.getNrMasa())) {
                if (picolo1.esteAranjata(masa1.getNrMasa())) {
                    return true;
                }
            }
        }
        return false;
    }
}