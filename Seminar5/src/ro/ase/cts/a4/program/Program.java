package ro.ase.cts.a4.program;

import ro.ase.cts.a4.clase.Reteta;


import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        List<String> listaSolutii = new ArrayList<>();
        listaSolutii.add("Apa");
        List<Integer> listaCantitati = new ArrayList<>();
        listaCantitati.add(10);
        Reteta reteta1 = new Reteta(listaSolutii ,
                listaCantitati);

        Reteta reteta2 = (Reteta) reteta1.copiaza();

        System.out.println(reteta1);

        System.out.println(reteta2);

    }



}
