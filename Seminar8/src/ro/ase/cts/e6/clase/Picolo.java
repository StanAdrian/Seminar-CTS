package ro.ase.cts.e6.clase;

 class Picolo {
    private String nume;

    public Picolo(String nume) {
        this.nume = nume;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Picolo{");
        sb.append("nume='").append(nume).append('\'');
        sb.append('}');
        return sb.toString();
    }

    public boolean esteDebarasataMasa(int nrMasa){
        return nrMasa%3==0;
    }
    public boolean esteAranjata(int nrMasa){
        return nrMasa%5==0;
    }

}
