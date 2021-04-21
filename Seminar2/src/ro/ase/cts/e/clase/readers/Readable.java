package ro.ase.cts.e.clase.readers;

import ro.ase.cts.e.clase.Aplicant;

import java.util.List;
import java.io.FileNotFoundException;
import java.util.Scanner;

public abstract class Readable {
    protected String numeFisier;

    public Readable(String numeFisier) {
        this.numeFisier = numeFisier;
    }

    public abstract List<Aplicant> readAplicanti() throws FileNotFoundException;

    public void citesteAplicant(Scanner scanner, Aplicant aplicant){
        String nume = scanner.next();
        String prenume = scanner.next();
        int varsta = scanner.nextInt();
        int punctaj = scanner.nextInt();
        int nr = scanner.nextInt();
        String[] vect = new String[5];
        for (int i = 0; i < nr; i++)
            vect[i] = scanner.next();

        aplicant.setNume(nume);
        aplicant.setPrenume(prenume);
        aplicant.setPunctaj(punctaj);
        aplicant.setVarsta(varsta);
        aplicant.setDenumiriProiect(vect, nr);
    }

}
