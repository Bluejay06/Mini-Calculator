import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;


public class Calculator {
	
	@FXML
	private TextField result;
	private long num1 = 0;
	private String operator = "";
	private boolean isTrue = true;
	private Data data = new Data();
	
	@FXML
	public void processData(ActionEvent event) {
		
		if (isTrue) {
			result.setText("");
			isTrue= false;
		}
		String value = ((Button)event.getSource()).getText();
		result.setText(result.getText() + value);
		
	}
	
	@FXML
	public void processFormulas(ActionEvent event) {
		String value = ((Button)event.getSource()).getText();
		
		if(!value.equals("=")) {
			if(!operator.isEmpty()) {
				return;
			}
			operator = value;
			num1 = Long.parseLong(result.getText());
			result.setText("");
		}
		else {
			if (operator.isEmpty()) {
				return;
			}
			long num2 =  Long.parseLong(result.getText());
			float answer = data.calculate(num1, num2, operator);
			result.setText(String.valueOf(answer));
			operator = "";
			isTrue = true;
		}
		
	}
}
