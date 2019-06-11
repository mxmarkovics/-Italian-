package application;

import java.io.IOException;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;

public class RandomController {

	@FXML
	void goToHome() throws IOException {
		
		FXMLLoader loader = new FXMLLoader();
		loader.setLocation(Main.class.getResource("/application/HomePage.fxml"));
		AnchorPane mainLayout = loader.load();
		Scene Newscene = new Scene(mainLayout);
		
		Main.window.setScene(Newscene);
		Main.window.show();
	}

}
