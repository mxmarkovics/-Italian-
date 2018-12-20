package application;
	
import java.net.URL;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;


public class Main extends Application {
	public static Stage window;
	
	@Override
	public void start(Stage primaryStage) {
		try {
			window = primaryStage;
			window.setTitle("Monopoly Deal");
			
			
		    String sceneFile = "/application/HomePage.fxml";
		    Parent root = null;
		    URL    url  = null;
		    
		    url  = getClass().getResource( sceneFile );
	        root = FXMLLoader.load( url );
	        
	        final Scene scene = new Scene(root);
			window.setScene(scene);
			window.show();
			
			long x = 0;
			while (x < 1000000000) {
				x++;
			}
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(Main.class.getResource("application/Phrases.fxml"));
			AnchorPane mainLayout = loader.load();
			Scene Newscene = new Scene(mainLayout);
			
			window.setScene(Newscene);
			window.show();

		} catch(Exception e) {
			e.printStackTrace();
			
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
