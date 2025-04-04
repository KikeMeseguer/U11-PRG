import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;
import javafx.stage.Stage;

public class Escena extends Application {
    @Override
    public void start(Stage stage) throws Exception {

        //Contiene elementos gráficos
        StackPane root = new StackPane();
        //Crea una escena con elementos gráficos y tamaño
        Scene scene = new Scene(root, 800, 450);
        //Da un color a la escena
        scene.setFill(Color.DARKBLUE);
        //Muestra la escena en la ventana
        stage.setScene(scene);
        stage.show();
    }
}
