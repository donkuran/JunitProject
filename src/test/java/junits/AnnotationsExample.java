package junits;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class AnnotationsExample {

	@BeforeAll
	public static void Method3() {
	
		System.out.println("Inside Before All");
	}
	
	@BeforeEach
	public void Method1() {
		
		System.out.println("Inside Before Each");
	}
	
	@Test
	public void addTest1() {
		
		assertEquals(24, Calculator.Add(11, 13));
		System.out.println("Inside Test 1");
	}
	
	@Test
	public void addTest2() {
		
		assertEquals(33, Calculator.Add(20, 13));
		assertTrue(true);
		
		String[] array1 = {"one", "two", "three"};
		String[] array2 = {"one", "two", "three"};
		
		assertArrayEquals(array1, array2);
		
		System.out.println("Inside Test 2");
	}
	
	@AfterEach
	public void Method2() {
		
		System.out.println("Inside After Each");
	}
	
	@AfterAll
	public static void Method4() {
	
		System.out.println("Inside After All");
	}
	
}
