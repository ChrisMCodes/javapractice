/*
 *
 * This is just a JavaFX
 * practice app to figure
 * out how to change between
 * scenes on a click event.
 *
 */

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;


public class MultiWindowGUI extends Application {
	
	/*
	 *
	 * Lots of globals -- not very memory intensive,
	 * so I used them to simplify the actual methods
	 *
	 *
	 */
	Button button1 = new Button("Click here to continue");
	Button button2 = new Button("Next");
	Button button3 = new Button("Keep going");
	Button button4 = new Button("Return");
	
	Label label1 = new Label("Hello");
	Label label2 = new Label("You've made it to the second window");
	Label label3 = new Label("You've made it to the third window");
	Label label4 = new Label("This is the final window. Go back to the beginning?");
	
	@Override
	public void start(Stage primaryStage) {
		try {
			// setting up four borderpanes
			BorderPane bp1 = new BorderPane();
			BorderPane bp2 = new BorderPane();
			BorderPane bp3 = new BorderPane();
			BorderPane bp4 = new BorderPane();
			
			// setting up different layouts
			bp1.setTop(label1);
			bp1.setCenter(button1);
			bp2.setTop(label2);
			bp2.setCenter(button2);
			bp3.setTop(label3);
			bp3.setCenter(button3);
			bp4.setTop(label4);
			bp4.setCenter(button4);
			
			// setting scenes
			Scene scene1 = new Scene(bp1, 450, 350);
			Scene scene2 = new Scene(bp2, 450, 350);
			Scene scene3 = new Scene(bp3, 450, 350);
			Scene scene4 = new Scene(bp4, 450, 350);
			
			// setting up button actions
			button1.setOnAction(e -> {
				primaryStage.setScene(scene2);
			});
			
			button2.setOnAction(e -> {
				primaryStage.setScene(scene3);
			});
			
			button3.setOnAction(e -> {
				primaryStage.setScene(scene4);
			});
			
			button4.setOnAction(e -> {
				primaryStage.setScene(scene1);
			});
			
			primaryStage.setScene(scene1);
			primaryStage.show();
			
		} catch(Exception e) {
			// catching for development purposes
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
