package pk.ciit.Calc;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class CalculatorTest {

	private static ICalculator calculator;

	@BeforeClass
	public static void beforeclass() {

		calculator = new Calculator();
		System.out.println("in this excuted before class ");
	}

	@AfterClass
	public static void afterclass() {

		System.out.println("this is excuted after class");
	}

	@Before
	public void before() {

		System.out.println("this is excuted before each test case");
	}

	@After
	public void after() {

		System.out.println("this is excuted after each test case");
	}

	@Test
	public void addTest() {

		int result = calculator.add(3, 2);
		assertEquals(5, result);
		System.out.println("Tested add");
	}

	@Test
	public void subTest() {

		int result = calculator.subract(3, 2);
		assertEquals(1, result);
		System.out.println("Tested subtracted");
	}

	@Test
	public void mulTest() {

		int result = calculator.multiply(3, 2);
		assertEquals(6, result);
		System.out.println("Tested multiply");
	}

	@Test
	public void divTest() {

		int result = calculator.devide(3, 2);
		assertEquals(1, result);
		System.out.println("Tested divide");
	}

	@Test(expected = ArithmeticException.class)
	public void testDivide() throws ArithmeticException {
		calculator.devide(0, 6);

	}
}
