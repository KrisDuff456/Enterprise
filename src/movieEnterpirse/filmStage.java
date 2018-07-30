import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class filmStage {
	private Button homeStage;

	public void start(Stage primaryStage)throws Exception {
		
		homeStage = new Button("Back");
		GridPane grid = new GridPane();
		grid.setAlignment(Pos.CENTER);
		grid.setPadding(new Insets(20));
		grid.setHgap(10);
		grid.setVgap(10);
		
		grid.add(homeStage,0,0);
		
		StackPane root = new StackPane();
		Scene scene = new Scene(root, 400,400);
		root.getChildren().add(grid);
		primaryStage.setScene(scene);
		primaryStage.setTitle("Films");
		
		homeStage.setOnAction(new EventHandler<ActionEvent>(){
			  @Override
			  public void handle(ActionEvent event) {
			  primaryStage.close();
			  try {
				new HomeStage().start(new Stage());
		   } catch (Exception e) {e.printStackTrace();}
		 }
	 });	 
  primaryStage.show();
		
	}
}


