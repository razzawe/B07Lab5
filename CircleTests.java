package lab5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CircleTests {

    @Test
    public void testGetArea() {
        Point center = new Point(0, 0);
        Circle circle = new Circle(center, 5);
        assertEquals(Math.PI * 5 * 5, circle.getArea(), 0.0001);
    }
    @Test
	void testCircumfrenceEquals() {
		Circle c = new Circle(new Point(0, 0), 2);
		assertEquals(c.getCircumference(), 2 * Math.PI * 2);
	}

}
