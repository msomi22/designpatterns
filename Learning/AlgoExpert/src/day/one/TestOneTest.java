package day.one;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestOneTest {

	@Test
	void testInvert() {
		
		assertEquals("dcba", TestOne.invert("abcd".toCharArray()));
		assertEquals("", TestOne.invert("".toCharArray()));
		assertEquals("", TestOne.invert(null));
		assertEquals("a", TestOne.invert("a".toCharArray()));
		
		
	}

}
