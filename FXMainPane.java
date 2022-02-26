


import javafx.application.Platform;


import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.control.Tooltip;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;

/**
 * This panel is the basic panel, inside which other panels are placed.  
 * Before beginning to implement, design the structure of your GUI in order to 
 * understand what panels go inside which ones, and what buttons or other components
 * go in which panels.  
 * @author ralexander
 *
 */
//make the main panel's layout be a VBox
public class FXMainPane extends VBox {

	//student Task #2:
	//  declare five buttons, a label, and a textfield
	//  declare two HBoxes
	Button helloButton;
	Button howdyButton;
	Button chineseButton;
	Button clearButton;
	Button exitButton;
	
	Button spanishButton; //extra button step 4
	
	Label feedbackLabel;
	
	TextField textfield; 
	
	HBox topHBox;
	HBox bottomHBox;

	
	//student Task #4:
	//  declare an instance of DataManager
	DataManager dataManager;
	
	
	/**
	 * The MainPanel constructor sets up the entire GUI in this approach.  Remember to
	 * wait to add a component to its containing component until the container has
	 * been created.  This is the only constraint on the order in which the following 
	 * statements appear.
	 */
	FXMainPane() {
		//student Task #2:
		//  instantiate the buttons, label, and textfield
		//  instantiate the HBoxes
		helloButton = new Button("Hello");
		howdyButton = new Button("Howdy");
		chineseButton = new Button("Chinese");
		clearButton = new Button("Clear");
		exitButton = new Button("Exit");
		
		spanishButton = new Button("Spanish"); //extra button step 4
		
		feedbackLabel = new Label("Feedback:");
		
		textfield = new TextField();
		
		topHBox = new HBox(); 
		bottomHBox = new HBox();
		
		
		
		
		
		
		
		//student Task #4:
		//  instantiate the DataManager instance
		dataManager = new DataManager();
		
		//registering event handler with each button
		helloButton.setOnAction(new ButtonHandler());
		howdyButton.setOnAction(new ButtonHandler());
		chineseButton.setOnAction(new ButtonHandler());
		clearButton.setOnAction(new ButtonHandler());
		exitButton.setOnAction(new ButtonHandler());
		
		spanishButton.setOnAction(new ButtonHandler()); //extra button step 4
		
		//  set margins and set alignment of the components
		HBox.setMargin(helloButton, new Insets(10));
		HBox.setMargin(howdyButton, new Insets(10));
		HBox.setMargin(chineseButton, new Insets(10));
		HBox.setMargin(clearButton, new Insets(10));
		HBox.setMargin(exitButton, new Insets(10));
		VBox.setMargin(bottomHBox, new Insets(10));
		
		topHBox.setAlignment(Pos.CENTER);
		bottomHBox.setAlignment(Pos.CENTER);
		this.setAlignment(Pos.CENTER);
		
		
		
		
		
		
		//student Task #3:
		//  add the label and textfield to one of the HBoxes
		bottomHBox.getChildren().addAll(feedbackLabel, textfield);
		
		//  add the buttons to the other HBox
		topHBox.getChildren().addAll(helloButton, howdyButton, chineseButton, spanishButton, 
										clearButton, exitButton);
		
		//  add the HBoxes to this FXMainPanel (a VBox)
		this.getChildren().addAll(topHBox, bottomHBox);
	}
	
	//Task #4:
	//  create a private inner class to handle the button clicks
	class ButtonHandler implements EventHandler<ActionEvent>
	{
		@Override
		public void handle(ActionEvent event)
		{
			if(event.getTarget() == helloButton)
			{
				textfield.setText(dataManager.getHello());
			}
			else if(event.getTarget() == howdyButton)
			{
				textfield.setText(dataManager.getHowdy());
			}
			else if(event.getTarget() == chineseButton)
			{
				textfield.setText(dataManager.getChinese());
			}
			else if(event.getTarget() == clearButton)
			{
				textfield.setText("");
			}
			else if(event.getTarget() == exitButton)
			{
				Platform.exit();
				System.exit(0);
			}
			//extra button step 4
			else if(event.getTarget() == spanishButton)
			{
				textfield.setText(dataManager.getSpanish());
			}
			
		}
	}
}
	