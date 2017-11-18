package net.franckbenault.testequals.v6;

import org.junit.Test;

import nl.jqno.equalsverifier.EqualsVerifier;

public class DateTest {
	
	@Test
	public void testEqualsDate() {
		
		EqualsVerifier.forClass(java.util.Date.class)
		.verify();
		
		
	}


}
