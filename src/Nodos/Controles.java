package Nodos;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.scene.control.Button;
import javafx.stage.FileChooser;
import java.io.File;


public class Controles extends Application {
    @Override
    public void start(Stage stage) {

        VBox contenedor = new VBox();

        //Label
        Label label = new Label("Texto");

        //Button
        Button boton = new Button("Botón");
        boton.setOnAction(_ -> System.out.println("Botón presionado"));

        //CheckBox
        CheckBox checkBox = new CheckBox("checkBox");
        checkBox.setOnAction(_ -> System.out.println("checkBox: " + checkBox.isSelected()));

        //RadioButton
        ToggleGroup groupo = new ToggleGroup();
        RadioButton rb1 = new RadioButton("Opción 1");
        RadioButton rb2 = new RadioButton("Opción 2");
        rb1.setToggleGroup(groupo);
        rb2.setToggleGroup(groupo);
        rb1.setOnAction(_ -> System.out.println("Opción 1"));
        rb2.setOnAction(_ -> System.out.println("Opción 2"));

        //ToggleButton
        ToggleButton pulsador = new ToggleButton("Pulsador");
        pulsador.setOnAction(_ -> System.out.println("Pulsador: " + pulsador.isSelected()));

        //ComboBox
        ComboBox<String> comboBox = new ComboBox<>();
        comboBox.getItems().addAll("Elemento 1", "Elemento 2", "Elemento 3");
        comboBox.setOnAction(_ -> System.out.println("ComboBox: " + comboBox.getValue()));

        //MenuBar
        Menu menu = new Menu("Archivo");
        Menu menu2 = new Menu("Editar");
        MenuItem item1 = new MenuItem("Nuevo");
        MenuItem item2 = new MenuItem("Abrir");
        MenuItem item3 = new MenuItem("Guardar");
        menu.getItems().add(item1);
        menu.getItems().add(item2);
        menu.getItems().add(item3);
        MenuBar menuBar = new MenuBar(menu, menu2);
        menu.setOnAction(_ -> System.out.println("MenuBar > " + menu.getItems()));

        //TextField
        TextField textField = new TextField();
        textField.setPromptText("Introduce texto aquí");
        textField.setOnAction(_ -> System.out.println("Texto: " + textField.getText()));

        //PasswordField
        PasswordField passwordField = new PasswordField();
        passwordField.setPromptText("Introduce tu contraseña");
        passwordField.setOnAction(_ -> System.out.println("Contraseña: " + passwordField.getText()));

        //TextArea
        TextArea textArea = new TextArea();
        textArea.setPromptText("Texto inicial...");
        Button botonEnviar = new Button("Enviar");
        botonEnviar.setOnAction(_ -> System.out.println(textArea.getText()));

        //ColorPicker
        ColorPicker color = new ColorPicker();
        color.setOnAction(_ -> System.out.println("Color elegido: " + color.getValue()));

        //FileChooser
        FileChooser fileChooser = new FileChooser();
        Button botonArchivo = new Button("Abrir archivo");
        botonArchivo.setOnAction(_ -> {
            File archivo = fileChooser.showOpenDialog(stage);
            System.out.println(archivo.getAbsoluteFile());
        });

        //Slider
        Slider slider = new Slider(0, 100, 50);
        slider.setShowTickMarks(true);
        slider.setShowTickLabels(true);
        slider.setOnMouseClicked(_ -> System.out.println("Valor seleccionado: " + slider.getValue()));

        //TableView
        TableView<Persona> tableView = new TableView<>();
        TableColumn<Persona, String> columna1 = new TableColumn<>("Nombre");
        columna1.setCellValueFactory(new PropertyValueFactory<>("nombre"));
        TableColumn<Persona, Integer> columna2 = new TableColumn<>("Edad");
        columna2.setCellValueFactory(new PropertyValueFactory<>("edad"));
        TableColumn<Persona, String> columna3 = new TableColumn<>("DNI");
        columna3.setCellValueFactory(new PropertyValueFactory<>("dni"));
        tableView.getColumns().addAll(columna1, columna2, columna3);
        ObservableList<Persona> data = FXCollections.observableArrayList(
                new Persona("Juan", 45, "48812738L"),
                new Persona("María", 21, "49645415F"),
                new Persona("Carlos", 75, "46722497M")
        );
        tableView.setItems(data);

        //TreeView
        TreeItem<String> root = new TreeItem<>("JavaFX");
        TreeItem<String> child1 = new TreeItem<>("Ventana");
        TreeItem<String> child2 = new TreeItem<>("Escena");
        TreeItem<String> child3 = new TreeItem<>("Nodos");
        TreeItem<String> child3_1 = new TreeItem<>("Contenedores");
        TreeItem<String> child3_2 = new TreeItem<>("Controles");
        TreeItem<String> child3_3 = new TreeItem<>("Eventos");
        root.getChildren().addAll(child1, child2, child3);
        child3.getChildren().addAll(child3_1, child3_2, child3_3);
        TreeView<String> treeView = new TreeView<>(root);

        //Tooltip
        Tooltip tooltip = new Tooltip("Mensaje informativo");
        boton.setTooltip(tooltip);

        //ImageView
        Image image = new Image("file:/C:/Users/Meseg/Pictures/Saved%20Pictures/javafx_logo.jpg");
        ImageView imageView = new ImageView(image);

        //ToolBar
        ToolBar toolBar = new ToolBar(new Button("Botón 1"), new Button("Botón 2"));


        contenedor.getChildren().addAll(label, boton, checkBox, rb1, rb2, pulsador, comboBox, menuBar, textField,
                passwordField, textArea, botonEnviar, color, botonArchivo, slider, tableView, treeView/*, imageView*/, toolBar);

        Scene scene = new Scene(contenedor, 800, 450);
        stage.setScene(scene);
        stage.show();
    }
}
