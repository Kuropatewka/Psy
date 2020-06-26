package pl.camp.it.database;

import pl.camp.it.model.Dog;

import java.util.ArrayList;
import java.util.List;

public class DogRepository {
    private static List<Dog> dogs = new ArrayList<>();
    private static final DogRepository dogRepository = new DogRepository();

    private DogRepository() {
        for (int i = 0; i < 10; i++) {
            dogs.add(new Dog());
        }
    }


    public static List<Dog> getDogs() {
        return dogs;
    }

    public static final DogRepository getDogRepository() {
        return dogRepository;
    }
}
