import java.security.SecureRandom;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class DrawRandomLinesController {
    private static final SecureRandom randomNumbers = new SecureRandom();
    @FXML private Canvas canvas;

    @FXML
    void drawRandomLinesButtonPressed(ActionEvent event) {
        GraphicsContext gc = canvas.getGraphicsContext2D();

        MyLine[] lines = new MyLine[100];

        final int width = (int) canvas.getWidth();
        final int height = (int) canvas.getHeight();
        
        for (int count = 0; count < lines.length; count++) {
            double x1 = randomNumbers.nextInt(width);
            double y1 = randomNumbers.nextInt(height);
            double x2 = randomNumbers.nextInt(width);
            double y2 = randomNumbers.nextInt(height);

            Color color = Color.rgb(randomNumbers.nextInt(256), randomNumbers.nextInt(256), randomNumbers.nextInt(256));

            lines[count] = new MyLine(x1, y1, x2, y2, color);
        }

        gc.clearRect(0, 0, canvas.getWidth(), canvas.getHeight());

        for (MyLine line : lines) {
            line.draw(gc);
        }
    }
}
