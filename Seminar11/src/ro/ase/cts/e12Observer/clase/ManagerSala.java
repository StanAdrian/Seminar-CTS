package ro.ase.cts.e12Observer.clase;

public class ManagerSala extends Subiect{
    private String numeSala;

    public ManagerSala(String nume) {
        this.numeSala = nume;
    }

    public void anuntaMeci(String tipMeci){
        super.trimiteNotificare(this.numeSala + " va gazdui meciul de " + tipMeci);
    }

}
