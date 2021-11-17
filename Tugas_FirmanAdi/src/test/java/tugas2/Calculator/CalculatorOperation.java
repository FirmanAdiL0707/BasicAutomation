package tugas2.Calculator;

public class CalculatorOperation implements ICalculator {
	private int result;
	
	@Override
	public int sumTwoInteger(int number1, int number2) {
		result = number1 + number2;
		return result;
	}

	@Override
	public int substractTwoInteger(int number1, int number2) {
		result = number1 - number2;
		return result;
	}

	@Override
	public int divideTwoInteger(int number1, int number2) {
		result = number1 / number2;
		return result;
	}

	@Override
	public int multiplicationTwoInteger(int number1, int number2) {
		result = number1 * number2;
		return result;
	}

}
