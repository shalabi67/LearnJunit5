package com.learn.junit5.test_informtion;

import com.learn.junit5.inheritance.BaseLifecycleTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;
import org.junit.jupiter.api.TestReporter;

public class TestInformationTest extends BaseLifecycleTest {

    @Test
    public void test3() {
        System.out.println("This is test3");
    }

    @Test
    public void testInfo(TestInfo testInfo, TestReporter testReporter) {

        System.out.println("This is " + testInfo.getDisplayName());
        System.out.println("test tags" + testInfo.getTags());
    }
}
