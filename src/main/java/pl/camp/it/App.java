package pl.camp.it;

import pl.camp.it.database.Persistance;

public class App {
    public static void main(String[] args) {

        Persistance.saveDog();
        System.out.println("Zapisano");
    }
}
