package active.events;

import java.io.IOException;

import active.Main;
import javafx.fxml.FXML;

public class AddEventController {
private Main main;
	
	@FXML
	private void goBack() throws IOException{
		main.showCurrentEventsScene();
		
	}
	

}
