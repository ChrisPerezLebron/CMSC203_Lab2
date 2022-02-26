

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.scene.control.Label;

/*
 *  made because javafx wasn't working for me. Used this simple 
 *  program to trouble shoot and fix the issue
 */

public class JavafxTest extends Application
{
	public static void main(String[] args)
	{
		launch(args);
	}
	
	@Override
	public void start(Stage primaryStage)
	{
		Label label1 = new Label("this works");
		
		HBox hbox = new HBox(label1);
		
		Scene scene = new Scene(hbox);
		
		primaryStage.setScene(scene);
		
		primaryStage.show();
	}
}