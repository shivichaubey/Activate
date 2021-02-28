package active.events;



import java.io.IOException;

import active.Main;
import active.eventsAndThat.Event;
import active.eventsAndThat.eventListManager;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class AddEventController {
    private Main main;
    private String eventName;
    private String eventLocation;
    private String eventStartTime;
    private String eventEndTime;
    private String eventType;
@FXML
private TextField name;
@FXML
private TextField loc;
@FXML
private TextField startTime;
@FXML
private TextField endTime;
@FXML
private TextField type;
@FXML
private Button eventAdd;

eventListManager eventList = new eventListManager();

	@FXML
	private void goBack() throws IOException{
		main.showCurrentEventsScene();
		
	}
	 @FXML
	    private void handleNameFieldAction(ActionEvent event) {
	        eventName = name.getText();
	    }


	    @FXML
	    private void handleLocationAction(ActionEvent event) {
	        eventLocation = loc.getText();
	    }


	    @FXML
	    private void handleSTimeAction(ActionEvent event) {
	        eventStartTime = startTime.getText();

	    }


	    @FXML
	    private void handleETimeAction(ActionEvent event) {
	        eventEndTime = startTime.getText();

	    }


	    @FXML
	    private void handleTypeAction(ActionEvent event) {
	        eventType = type.getText();

	    }
	    


	    @FXML
	    private void handleAddAction(ActionEvent event) {
	            Event originalEvent = new Event(eventName, eventLocation,
	                eventStartTime, eventEndTime, eventType);	            
	            
	            eventList.add(originalEvent);
	            	            
	    }

	

}
