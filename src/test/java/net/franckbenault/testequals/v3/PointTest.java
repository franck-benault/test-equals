package net.franckbenault.testequals.v3;


import static org.junit.Assert.assertEquals;


import org.junit.Test;

import nl.jqno.equalsverifier.EqualsVerifier;
import nl.jqno.equalsverifier.Warning;

public class PointTest {

	
	@Test
	public void whats_the_problem() {
		//trivial subclass mockito hibernate use trivial subclasses
		Point point = new Point(1,2);
		Point sub = new Point(1,2) {};
		
	
		assertEquals(point,sub);
		
		
	}
	
	@Test
	public void testEqualsPoint() {
		
		EqualsVerifier.forClass(Point.class)
		//.usingGetClass()
		//.suppress(Warning.STRICT_INHERITANCE)
		.verify();
		
	}

}
