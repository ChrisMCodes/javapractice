public class SceneSwitcher extends Application implements EventHandler<ActionEvent> {

    Stage window;
    Scene scene1, scene2;

    @Override
    public void start(Stage primaryStage) throws Exception {
        window = primaryStage;
        Label label1 = new Label("Welcome to the first scene!");
        Button button1 = new Button("Go to scene 2");
        button1.setOnAction(e -> window.setScene(scene2));

        VBox layout1 = new VBox(20);
        layout1.getChildren().addAll(label1, button1);
        scene1 = new Scene(layout1, 200, 200);

        Button button2 = new Button("This scene sucks, go back to scene 1");
        button2.setOnAction(e -> window.setScene(scene1));

        StackPane layout2 = new StackPane();
        layout2.getChildren().add(button2);
        scene2 = new Scene(layout2, 600, 300);

        window.setScene(scene1);
        window.setTitle("Hello");
        window.show();
    }

    public static void main(String[] args) throws Exception {

        launch(args);
    }

    @Override
    public void handle(ActionEvent actionEvent) {

    }
}
