package ro.ase.cts.d6decorator.program;

import ro.ase.cts.d6decorator.classes.DecoratorContactLessTelefon;
import ro.ase.cts.d6decorator.classes.Card;
import ro.ase.cts.d6decorator.classes.DecoratorContactLessCard;

public class Main {
    public static void main(String[] args) {

        Card card = new Card("Gigel");
        card.platesteOnLine();;
        card.platestePOS();

        DecoratorContactLessCard decoratorContactLess = new DecoratorContactLessCard(card);

        System.out.println("============================================================");
        decoratorContactLess.platesteContactLess();
        decoratorContactLess.platestePOS();
        decoratorContactLess.platesteOnLine();

        System.out.println("============================================================");
        DecoratorContactLessTelefon decoratorContactLessTelefon = new DecoratorContactLessTelefon(card);
        decoratorContactLessTelefon.platesteContactLess();;
        decoratorContactLessTelefon.platesteOnLine();
        decoratorContactLess.platestePOS();
    }
}
