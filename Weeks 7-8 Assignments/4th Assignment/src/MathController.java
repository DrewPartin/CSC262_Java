import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class MathController {

    @FXML
    private TextField firstNumber;

    @FXML
    private TextArea results;

    @FXML
    private TextField secondNumber;

    @FXML
    void clearButtonPressed(ActionEvent event) {
        firstNumber.setText("");
        secondNumber.setText("");
        results.setText("");
    }

    @FXML
    void diffButtonPressed(ActionEvent event) {
        int first = Integer.parseInt(firstNumber.getText());
        int second = Integer.parseInt(secondNumber.getText());
        int diff = first - second;
        results.setText(Integer.toString(diff));
    }

    @FXML
    void exitButtonPressed(ActionEvent event) {
        System.exit(0);
    }

    @FXML
    void prodButtonPressed(ActionEvent event) {
        int first = Integer.parseInt(firstNumber.getText());
        int second = Integer.parseInt(secondNumber.getText());
        int prod = first * second;
        results.setText(Integer.toString(prod));
    }

    @FXML
    void quotButtonPressed(ActionEvent event) {
        int first = Integer.parseInt(firstNumber.getText());
        int second = Integer.parseInt(secondNumber.getText());
        if (second == 0) {
            results.setText("Cannot divide by zero");
        } else {
            int quot = first / second;
            results.setText(Integer.toString(quot));
        }
    }

    @FXML
    void sumButtonPressed(ActionEvent event) {
        int first = Integer.parseInt(firstNumber.getText());
        int second = Integer.parseInt(secondNumber.getText());
        int sum = first + second;
        results.setText(Integer.toString(sum));
    }

}

