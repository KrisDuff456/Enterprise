

import javafx.application.Application;
import javafx.stage.Stage;

public class Main extends Application {
	
	public static void main(String[] args) throws Exception {
		
		new JDBC().accessDB();
		Application.launch(args);
		//new JDBC().addAccount();
		//new JDBC().selectAccount();
		//new JDBC().deleteAccount();
	}
	public void start(Stage primaryStage) throws Exception {
		new HomeStage().start(primaryStage);
		 
	   
		
		
	}
}