package active.view;

import java.io.IOException;

import active.Main;
import javafx.fxml.FXML;

public class MainItemsController {
	
	
	private Main main;
	@FXML
	private void goActiveEvents() throws IOException{
	 main.showCurrentEventsScene();
		
	}

}
