
import org.junit.Assert;
import org.junit.Before;
import org.junit.After;
import org.junit.Test;

public class CalculatorTest {
	
	private Calculator classUnderTest;
	
	@Before
	public void setUp() {
		System.out.println("Metoda zostanie wykonana przed kazdym testem");
		classUnderTest = new Calculator();
	}
		
	@After
	public void tearDown() {
		System.out.println("Metoda zostanie wykonana po kazdym tescie");
	}
	
	@Test
	public void testDodawania() throws Exception {
		double a = 2.0;
		double b = 3.0;

		double c = 4.5;
		double d = 1.2;
		double suma1 = classUnderTest.sum(a, b);
		double suma2 = classUnderTest.sum(c, d);

		Assert.assertEquals("Bledny wynik sumowania", 5.0, suma1, 0.001);
		Assert.assertEquals("Bledny wynik sumowania", 5.7, suma2,  0.001);
	}

	@Test
	public void testOdejmowania() throws Exception {
		double a = 3;
		double b =2;

		double subtract = classUnderTest.subtract(a, b);
		Assert.assertEquals("bledny wynik odejmowania", 1,subtract,0.001);
	}

	@Test
	public void testMnozenia() throws Exception {
		double a= 2;
		double b = 2;

		double multiply = classUnderTest.multiply(a, b);
		Assert.assertEquals("bledny wynik mozenia", 4,multiply, 0.001);
	}

	@Test
	public void testDzielenia() throws Exception {
		double a = 4;
		double b =2;

		double divide = classUnderTest.divide(a, b);

		Assert.assertEquals("bledny wynik dzielenia",2,divide,0.001);

	}

	@Test(expected = IllegalArgumentException.class)
	public void testDzieleniaPrzezZero() {
		double a = 4.0;
		double b = 0.0;

		double wynik = classUnderTest.divide(a, b);

	}
}
