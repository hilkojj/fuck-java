package week4.tests;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class PersonTest {
    Person person = null;

    @BeforeEach
    void BeforeEach() {
        person = new Person("Jeremy");
    }

    @AfterEach
    void AfterEach() {
        System.out.println(person);
    }

    @Test void playExampleMoves1() {
        assert person.getName().equals("Jeremy");
    }

}