package Nodos;

import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.stage.WindowEvent;

public class Eventos extends Application {
    @Override
    public void start(Stage stage) throws Exception {

        stage.setWidth(800);
        stage.setHeight(450);

        StackPane contenedor = new StackPane();
        Scene scene = new Scene(contenedor);

        Button boton = new Button("Botón");


        EventHandler<MouseEvent> manejadorRaton = new EventHandler<>() {
            @Override
            public void handle(MouseEvent e) {
                if (e.getEventType() == MouseEvent.MOUSE_PRESSED) {
//                    System.out.println("Botón presionado");
                } else if (e.getEventType() == MouseEvent.MOUSE_RELEASED) {
//                    System.out.println("Botón soltado");
                } else if (e.getEventType() == MouseEvent.MOUSE_CLICKED) {
//                    System.out.println("Botón clicado");
                } else if (e.getEventType() == MouseEvent.MOUSE_MOVED) {
//                System.out.println("Botón no presionado");
                } else if (e.getEventType() == MouseEvent.MOUSE_ENTERED) {
//                    System.out.println("Cursor se pone sobre el botón");
                } else if (e.getEventType() == MouseEvent.MOUSE_EXITED) {
//                    System.out.println("Cursor sale del botón");
                } else if (e.getEventType() == MouseEvent.DRAG_DETECTED) {
//                    System.out.println("Botón presionado movido");
                } else if (e.getEventType() == MouseEvent.MOUSE_DRAGGED) {
//                    System.out.println("Botón arrastrado");
                }
            }
        };

        EventHandler<KeyEvent> manejadorTeclado = new EventHandler<>() {
            @Override
            public void handle(KeyEvent e) {
                if (e.getEventType() == KeyEvent.KEY_PRESSED) {
                    System.out.println("Botón presionado");
                } else if (e.getEventType() == KeyEvent.KEY_RELEASED) {
                    System.out.println("Botón soltado");
                } else if (e.getEventType() == KeyEvent.KEY_TYPED) {
                    System.out.println("Botón pulsado");
                }
            }
        };

        EventHandler<WindowEvent> manejadorVentana = new EventHandler<>() {
            @Override
            public void handle(WindowEvent e) {
                if (e.getEventType() == WindowEvent.WINDOW_SHOWING) {
                    System.out.println("Ventana emerge");
                } else if (e.getEventType() == WindowEvent.WINDOW_SHOWN) {
                    System.out.println("Ventana mostrada");
                } else if (e.getEventType() == WindowEvent.WINDOW_HIDING) {
                    System.out.println("Ventana se esta ocultando");
                } else if (e.getEventType() == WindowEvent.WINDOW_HIDDEN) {
                    System.out.println("Ventana ocultada");
                } else if (e.getEventType() == WindowEvent.WINDOW_CLOSE_REQUEST) {
                    System.out.println("Ventana cerrada");
                }
            }
        };


        boton.addEventHandler(MouseEvent.ANY, manejadorRaton);
        boton.addEventHandler(KeyEvent.ANY, manejadorTeclado);
        stage.addEventHandler(WindowEvent.ANY, manejadorVentana);

        contenedor.getChildren().addAll(boton);
        stage.setScene(scene);
        stage.show();
    }
}
