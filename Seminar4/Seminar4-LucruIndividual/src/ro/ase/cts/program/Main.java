package ro.ase.cts.program;

import ro.ase.cts.clase.Ceas;

public class Main {
    public static void main(String[] args) {
        Ceas ceas1 = Ceas.getInstance("Fossil","",0);
        Ceas ceas2 = Ceas.getInstance("Seiko","",0);
        System.out.println(ceas1);
        System.out.println(ceas2);
        System.out.println("=========");
        ceas1.setNumeBrand("automatic");
        ceas2.setPret(500);
        System.out.println(ceas1);
        System.out.println(ceas2);
    }

}
