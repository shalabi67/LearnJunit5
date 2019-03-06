package com.learn.junit5.test_parameters;

import com.learn.junit5.facade.Person;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.EnumSource;

public class CSVParamTest {
    @BeforeEach
    public void setup() {
        System.out.println("BeforeEach");
    }

    @AfterEach
    public void cleanup() {
        System.out.println("AfterEach");
    }

    @ParameterizedTest
    @CsvSource({
            "mohammad, shalabi, 123, true",
            "ahmad, asad, 456, false"
    })
    void testCsvParams(String firstName, String lastName, String phoneNumber, boolean isMarried) {
        System.out.println("firstName " + firstName);
        System.out.println("lastName " + lastName);
        System.out.println("phoneNumber " + phoneNumber);
        System.out.println("isMarried " + isMarried);

        Person person = new Person(firstName, lastName, phoneNumber, isMarried);
    }
    @ParameterizedTest
    @CsvFileSource(delimiter=',', resources = {"/persons.csv"})
    void testCsvFileParams(String firstName, String lastName, String phoneNumber, boolean isMarried) {
        System.out.println("firstName " + firstName);
        System.out.println("lastName " + lastName);
        System.out.println("phoneNumber " + phoneNumber);
        System.out.println("isMarried " + isMarried);

        Person person = new Person(firstName, lastName, phoneNumber, isMarried);
    }
}
