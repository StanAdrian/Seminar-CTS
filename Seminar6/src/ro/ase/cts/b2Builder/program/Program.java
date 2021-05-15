package ro.ase.cts.b2Builder.program;

import ro.ase.cts.b2Builder.clase.BuilderRezervare;
import ro.ase.cts.b2Builder.clase.BuilderRezervareV2;
import ro.ase.cts.b2Builder.clase.Rezervare;

public class Program {
    public static void main(String[] args) {
        Rezervare rezervare = new Rezervare(20,
                false,true, true,false,
                "Gen muzical");
        BuilderRezervare builderRezervare = new BuilderRezervare().setCodRezervare(1)
                .setAreMancareInclusa(true)
                .setAreMuzicaAmbientalaPersonalizata(true).setGenMuzical("Pop");
        Rezervare rezervare1 = builderRezervare.build();

        Rezervare rezervare2 = new BuilderRezervare().setCodRezervare(2)
                .setAreBauturaRacoritoareInclusa(true).build();

        System.out.println(rezervare1);
        System.out.println(rezervare2);

        Rezervare rezervare3 = builderRezervare.setCodRezervare(3).build();

        BuilderRezervareV2 builderRezervareV2 = new BuilderRezervareV2().setAreMancareInclusa(true)
                .setAreScaunErgonomic(true)
                .setAreBauturaRacoritoareInclusa(true);
        Rezervare rez1 = builderRezervareV2.setCodRezervare(10).build();
        Rezervare rez2 = builderRezervareV2.setCodRezervare(11).build();
        Rezervare rez3 = builderRezervareV2.setCodRezervare(12).build();
        Rezervare rez4 = builderRezervareV2.setCodRezervare(13).build();
        Rezervare rez5 = builderRezervareV2.setCodRezervare(14).build();
    }


}
