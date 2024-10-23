package ca.ulaval.glo4002.template.application;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DumbClassTest {

    private DumbClass dumbClass;

    @BeforeEach
    public void setupDoubles() {
        dumbClass = new DumbClass();
    }

    @Test
    public void given_when_then() {
        Integer expectedAnyNumber = 1;

        Integer actualNumber = dumbClass.getNumber();

        assertEquals(expectedAnyNumber, actualNumber);
    }
}