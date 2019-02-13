package week1;

import java.util.ArrayList;
import java.util.List;

public class Opvage_LAMBDA { // DONE
    private class Developer {
        String name;
        int age;

        Developer (String name, int age) {
            this.name = name;
            this.age = age;
        }

        int getAge() {
            return this.age;
        }

        @Override
        public String toString() {
            return("name = " + this.name + " age = " + this.age);
        }
    }


    private Opvage_LAMBDA() {
        List<Developer> listDevs = getDevelopers();

        System.out.println("Before Sort");
        listDevs.forEach(System.out::println);

        // sort the list on age
        listDevs.sort((d1, d2) -> d2.age - d1.age);

        System.out.println("After Sort");
        listDevs.forEach(System.out::println);
    }

    private List<Developer> getDevelopers() {

        List<Developer> result = new ArrayList<>();

        result.add(new Developer("Alwin", 33));
        result.add(new Developer("Peter", 24));
        result.add(new Developer("Johan", 26));
        result.add(new Developer("Tanja", 25));

        return result;
    }

    public static void main(String[] args) { new Opvage_LAMBDA(); }
}
