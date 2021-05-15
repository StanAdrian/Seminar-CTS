package ro.ase.cts.d16chainOfResposability.program;

import ro.ase.cts.d16chainOfResposability.clase.ContCredit;
import ro.ase.cts.d16chainOfResposability.clase.ContCurent;
import ro.ase.cts.d16chainOfResposability.clase.ContEconomi;

public class Program {
    public static void main(String[] args) {
        ContCurent contCurent = new ContCurent(120);
        ContEconomi contEconomi = new ContEconomi(380);
        ContCredit contCredit = new ContCredit(160);

        contCurent.setCont(contEconomi);
        contEconomi.setCont(contCredit);

        contCurent.realizarePlata(20);
        contCurent.realizarePlata(90);
        contCurent.realizarePlata(80);
        contCurent.realizarePlata(120);
        contCurent.realizarePlata(200);
        contCurent.realizarePlata(300);

    }
}
