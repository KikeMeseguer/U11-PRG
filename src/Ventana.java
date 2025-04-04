import javafx.application.Application;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class Ventana extends Application {
    @Override
    public void start(Stage ventana1) {
        ventana1.show();

        //Creación segunda ventana
        Stage ventana2 = new Stage();
        //Titulo
        ventana2.setTitle("Nueva Ventana");
        //Posición
        ventana2.setX(500);
        ventana2.setY(250);
        //Tamaño
        ventana2.setWidth(800);
        ventana2.setHeight(450);
        //Jerarquía de ventanas (vincula una ventana secundaria a una ventana principal)
        ventana2.initOwner(ventana1);
        /*
        Interacción entre ventanas
        - NONE (Por defecto): La ventana es independiente.
        - WINDOW_MODAL: La ventana bloquea la interacción con su ventana "propietaria".
        - APPLICATION_MODAL: La ventana bloquea la interacción con todas las ventanas de la aplicación.
         */
        ventana2.initModality(Modality.APPLICATION_MODAL);
        //Muestra la ventana
        ventana2.show();
    }
}
