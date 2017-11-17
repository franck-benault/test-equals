package net.franckbenault.testequals.v2;


import static org.junit.Assert.assertTrue;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.junit.Test;

import nl.jqno.equalsverifier.EqualsVerifier;
import nl.jqno.equalsverifier.Warning;

public class PointTest {

	
	@Test
	public void whats_the_problem() {
		Point point = new Point(1,2);
		Set<Point> set = new HashSet<Point>();
		set.add(point);
		
		point.setX(2);
		
	
		assertTrue("I cannot find the point in the set",set.contains(point));
		
		
	}
	
	@Test
	public void testEqualsPoint() {
		//issue with the rule 4 consistency
		EqualsVerifier.forClass(Point.class)
		//.suppress(Warning.NONFINAL_FIELDS)
		.verify();
		
	}

}
