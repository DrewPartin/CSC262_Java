import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class IncDecController {

    @FXML
    private TextField display;

    @FXML
    void decrementButtonPressed(ActionEvent event) {
        int value = Integer.parseInt(display.getText());
        value--;
        display.setText(Integer.toString(value));
    }

    @FXML
    void incrementButtonPressed(ActionEvent event) {
        int value = Integer.parseInt(display.getText());
        value++;
        display.setText(Integer.toString(value));
    }

}
