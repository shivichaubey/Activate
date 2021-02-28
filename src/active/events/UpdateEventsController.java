package active.events;

import java.io.IOException;
import java.util.ArrayList;
import active.Main;
import active.eventsAndThat.Event;
import active.eventsAndThat.eventListManager;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class UpdateEventsController {
private Main main;
@FXML
private TextField up;
static ArrayList<String> updateList = new ArrayList<String>();

    @FXML
    private void goHome() throws IOException{
        main.showMainItems();

    }
    
    @FXML
    public void UpdateAction(ActionEvent event) {
        for (Event e : eventListManager.getEventList()) {
            if (main.getEName().equals(e.getEventName())) {
                e.setUpdate(up.getText());
                updateList.add(up.getText());
            }
        }
    }
    
    public static ArrayList<String> getUpdateList() {
        return updateList;
    }

}