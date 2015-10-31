package lambda;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/* 
 * Basado en HelloWorld 
 * Copyright (c) 2014, Oracle America, Inc. 
 * https://docs.oracle.com/javase/tutorial/java/javaOO/anonymousclasses.html
 * */

public class AnonClassDemo2 extends Application {
	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) {
		primaryStage.setTitle("Clases Anónimas");
		Button btn = new Button();
		Button btn2 = new Button();
		
		btn.setText("Decir Adiós Mundo!");

		// Clase anónima dentro del Método setOnAction
		btn.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {
				System.out.println("Adiós Mundo!");
				primaryStage.close();
			}
		});
		
		btn2.setText("Centrar");
		// Clase anónima dentro del Método setOnAction
		btn2.setOnAction(new EventHandler<ActionEvent>(){
			@Override
			public void handle(ActionEvent event) {
				System.out.println("Centrando!");
				primaryStage.centerOnScreen();
			}
		});

		StackPane root = new StackPane(btn, btn2);
		StackPane.setAlignment(btn, Pos.TOP_CENTER);
		StackPane.setAlignment(btn2, Pos.BOTTOM_CENTER);
		
		primaryStage.setScene(new Scene(root, 200, 150));
		primaryStage.show();
	}
}