package JavaFX;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;



/**
 * Created by Jekaterina on 29.01.2017.
 */
public class HelloWorld extends Application {
    public static void main(String[] args) {
        launch(args); //this method will call JavaFX Application constructor
    }
    @Override
    public void start(Stage primaryStage) throws Exception {

        Button btn = new Button("Click me");
        Button exit = new Button("Exit");
        exit.setOnAction(e -> {
            System.out.println("Exit");
            System.exit(0);
        });
        btn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Hello World");
            }
        });

        VBox root = new VBox();
        root.getChildren().addAll(btn, exit);        //layot
        Scene scene = new Scene(root, 500, 300);
        primaryStage.setTitle("My Title");
        primaryStage.setScene(scene);

        primaryStage.show();

    }
}
