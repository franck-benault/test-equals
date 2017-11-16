package net.franckbenault.testequals.v0;


import org.junit.Test;

import nl.jqno.equalsverifier.EqualsVerifier;

public class PointTest {

	@Test
	public void testEquals() {
		EqualsVerifier.forClass(Point.class).verify();
	}

}
