package junits;

import static org.junit.jupiter.api.Assertions.*;

import java.time.Month;
import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.*;

public class ParametersExample {

	@ParameterizedTest
	@ValueSource(strings = {"madam", "radar", "donald"})
	public void Test1(String name) {
		
		assertTrue(StringFunctions.isPalindrome(name));

	}
	
	@ParameterizedTest
	@ValueSource(ints = {12, 5, 18, 56})
	public void Test2(int num) {
		
		assertTrue(num % 2 == 0);
		
	}
	
	@ParameterizedTest
	@EnumSource(Month.class)
	public void Test3(Month month) {
		
		int monthVal = month.getValue();
		System.out.println(monthVal);
		
		assertTrue(monthVal < 13);
	}
	
	@ParameterizedTest
	@EnumSource(value = Month.class, names = {"APRIL", "JUNE", "SEPTEMBER", "NOVEMBER"})
	public void Test4(Month month) {
		
		assertEquals(30, month.length(false));
	}
	
	@ParameterizedTest
	@EnumSource(value = Month.class, names = {"FEBRUARY"})
	public void Test5(Month month) {
		
		assertEquals(28, month.length(false));
	}
	
	@ParameterizedTest
	@MethodSource("DPMethod")
	public void Test6(String name) {
		
		assertTrue(StringFunctions.isPalindrome(name));

	}
	
	public static Stream<String> DPMethod() {
		
		return Stream.of("radar", "mom", "dad", "racecar", "donald");
	}
	
}
