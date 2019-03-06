package com.learn.junit5.test_parameters;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EnumSource;
import org.junit.jupiter.params.provider.ValueSource;

public class EnumParamTest {
    @BeforeEach
    public void setup() {
        System.out.println("BeforeEach");
    }

    @AfterEach
    public void cleanup() {
        System.out.println("AfterEach");
    }
    @ParameterizedTest
    @EnumSource(value=MyEnum.class, names={"enum1", "enum4"})
    void testEnumParams(MyEnum value) {
        System.out.println("Parameter value is : " + value);
    }
}
