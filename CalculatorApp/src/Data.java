import java.lang.Math;


public class Data {

	public float calculate(long num1, long num2, String operator) {
		switch(operator) {
		case "+":
			return num1 + num2;
		case "-":
			return num1 - num2;
		case "*":
			return num1 * num2;
		case "/":
			if(num2 == 0) {
				return 0;
			}
			else {
				return num1/ num2;
			}
		case "SR":
			return (float) Math.sqrt(num1);
		
		default:
			return 0;
		}
		
	}
}
