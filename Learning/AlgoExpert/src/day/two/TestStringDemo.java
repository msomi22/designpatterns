/**
 * 
 */
package day.two;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/**
 * @author KEN19282
 *
 */
class TestStringDemo {

	/**
	 * Test method for {@link day.two.StringDemo#solution(java.lang.String)}.
	 */
	@Test
	void testSolution() {
		assertEquals(StringDemo.solution(null), 0); 
		assertEquals(StringDemo.solution(""), 0); 
		assertEquals(StringDemo.solution("100akhh999lh564abc365bg"), 999); 
		assertEquals(StringDemo.solution("100"), 100); 
		assertEquals(StringDemo.solution("aaaa"), 0); 
		assertEquals(StringDemo.solution("100a99999b7000"), 99999); 
	}
	
	@Test
	void testSolution2() {
		assertEquals(StringDemo.solution("100a99999b7000"), 99999); 
	}

}
