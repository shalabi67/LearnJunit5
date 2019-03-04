package com.learn.junit5;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.Test;

public class AssumptionTests {

	@Test
	public void assume() {
		Assumptions.assumeTrue("aaa".equals("bbb"));
		System.out.println("YOU should not see me: This test will be canceled since the assumption failed.");
	}
	@Test
	public void assumePass() {
		Assumptions.assumeTrue("aaa".equals("aaa"));
		System.out.println("TYou should see me.");
	}

}
