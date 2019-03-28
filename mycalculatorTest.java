package calculator1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class mycalculatorTest extends mycalculator {

	@Test
	public void testadd() {
		mycalculator calculate=new mycalculator();
		assertEquals(100,calculate.add(50,50));
		assertEquals(50,calculate.add(20,30));
		}
	@Test
	public void testsub() {
		mycalculator calculate=new mycalculator();
		assertEquals(3,calculate.sub(25,22));
		assertEquals(2,calculate.sub(4,2));
		}
	@Test
	public void testmul() {
		mycalculator calculate=new mycalculator();
		assertEquals(100,calculate.mul(25,4));
		assertEquals(600,calculate.mul(20,30));
		}
	@Test
	public void testdiv() {
		mycalculator calculate=new mycalculator();
		assertEquals(6,calculate.div(18,3));
		assertEquals(5,calculate.div(20,4));
		}

}
