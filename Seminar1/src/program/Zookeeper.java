package program;

public class Zookeeper {
    private String name;

    public Zookeeper(String name) {
        this.name = name;
    }

    public void feed (Animal a){
        System.out.println("Ingrijitorul " + this.name + " ingrijeste animalul " + a.getName());
    }

}
