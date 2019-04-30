package calculate;

public class Test {
	public static void main(String[] args) {
		Option oper = OptionFactory.createAlgorithm("-");
		oper.set_Number1(1);
		oper.set_Number2(4);
		double result = oper.getResult();
		System.out.println(result);
	}
}
