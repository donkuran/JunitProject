package junits;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Tags;

public class CalculatorTest {

	@Tag("Sanity")
	@DisplayName("Addition Test")
	@Test
	public void addTest1() {
		
		assertEquals(24, Calculator.Add(11, 13));
	}
	
	@Tag("Sanity")
	@DisplayName("Subtraction Test")
	@Test
	public void subTest1() {
		
		assertEquals(11, Calculator.Sub(24, 13));
	}
	
	@DisplayName("Multiplication Test")
	@Disabled
	@Test
	public void mulTest1() {
		
		assertEquals(52, Calculator.Mul(4, 13));
	}
	
}
