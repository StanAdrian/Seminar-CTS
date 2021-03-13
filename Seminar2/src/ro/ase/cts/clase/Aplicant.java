package ro.ase.cts.clase;

public abstract class Aplicant{
	protected String nume;
	protected String prenume;
	protected int varsta;
	protected int punctaj;
	protected int nr_proiecte;
	protected String[] denumiriProiect;

	
	
	public String getNume() {
		return nume;
	}
	public void setNume(String nume) {
		this.nume = nume;
	}
	public String getPrenume() {
		return prenume;
	}
	public void setPrenume(String prenume) {
		this.prenume = prenume;
	}
	public int getVarsta() {
		return varsta;
	}
	public void setVarsta(int varsta) {
		this.varsta = varsta;
	}

	public void afiseazaStatutInProiect(Proiect proiect){
		StringBuilder sb = new StringBuilder("Aplicantul "+nume+" "+prenume);
		sb.append(punctaj>proiect.getPragAcceptare()?" a fost acceptat.":" nu a fost acceptat.");
		System.out.println(sb);
		}
	public int getPunctaj() {
		return punctaj;
	}
	public void setPunctaj(int punctaj) {
		this.punctaj = punctaj;
	}
	
	

	
	public Aplicant() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Aplicant(String nume, String prenume, int varsta, int punctaj, int nr_proiecte, String[] denumiriProiect) {
		super();
		this.nume = nume;
		this.prenume = prenume;
		this.varsta = varsta;
		this.punctaj = punctaj;
		this.nr_proiecte = nr_proiecte;
		this.denumiriProiect = denumiriProiect;
	}
	public int getNr_proiecte() {
		return nr_proiecte;
	}

	public void setDenumiriProiect(String[] denumiriProiect, int nr_proiecte) {
		this.denumiriProiect = denumiriProiect;
		this.nr_proiecte = nr_proiecte;
	}

	public abstract float getFinantare();

}
