package Nodos;

import javafx.application.Application;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Contenedores extends Application {
    /*
    CONTENEDORES
    - StackPane: Elementos superpuestos.
    - GridPane: Distribución en cuadrícula.
    - FlowPane: Elementos en fila o columna.
    - BorderPane: Distribución en superior, inferior, izquierda, derecha y centro.
    - ScrollPane: Crea un scroll si el elemento excede el tamaño de la ventana.
    - TabPane: Crea un sistema de pestañas con elementos.
    - SplitPane: Divide el espacio en secciones ajustables.
    - VBox: Elementos en columna.
    - HBox: Elementos en fila.
    */

    @Override
    public void start(Stage stage) throws Exception {

        //StackPane
        StackPane stp = new StackPane();
        Text textoSp1 = new Text("Elemento 1");
        textoSp1.setTranslateX(-50);
        Text textoSp2 = new Text("Elemento 2");
        textoSp2.setTranslateX(50);
        stp.getChildren().addAll(textoSp1, textoSp2);

        //GridPane
        GridPane gp = new GridPane();
        gp.setHgap(50);
        gp.setVgap(20);
        for(int f=0; f < 3; f++) {
            for(int c=0; c < 5; c++) {
                gp.add(new Text("Elemento " + (5*f+c+1)), c, f);
            }
        }

        //FlowPane
        FlowPane fp = new FlowPane(Orientation.VERTICAL);
        fp.setHgap(50);
        fp.setVgap(50);
        for(int c=0; c < 5; c++) {
            fp.getChildren().add(new Text("Elemento " + (c+1)));
        }

        //BorderPane
        BorderPane bp = new BorderPane();
        Text textoSuperior = new Text("Texto superior");
        Text textoInferior = new Text("Texto superior");

        bp.setTop(textoSuperior);
        bp.setBottom(textoInferior);
        bp.setLeft(new Text("Texto izquierdo"));
        bp.setRight(new Text("Texto derecho"));
        bp.setCenter(new Text("Texto central"));

        BorderPane.setAlignment(textoSuperior, Pos.CENTER);
        BorderPane.setAlignment(textoInferior, Pos.CENTER);

        //ScrollPane
        Text textoScp = new Text("Texto grande");
        textoScp.setFont(new Font(800));
        ScrollPane scp = new ScrollPane(textoScp);

        //TabPane
        Tab pestaña1 = new Tab("Pestaña 1", new Text("Area 1"));
        Tab pestaña2 = new Tab("Pestaña 2", new Text("Area 2"));
        TabPane tp = new TabPane(pestaña1, pestaña2);

        //SplitPane
        SplitPane spp = new SplitPane();
        spp.getItems().addAll(new TextArea("Area 1"), new TextArea("Area 2"));

        //VBox
        VBox vb = new VBox(30);
        for (int f = 0; f < 5; f++) {
            vb.getChildren().add(new Text("Elemento " + (f+1)));
        }

        //HBox
        HBox hb = new HBox(30);
        for (int c = 0; c < 5; c++) {
            hb.getChildren().add(new Text("Elemento " + (c+1)));
        }

        Scene scene = new Scene(stp, 800, 450);
//        Scene scene = new Scene(gp, 800, 450);
//        Scene scene = new Scene(fp, 800, 450);
//        Scene scene = new Scene(bp, 800, 450);
//        Scene scene = new Scene(scp, 800, 450);
//        Scene scene = new Scene(tp, 800, 450);
//        Scene scene = new Scene(spp, 800, 450);
//        Scene scene = new Scene(vb, 800, 450);
//        Scene scene = new Scene(hb, 800, 450);

        stage.setScene(scene);
        stage.show();
    }
}
