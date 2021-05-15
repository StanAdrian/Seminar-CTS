package ro.ase.cts.e14Template.program;

import ro.ase.cts.e14Template.clase.Spectator;
import ro.ase.cts.e14Template.clase.SpectatorVip;

public class Program {

    public static void main(String[] args) {
        Spectator spectator = new Spectator("Andrei");
        SpectatorVip spectatorVip = new SpectatorVip("Petrica", 20);
        spectator.intraPeStadion();
        System.out.println("==============");
        spectatorVip.intraPeStadion();


    }

}
