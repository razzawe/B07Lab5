package lab5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class HeptagonTests {
	@Test
	void testGetArea() {
		Heptagon h = new Heptagon(1, 12, new Point(1, 1));
		assertEquals(h.getArea(), (7/4) * (1/Math.tan(Math.PI/7)), 0.01);
	}
			
	@Test
	void testGetAreaZero() {
		Heptagon h = new Heptagon(0, 12, new Point(1, 1));
		assertEquals(h.getArea(), 0);
	}
		
	@Test
	void testGetPerimeter() {
		Heptagon h = new Heptagon(4.73, -50, new Point(-12, 0));
		assertEquals(h.getPerim(), 33.11);
	}
		
	@Test
	void testGetPerimeterZero() {
		Heptagon h = new Heptagon(0, -50, new Point(-12, 0));
		assertEquals(h.getPerim(), 0);
	}
		
	@Test
	void testGetRadiusCornerZero() {
		Heptagon h = new Heptagon(0, 21, new Point(-12, 54));
		assertEquals(h.getRadiusCorner(), 0);
	}
		
	@Test
	void testGetRadiusBaseZero() {
		Heptagon h = new Heptagon(0, 49, new Point(57, -82));
		assertEquals(h.getRadiusBase(), 0);
	}
		
	@Test
	void testGetRadiusCorner() {
		Heptagon h = new Heptagon(15, 21, new Point(-12, 54));
		assertEquals(h.getRadiusCorner(), 17.3, 0.1);
	}
		
	@Test
	void testGetRadiusBase() {
		Heptagon h = new Heptagon(15, 49, new Point(57, -82));
		assertEquals(h.getRadiusBase(), 15.6, 0.1);
	}
}
