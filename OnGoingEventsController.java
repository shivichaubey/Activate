package active.events;

import java.io.IOException;

import active.Main;
import javafx.fxml.FXML;

public class OnGoingEventsController {
private Main main;
	
	@FXML
	private void goHome() throws IOException{
		main.showMainItems();
		
	}
	
	@FXML
	private void goAddEvents() throws IOException{
		main.showAddEvent();
		
	}

}
