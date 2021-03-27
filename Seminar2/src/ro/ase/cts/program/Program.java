package ro.ase.cts.program;


import ro.ase.cts.clase.Aplicant;
import ro.ase.cts.clase.Proiect;
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
			Proiect proiect = new Proiect(80);
			listaAplicanti =citesteAplicanti(new ElevReader("Seminar2/elevi.txt"));
			for(Aplicant aplicant:listaAplicanti){
				System.out.println(aplicant.toString());
				System.out.println(aplicant.getFinantare());
				aplicant.afiseazaStatutInProiect(proiect);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
