package Queues;

import java.util.ArrayList;
import java.util.List;

public class AnimalShelter {

    private final List<Animal> animals = new ArrayList<>();

    public void enqueue(Animal animal) {
        animals.add(animal);
    }

    public Animal dequeueAny() {
        return animals.remove(0);
    }

    public Animal dequeueDog() {
        for (int i = 0; i < animals.size(); i++) {
            if (animals.get(i) instanceof Animal.Dog) {
                return animals.remove(i);
            }
        }
        return null;
    }

    public Animal dequeueCat() {
        for (int i = 0; i < animals.size(); i++) {
            if (animals.get(i) instanceof Animal.Cat) {
                return animals.remove(i);
            }
        }
        return null;
    }

    public static void main(String[] args) {
        AnimalShelter animalShelter = new AnimalShelter();
        animalShelter.enqueue(new Animal.Dog("Dog1"));
        animalShelter.enqueue(new Animal.Cat("Cat1"));
        animalShelter.enqueue(new Animal.Dog("Dog2"));
        animalShelter.enqueue(new Animal.Cat("Cat2"));
        animalShelter.enqueue(new Animal.Dog("Dog3"));
        animalShelter.enqueue(new Animal.Cat("Cat3"));
        System.out.println(animalShelter.dequeueAny());
        System.out.println(animalShelter.dequeueDog());
        System.out.println(animalShelter.dequeueCat());
    }

    public interface Animal {

        String name();

        record Dog(String name) implements Animal {}
        record Cat(String name) implements Animal {}
    }
}
