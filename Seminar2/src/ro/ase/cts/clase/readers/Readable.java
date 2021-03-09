package ro.ase.cts.clase.readers;

import ro.ase.cts.clase.Aplicant;

import java.util.List;
import java.io.FileNotFoundException;

public interface Readable {
    List<Aplicant> readAplicant(String file) throws FileNotFoundException;
}
