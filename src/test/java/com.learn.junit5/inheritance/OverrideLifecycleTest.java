package com.learn.junit5.inheritance;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

class OverrideLifecycleTest extends BaseLifecycleTest {

    @Override
    void beforeEachTest() {
        System.out.println("Override before each with out providing @BeforeEch");

    }
    @AfterEach
    void afterEachTest() {
        System.out.println("Overriding after each with providing AfterEach tag.");

    }
    @Test
    void test3() {
        System.out.println("This is test3");
    }
}
