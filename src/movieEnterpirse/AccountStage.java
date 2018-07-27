package movieEnterpirse;
import java.awt.Label;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class AccountStage extends Application {
	
	private Button homeStage;
	private Button create;

	@Override
	public void start(Stage primaryStage) throws Exception {
	
		homeStage = new Button("Back");
		create = new Button("Create Account");
		
		Label email = new Label("Email Address:");
		TextField emailTF = new TextField();
		emailTF.setMaxWidth(100);
		
		Label pw = new Label("Password: ");
		TextField passTF = new TextField(); 
	    passTF.setMaxWidth(100);
	    
		GridPane grid = new GridPane();
		grid.setAlignment(Pos.CENTER);
		grid.setHgap(10);
		grid.setVgap(10);
		grid.setPadding(new Insets(25,25,25,25));
		
		
		
		HBox h = new HBox(10);
	         h.setAlignment(Pos.CENTER);
	         h.getChildren().addAll(create,homeStage);
	         
		StackPane root = new StackPane();
		root.getChildren().add(h);
		
		Scene scene = new Scene(root, 400,400);
		primaryStage.setScene(scene);
		primaryStage.setTitle("Create Account");
		
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