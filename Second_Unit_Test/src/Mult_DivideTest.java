import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Mult_DivideTest {

	@Test
	void test() {
		//fail("Not yet implemented");
	}
	
	void Test_mult() {
		Mult_Divide prod=new Mult_Divide();
		int expected=200, actual=prod.mult(8, 5, 4);
		assertEquals(expected,actual);
	}
	
	void Test_div() {
		Mult_Divide rem=new Mult_Divide();
		double expected=10, actual=rem.div(20, 2);
		assertEquals(expected,actual);
	}

}
