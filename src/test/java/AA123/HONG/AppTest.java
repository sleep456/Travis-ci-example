package AA123.HONG;

import static org.junit.Assert.*;

import org.junit.Test;


/**
 * Unit test for simple App.
 */
public class AppTest 
{
	@Test
	public void testAdd() {
		App x=new App();
		assertEquals(3,x.Add(1,2));
	}
	@Test
	public void testSub() {
		App x=new App();
		assertEquals(-1,x.Sub(1,2));
	}
}
