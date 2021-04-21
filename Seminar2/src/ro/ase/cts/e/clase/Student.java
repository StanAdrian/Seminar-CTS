package ro.ase.cts.e.clase;

import java.util.Arrays;

public class Student extends Aplicant {
	protected String facultate;
	protected int an_studii;
	private static float sumaFinatata = 20;
	
	
	public String getFacultate() {
		return facultate;
	}
	public void setFacultate(String facultate) {
		this.facultate = facultate;
	}
	public int getAn_studii() {
		return an_studii;
	}
	public void setAn_studii(int an_studii) {
		this.an_studii = an_studii;
	}

	public static float getSumaFinatata() {
		return sumaFinatata;
	}

	public static void setSumaFinatata(float sumaFinatata) {
		Student.sumaFinatata = sumaFinatata;
	}

	public Student() {
		super();
		
	}

	public Student(String nume, String prenume, int varsta, int punctaj, int nr_proiecte, String[] denumireProiect, String facultate, int an_studii) {
		super(nume,prenume,varsta,punctaj,nr_proiecte,denumireProiect);
		this.facultate = facultate;
		this.an_studii = an_studii;
	}
	@Override
	public String toString() {
		return "Student: Nume=" + nume + ", Prenume=" + prenume + ", Varsta=" + varsta + ", Punctaj=" + punctaj +
				", Nr_proiecte=" + nr_proiecte +  ", DenumireProiect=" + Arrays.toString(denumiriProiect) +
				"Facultate=" + facultate + ", An_studii=" + an_studii ;
	}
	
	


	@Override
	public float getFinantare() {
		return sumaFinatata;
	}

}
