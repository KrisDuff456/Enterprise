
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class HomeStage extends Application{
	
	private Button filmStage;
	private Button accountStage;
	private Button loginStage;
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		accountStage = new Button("Sign Up");
		loginStage = new Button("Login");
		filmStage = new Button ("Film");
		HBox h = new HBox(10);
		     h.setAlignment(Pos.CENTER);
		h.getChildren().addAll(filmStage,accountStage,loginStage);
		StackPane root = new StackPane();
		
		root.getChildren().addAll(h);
		Scene scene = new Scene(root, 400,400);
		primaryStage.setScene(scene);
		primaryStage.setTitle("Home");
		
		filmStage.setOnAction(new EventHandler<ActionEvent>(){
			public void handle (ActionEvent event) {
				primaryStage.close();
				try {
					new filmStage().start(new Stage());
				}catch(Exception e) {e.printStackTrace();}
				}
			});
			primaryStage.show();
		
		
		loginStage.setOnAction(new EventHandler<ActionEvent>() {
			  @Override
			  public void handle(ActionEvent event) {
				  primaryStage.close();
				   try {
					new LoginStage().start(new Stage());
				} catch (Exception e) {e.printStackTrace();}
			  }
		  });
		 primaryStage.show();
		 
		 accountStage.setOnAction(new EventHandler<ActionEvent>() {
			  @Override
			  public void handle(ActionEvent event) {
				  primaryStage.close();
				   try {
					new AccountStage().start(new Stage());
				} catch (Exception e) {e.printStackTrace();}
			  }
		  });
		 primaryStage.show();
	}
}
