package net.franckbenault.testequals.v5;


import static org.junit.Assert.assertEquals;


import org.junit.Test;

import nl.jqno.equalsverifier.EqualsVerifier;
import nl.jqno.equalsverifier.Warning;

public class PointTest {

	
	@Test
	public void whats_the_problem() {
		//ColorPoint is a subclass with new states
		Point point = new Point(1,2);
		Point sub = new ColorPoint(1,2, Color.BLUE);
		
	
		assertEquals(point,sub);
		//symetry ok
		assertEquals(sub,point);
	
		
	}

	@Test
	public void whats_the_problem2() {
		//ColorPoint is a subclass with new states
		Point a = new ColorPoint(1,2, Color.BLUE);
		Point b = new Point(1,2);
		Point c = new ColorPoint(1,2, Color.GREEN);		
	
		assertEquals(a,b);
		assertEquals(b,c);

		//transitivity issue
		assertEquals(a,c);

		
	}
	
	@Test
	public void testEqualsPoint() {
		
		EqualsVerifier.forClass(ColorPoint.class)
		.verify();
		
	}

}
