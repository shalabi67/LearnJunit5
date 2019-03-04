package com.learn.junit5;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class LifecycleTest {
	@BeforeAll
	static void classScopeBefore() {
		System.out.println("Before anything: This is class scope, will be called before any test");
	}

	@AfterAll
	static void classScopeAfter() {
		System.out.println("After everything: This is class scope, will run once after all tests");
	}

	@BeforeEach
	void beforeEachTest() {
		System.out.println("Before each test: This is test scope, will run once before any test.");

	}
	@AfterEach
	void afterEachTest() {
		System.out.println("After each test: This is test scope, will run once after any test.");

	}

	@Test
	void test1() {
		System.out.println("This is test1");
	}
	@Test
	void test2() {
		System.out.println("This is test2");
	}

}
