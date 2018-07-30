
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class AccountStage extends Application {
	
	private Button homeStage;
	private Button create;
    static Connection conn = null;
    
	@Override
	public void start(Stage primaryStage) throws Exception {
	
		homeStage = new Button("Back");
		create = new Button("Create Account");
		GridPane grid = new GridPane();
		grid.setAlignment(Pos.CENTER);
		grid.setPadding(new Insets(20));
		grid.setHgap(10);
		grid.setVgap(10);
		
		grid.add(homeStage, 0, 5);
		grid.add(create,1,5);
		
		grid.add(new Label ("Email Address"), 0, 0);
		grid.add(new Label ("First Name"), 0, 1);
		grid.add(new Label ("Last Name"), 0, 2);
		grid.add(new Label ("Password"), 0, 3);
		
		TextField Email = new TextField();
		TextField firstName = new TextField();
		TextField lastName = new TextField();
		TextField password = new TextField();
		
		grid.add(Email, 1, 0);
		grid.add(firstName, 1, 1);
		grid.add(lastName, 1, 2);
		grid.add(password, 1, 3);
	         
		StackPane root = new StackPane();
		root.getChildren().addAll(grid);
		
		Scene scene = new Scene(root, 400,400);
		primaryStage.setScene(scene);
		primaryStage.setTitle("Create Account");
		
		create.setOnAction(new EventHandler<ActionEvent>() {
		@Override
		 public void handle(ActionEvent event){
			
			String email = Email.getText();
			String fName = firstName.getText();
			String lName = lastName.getText();
			String userPass = password.getText();
		try {
			Statement stmt = conn.createStatement();
			stmt.executeUpdate("Insert into account(Email , First_name , Last_name , Password ) Values( '" + email+ "','"+fName+"','"+lName+"','"+ userPass+ "')");
				
			}catch(SQLException sqle) {sqle.printStackTrace();}
			try {
				conn.close();
			} catch (SQLException e) {e.printStackTrace();}}
		});
		
		
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