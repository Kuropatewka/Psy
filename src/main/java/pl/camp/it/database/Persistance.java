package pl.camp.it.database;

import pl.camp.it.model.Dog;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Persistance {
    private static final String fileName = "/home/piotr/IdeaProjects/Psy.txt";

    public static void saveDog() {

        try {
            FileWriter fileWriter = new FileWriter(fileName);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            boolean flag = false;

            for (Dog dogs : DogRepository.getDogRepository().getDogs()) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Imie: ")
                        .append(dogs.getName())
                        .append(" Wiek: ")
                        .append(dogs.getAge());
                if (flag) {
                    bufferedWriter.newLine();
                }
                flag = true;
                bufferedWriter.append(stringBuilder.toString());
            }
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
