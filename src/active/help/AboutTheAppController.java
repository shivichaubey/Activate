package active.help;

import java.io.IOException;

import active.Main;
import javafx.fxml.FXML;

public class AboutTheAppController {
	
	private Main main;
	@FXML
	private void goHome() throws IOException{
		main.showMainItems();
		
	}
	
	

}
