import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.stage.Modality;

public class AplicacionJavaFX extends Application {
    @Override
    public void start(Stage primaryStage) {
//        primaryStage.show();

        //VENTANA
        Stage stage = new Stage();
        //Titulo
        stage.setTitle("Nueva Ventana");
        //Posición
        stage.setX(500);
        stage.setY(250);
        //Tamaño
        stage.setWidth(800);
        stage.setHeight(450);
        //Jerarquía de ventanas (vincula una ventana secundaria a una ventana principal)
        stage.initOwner(primaryStage);
        /*
        Interacción entre ventanas
        - NONE (Por defecto): La ventana es independiente.
        - WINDOW_MODAL: La ventana bloquea la interacción con su ventana "propietaria".
        - APPLICATION_MODAL: La ventana bloquea la interacción con todas las ventanas de la aplicación.
         */
        stage.initModality(Modality.WINDOW_MODAL);


        //NODOS (ITEMS)
        Text text = new Text("Hola Mundo");
        VBox rootNode = new VBox(50, text, new Button("Presionar"));


        //ESCENA
        StackPane root = new StackPane(rootNode);
        Scene scene = new Scene(root, 800, 450);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}