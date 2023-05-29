package org.dstu;

import org.dstu.domain.IUniversityPerson;
import org.dstu.domain.Mammal;
import org.dstu.domain.Bird;
import org.dstu.util.CsvReader;
import org.dstu.util.SerializeUtils;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("You must specify data file name and serialize file name!");
            return;
        }

        String sourceFile = args[0];
        String binFile = args[1];

        List<String[]> strings = CsvReader.readCsvFile(sourceFile, ";");
        List<IUniversityPerson> animal = new ArrayList<>();
        for (String[] line: strings) {
            if (line[0].equals("0")) {
                animal.add(new Mammal(line));
            } else {
                animal.add(new Bird(line));
            }
        }

        animal.forEach(System.out::println);

        SerializeUtils.serialize(animal, binFile);
        List<IUniversityPerson> newAnimal = (List<IUniversityPerson>) SerializeUtils.deserialize(binFile);
        System.out.println("Новые люди:");
        newAnimal.forEach(System.out::println);
    }
}
