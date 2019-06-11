package application;

import java.io.IOException;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;

public class HomeController {
	
	@FXML
	static Button phrase;
	@FXML
	static Button random;
	@FXML
	static Button translator;
	
	@FXML
	void goToRandom() throws IOException {
		
		FXMLLoader loader = new FXMLLoader();
		loader.setLocation(Main.class.getResource("/application/Random.fxml"));
		AnchorPane mainLayout = loader.load();
		Scene Newscene = new Scene(mainLayout);
		
		Main.window.setScene(Newscene);
		Main.window.show();

	}
	
	@FXML
	void goToPhrases() throws IOException {
		
		FXMLLoader loader = new FXMLLoader();
		loader.setLocation(Main.class.getResource("/application/Phrases.fxml"));
		AnchorPane mainLayout = loader.load();
		Scene Newscene = new Scene(mainLayout);
		
		Main.window.setScene(Newscene);
		Main.window.show();

	}
	
	@FXML
	void goToTranslator() throws IOException {
		
		FXMLLoader loader = new FXMLLoader();
		loader.setLocation(Main.class.getResource("/application/Translator.fxml"));
		AnchorPane mainLayout = loader.load();
		Scene Newscene = new Scene(mainLayout);
		
		Main.window.setScene(Newscene);
		Main.window.show();

	}

}
