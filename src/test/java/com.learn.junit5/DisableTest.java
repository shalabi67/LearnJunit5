package com.learn.junit5;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

public class DisableTest {
	@Test
	@Disabled
	public void test() {
		Assertions.fail("should not run, i am disabled");
	}

}
