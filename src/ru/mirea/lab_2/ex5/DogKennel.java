package ru.mirea.lab_2.ex5;

import java.util.ArrayList;
import java.util.List;

public class DogKennel {
    private List<Dog> dogs;

    public DogKennel() {
        dogs = new ArrayList<>();
    }

    public void addDog(Dog dog) {
        dogs.add(dog);
    }

    public List<Dog> getAllDogs() {
        return dogs;
    }

    public static void main(String[] args) {
        DogKennel shelter = new DogKennel();

        Dog dog1 = new Dog("Шарик", 9);
        Dog dog2 = new Dog("Бобик", 8);

        shelter.addDog(dog1);
        shelter.addDog(dog2);

        List<Dog> dogs = shelter.getAllDogs();
        for (Dog dog : dogs) {
            System.out.println(dog.toString());
            System.out.println("Человеческий возраст собаки: " + dog.humanAge());
        }
    }
}
