package ncu.cc.test;

import static org.junit.Assert.*;

import org.junit.Test;

//import test.Add;

public class AddTest {

	@Test
	public void testAdd() {
		//fail("Not yet implemented");
		Add a = new Add();
		assertEquals(12,a.add(11, 1));
		
	}
}
