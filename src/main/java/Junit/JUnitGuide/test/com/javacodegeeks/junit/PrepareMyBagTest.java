package Junit.JUnitGuide.test.com.javacodegeeks.junit;

import Junit.JUnitGuide.src.com.javacodegeeks.junit.FirstDayAtSchool;
import org.junit.Test;
import static org.junit.Assert.*;

public class PrepareMyBagTest {

	FirstDayAtSchool school = new FirstDayAtSchool();

	String[] bag = { "Books", "Notebooks", "Pens" };

	@Test
	public void testPrepareMyBag() {

		System.out.println("Inside testPrepareMyBag()");
		assertArrayEquals(bag, school.prepareMyBag());

	}

}
