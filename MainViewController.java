package active.view;

import java.io.IOException;

import active.Main;
import javafx.fxml.FXML;

public class MainViewController {
	
	private Main main;
	
	@FXML
	private void goHome() throws IOException{
		main.showMainItems();
		
	}

}
