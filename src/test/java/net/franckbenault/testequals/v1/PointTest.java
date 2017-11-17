package net.franckbenault.testequals.v1;

import static org.junit.Assert.assertTrue;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

import nl.jqno.equalsverifier.EqualsVerifier;

public class PointTest {

	
	@Test
	public void what_the_problem() {
		Point point = new Point(1,2);
		Point clone = new Point(1,2);
		
		List<Point> list = Arrays.asList(point);
		
		assertTrue(point.equals(clone));
		assertTrue("????",list.contains(clone));
		
		
	}
	
	@Test
	public void testEqualsPoint() {
		EqualsVerifier.forClass(Point.class).verify();
		
	}

}
