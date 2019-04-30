package calculate;

public class OptionFactory {
	
	public static Option createAlgorithm(String operator){
		Option opter = null;
		if(!"".equals(operator)){
			switch (operator) {
			case "+":
				opter = new Addition();
				break;
			case "-":
				opter = new Subtraction();
				break;
			default:
				break;
			}
		}else{
			System.out.println("运算符不能为空字符串");
		}
		return opter;
	}
}
