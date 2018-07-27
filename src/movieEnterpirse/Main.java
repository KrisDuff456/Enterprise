package movieEnterpirse;

import javafx.application.Application;
import javafx.stage.Stage;

public class Main extends Application {
	
	public static void main(String[] args) {
		Application.launch(args);
	}
	public void start(Stage primaryStage) throws Exception {
		new HomeStage().start(primaryStage);
		// new JDBC().accessDB();
	   //new JDBC().addAccount();
		// new JDBC().selectAccount();
		// new JDBC().deleteAccount();
		
	}
}