package ro.ase.cts.program;


import ro.ase.cts.clase.Aplicant;
import ro.ase.cts.clase.readers.ElevReader;
import ro.ase.cts.clase.readers.Readable;

import java.io.FileNotFoundException;
import java.util.List;

public class Program {
	public static List<Aplicant> citesteAplicanti(Readable readable) throws FileNotFoundException {
		return readable.readAplicanti();
	}

	public static void main(String[] args) {
		List<Aplicant> listaAplicanti;

		try {
			listaAplicanti =citesteAplicanti(new ElevReader("Seminar2/studenti.txt"));
			for(Aplicant aplicant:listaAplicanti)
				System.out.println(aplicant.toString());
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
