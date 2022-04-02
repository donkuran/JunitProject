package junits;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;

public class StringFunctionTest {

	@Tag("Sanity")
	@DisplayName("Positive Test")
	@Test
	public void Test1() {
		
		assertTrue(StringFunctions.isPalindrome("madam"));
		assertTrue(StringFunctions.isPalindrome("racecar"));
	}
	
	@CustomAnnotation
	public void Test2() {
		
		assertFalse(StringFunctions.isPalindrome("donald"));
	}
	
}
