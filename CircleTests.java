package lab5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CircleTests {

	// Point Class Tests
	
	@Test
	void testCircumfrenceEquals() {
		Circle c = new Circle(new Point(0, 0), 2);
		assertEquals(c.getCircumference(), 2 * Math.PI * 2);
	}
}
