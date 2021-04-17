package ro.ase.cts.e7.program;

import ro.ase.cts.e7.clase.Produs;
import ro.ase.cts.e7.clase.Sectiune;

public class Program {
    public static void main(String[] args) {
        Sectiune bauturi = new Sectiune("Baututri");
        Sectiune desert = new Sectiune("Desert");
        Produs produs1 = new Produs("Coca-cola");
        Produs produs2 = new Produs("Tiramisu");
        Produs produs3 = new Produs("Frappe");

        Sectiune meniu = new Sectiune("Meniu");

        meniu.adaugaNod(bauturi);
        meniu.adaugaNod(desert);

        bauturi.adaugaNod(produs1);
        bauturi.adaugaNod(produs3);
        desert.adaugaNod(produs2);

        meniu.printareElement();

    }
}
