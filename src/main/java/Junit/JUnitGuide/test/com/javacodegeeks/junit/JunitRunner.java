package Junit.JUnitGuide.test.com.javacodegeeks.junit;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class JunitRunner {

	public static void main(String[] args) {

		Class<?> aa     = AssertionsTest.class;

		Result                result = JUnitCore.runClasses(aa);
		for (Failure fail : result.getFailures()) {
			System.out.println(fail.toString());
		}
		if (result.wasSuccessful()) {
			System.out.println("All tests finished successfully...");
		}
	}
}
