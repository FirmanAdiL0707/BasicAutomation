package tugas2.Calculator;

public enum CalcEnums {

	SUM("Sum"),
	SUBSTRACT("Substract"),
	MULTIPLICATION("Multiplication"),
	DIVIDE("Divide"),
	EXIT("Exit");
	
	
	private String filter;
	
	private CalcEnums(String filter) {
		this.filter = filter;
	}

	public String getString() {
		return filter;
	}
}
