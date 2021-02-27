package program;

import java.util.ArrayList;
import java.util.List;

public class Zoo {
    private Zookeeper zookeeper;
    private List<Animal> animalList;

    public Zoo() {
        this.zookeeper = new Zookeeper("Gigel");
        this.animalList = new ArrayList<>();
    }

    public Zoo(Zookeeper zookeeper, List<Animal> animalList) {
        this.zookeeper = zookeeper;
        this.animalList = animalList;
    }

    public void addAnimal(Animal a){
        this.animalList.add(a);
    }

    public void feedAllAnimals(){
        for (Animal a: animalList) {
            zookeeper.feed(a);
        }
    }

}
