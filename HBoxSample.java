import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class HBoxSample extends Application {
	Button b1 = new Button("Button One");
	Button b2 = new Button("Button Two");
	Button b3 = new Button("Button Three");
	int firstCount = 0;
	int secondCount = 0;
	int thirdCount = 0;
	Label l1 = new Label();
	Label l2 = new Label();
	Label l3 = new Label();
	
	@Override
	public void start(Stage primaryStage) {

		HBox hb = new HBox();
		hb.getChildren().addAll(b1, b2, b3, l1, l2, l3);
		hb.setSpacing(20);
		hb.setPadding(new Insets(15));
		
		Scene scene = new Scene(hb, 1200, 150);
		
		
		b1.setOnAction(e -> {
			firstCount++;
			l1.setText("\nYou've clicked button one " + firstCount + " times.");
		});
		b2.setOnAction(e -> {
			secondCount++;
			l2.setText("\n\nYou've clicked button two " + secondCount + " times.");
		});
		b3.setOnAction(e -> {
			thirdCount++;
			l3.setText("\n\n\nYou've clicked button three " + thirdCount + " times.");
		});
		
		primaryStage.setTitle("Buttons!");
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
}
