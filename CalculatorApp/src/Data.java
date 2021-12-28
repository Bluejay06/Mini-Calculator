import java.lang.Math;


public class Data {

	public float calculate(long num1, long num2, String operator) {
		switch(operator) {
		case "+":
			//Addition
			return num1 + num2;
		case "-":
			//Subtraction
			return num1 - num2;
		case "*":
			//Multiple
			return num1 * num2;
		case "/":
			//Divide
			if(num2 == 0) {
				return 0;
			}
			else {
				return num1/ num2;
			}
		case "PR":
			//num1^num2 Power
			return (float) Math.pow(num1,num2);
		
		default:
			return 0;
		}
		
	}
}
