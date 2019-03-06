package com.learn.junit5.test_parameters;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class ValueParamTest {
    @BeforeEach
    public void setup() {
        System.out.println("BeforeEach");
    }

    @AfterEach
    public void cleanup() {
        System.out.println("AfterEach");
    }

    @ParameterizedTest
    @ValueSource(strings = {"first", "second", "third", "forth"})
    void testStringParams(String value) {
        System.out.println("Parameter value is : " + value);
    }

    @ParameterizedTest(name = "{displayName} - Param[{index}]={arguments}")
    @ValueSource(ints = {100, 400, 300, 600})
    void testIntegerParams(int value) {
        System.out.println("Parameter value is : " + value);
    }
}
