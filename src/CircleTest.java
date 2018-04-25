import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import static org.junit.jupiter.api.Assertions.*;
//import org.junit.jupiter.api.Test;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.After;

public class CircleTest {
	   private static Circle circle=new Circle();

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testMain() {
		Circle c=new Circle(20);
		c.show();
		System.out.println("testMain");
	}

	@Test
	public void testCircle() {
	
		System.out.println("testCircle");
	}

	@Test
	public void testCircleDouble() {
		System.out.println("testCircleDouble");
	}

	@Ignore
	public void testSetRadious() {
		System.out.println("testSetRadious");
	}

	@Test
	public void testGetRadious() {
		circle.getRadious();
		System.out.println("testGetRadious");
	}

	@After
	public void testGetArea() {
		circle.getArea();
		System.out.println("testGetArea");
	}

}
