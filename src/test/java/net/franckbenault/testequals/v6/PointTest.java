package net.franckbenault.testequals.v6;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.Test;

import nl.jqno.equalsverifier.EqualsVerifier;

public class PointTest {

	


	@Test
	public void solves_transitivity() {
		Point a = new ColorPoint(1,2, Color.BLUE);
		Point b = new Point(1,2);
		Point c = new ColorPoint(1,2, Color.GREEN);		
	
		assertNotEquals(a,b);
		assertNotEquals(b,c);
		assertNotEquals(a,c);

		
	}
	
	@Test
	public void solves_symetry() {
		Point point = new Point(1,2);
		Point sub = new ColorPoint(1,2, Color.BLUE);
		
	
		assertNotEquals(point,sub);
		assertNotEquals(sub,point);
	}
	
	@Test
	public void solves_liskov_substitution_priciple() {
		Point point = new Point(1,2);
		Point sub = new Point(1,2) {};
		
	
		assertEquals(point,sub);

	}
	
	@Test
	public void testEqualsPoint() {
		
		EqualsVerifier.forClass(ColorPoint.class)
		.withRedefinedSuperclass()
		.verify();
		
		EqualsVerifier.forClass(Point.class)
		.withRedefinedSubclass(ColorPoint.class)
		.verify();
		
	}

}
