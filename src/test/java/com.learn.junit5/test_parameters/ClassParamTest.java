package com.learn.junit5.test_parameters;

import com.learn.junit5.facade.Person;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EnumSource;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

public class ClassParamTest {
    @BeforeEach
    public void setup() {
        System.out.println("BeforeEach");
    }

    @AfterEach
    public void cleanup() {
        System.out.println("AfterEach");
    }

    @ParameterizedTest
    @MethodSource("com.learn.junit5.facade.PersonsData#getPersons")
    void testEnumParams(Person value) {
        System.out.println("Parameter value is : " + value.getFirstName());
    }
}
