package com.learn.junit5;

import com.learn.junit5.facade.LongOperations;
import com.learn.junit5.facade.Person;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.time.Duration;

public class TimeoutsTests {
	private LongOperations longOperations;
	@BeforeEach
	public void setup() {
		longOperations = new LongOperations();
	}

	@Test
	public void test() {
		Assertions.assertTimeout(Duration.ofMillis(200), ()->{
			longOperations.timeOut();
			System.out.println("You should see me");
		});
	}

	@Disabled("since it is fail test")
	@Test
	public void testWillFail() {
		Assertions.assertTimeout(Duration.ofMillis(100), ()->{
			longOperations.timeOut();
			System.out.println("i am failed: You should see me");
		});
	}

	@Disabled("since it is fail test")
	@Test
	public void testFailPreemptive() {
		Assertions.assertTimeoutPreemptively(Duration.ofMillis(200), ()->{
			longOperations.timeOutLong();
			System.out.println("I am failed preemptive test, You should see me, but should not see the Hello message from LongOperations class.");
		});
	}

	@Test
	public void testPreemptive() {
		Assertions.assertTimeoutPreemptively(Duration.ofMillis(200), ()->{
			longOperations.timeOut();
			System.out.println("I am success preemptive test, You should see me, and should see the Hello message from LongOperations class.");
		});
	}

}
