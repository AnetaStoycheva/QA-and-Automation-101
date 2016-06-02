import static org.junit.Assert.assertEquals;

import org.junit.Assert;
import org.junit.Test;

public class CalculatorTest {
	@Test
	public void evaluatesExpression() {
		Calculator calculator = new Calculator();
		int sum = calculator.evaluate("1+2+3");
		
		assertEquals(6, sum);
  }
  
	@Test
	public void add() {
		Calculator calculator = new Calculator();
		int res = calculator.add(3, 4);
		Assert.assertNotEquals(6, res);
	}
  
	@Test
 	public void add2() {
		Calculator calculator = new Calculator();
		int res = calculator.add(3, 4);
		
		assertEquals(7, res);
	}
}