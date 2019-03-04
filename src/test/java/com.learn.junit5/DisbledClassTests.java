package com.learn.junit5;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

@Disabled
public class DisbledClassTests {
	@Test
	public void test() {
		Assertions.fail("should not run, i am disabled");
	}

	@Test
	public void test2() {
		Assertions.fail("should not run, i am disabled");
	}
}
