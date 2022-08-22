import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;

public class DrawLinesController {

    @FXML
    private Canvas canvas;

    @FXML
    void drawLinesButtonPressed(ActionEvent event) {
        GraphicsContext gc = canvas.getGraphicsContext2D();
        gc.setStroke(javafx.scene.paint.Color.RED);
        gc.strokeLine(0, 280, canvas.getWidth(), canvas.getHeight());
        gc.strokeLine(0, 240, canvas.getWidth() - 40, canvas.getHeight());
        gc.strokeLine(0, 200, canvas.getWidth() - 80, canvas.getHeight());
        gc.strokeLine(0, 160, canvas.getWidth() - 120, canvas.getHeight());
        gc.strokeLine(0, 120, canvas.getWidth() - 160, canvas.getHeight());
        gc.strokeLine(0, 80, canvas.getWidth() - 200, canvas.getHeight());
        gc.strokeLine(0, 40, canvas.getWidth() - 240, canvas.getHeight());
        gc.strokeLine(0, 0, canvas.getWidth() - 280, canvas.getHeight());
        gc.strokeLine(canvas.getWidth(), canvas.getHeight(), 280, 0);
        gc.strokeLine(canvas.getWidth(), canvas.getHeight() - 40, 240, 0);
        gc.strokeLine(canvas.getWidth(), canvas.getHeight() - 80, 200, 0);
        gc.strokeLine(canvas.getWidth(), canvas.getHeight() - 120, 160, 0);
        gc.strokeLine(canvas.getWidth(), canvas.getHeight() - 160, 120, 0);
        gc.strokeLine(canvas.getWidth(), canvas.getHeight() - 200, 80, 0);
        gc.strokeLine(canvas.getWidth(), canvas.getHeight() - 240, 40, 0);
        gc.strokeLine(canvas.getWidth(), canvas.getHeight() - 280, 0, 0);
    }
}
