package pk.ciit.Calc;

public class Calculator implements ICalculator {

	@Override
	public int add(int num1, int num2) {
		// TODO Auto-generated method stub
		
		return num1+num2;
	}

	@Override
	public int subract(int num1, int num2) {
		// TODO Auto-generated method stub
		return num1-num2;
	}

	@Override
	public int multiply(int num1, int num2) {
		// TODO Auto-generated method stub
		return num1*num2;
	}

	@Override
	public int devide(int num1, int num2) throws ArithmeticException {
		// TODO Auto-generated method stub
		if(num2==0)
			throw new ArithmeticException("division by zero");
		return num1/num2;
	}

}
