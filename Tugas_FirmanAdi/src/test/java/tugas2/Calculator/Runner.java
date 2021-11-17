package tugas2.Calculator;

import java.util.Scanner;

public class Runner {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		CalculatorOperation calculatorOperation = new CalculatorOperation();
		String e = null;
		
		int numberMenu = 0;
		int number1,number2;
		
		 int x=1;
		 
		while(x==1) {
			try {
				System.out.println("Welcome to Simple Calculator");
				System.out.println("=====================================");
				System.out.println("1. "+CalcEnums.SUM.getString());
				System.out.println("2. "+CalcEnums.SUBSTRACT.getString());
				System.out.println("3. "+CalcEnums.MULTIPLICATION.getString());
				System.out.println("4. "+CalcEnums.DIVIDE.getString());
				System.out.println("5. "+CalcEnums.EXIT.getString());
				System.out.println("Please Select Operation : ");
				numberMenu = sc.nextInt();
				
				switch (numberMenu) {
				case 1 :
					System.out.println("Enter first number ");
					number1 = sc.nextInt();
	
				    System.out.println("Enter second number ");
				    number2 = sc.nextInt();
				    
					calculatorOperation.sumTwoInteger(number1, number2);
					System.out.println("Hasilnya "+calculatorOperation.sumTwoInteger(number1, number2));
					break;
				case 2 :
					System.out.println("Enter first number ");
					number1 = sc.nextInt();
	
				    System.out.println("Enter second number ");
				    number2 = sc.nextInt();
				    
					calculatorOperation.sumTwoInteger(number1, number2);
					System.out.println("Hasilnya "+calculatorOperation.substractTwoInteger(number1, number2));
					break;
				case 3:
					System.out.println("Enter first number ");
					number1 = sc.nextInt();
	
				    System.out.println("Enter second number ");
				    number2 = sc.nextInt();
				    
					calculatorOperation.sumTwoInteger(number1, number2);
					System.out.println("Hasilnya "+calculatorOperation.multiplicationTwoInteger(number1, number2));
					break;
				case 4:
					System.out.println("Enter first number ");
					number1 = sc.nextInt();
	
				    System.out.println("Enter second number ");
				    number2 = sc.nextInt();
				    
					calculatorOperation.sumTwoInteger(number1, number2);
					System.out.println("Hasilnya "+calculatorOperation.divideTwoInteger(number1, number2));
					break;
				case 5:
					x=2;
					break;
				default:
					System.out.println("Wrong Number ....");
					break;
					
				}
				
			} catch (Exception e2) {
				System.out.println("Please Input integer only!. Please restart your Calculator!!");
				break;
			}
		}

	}

}
