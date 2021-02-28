package active.eventsAndThat;

import java.util.LinkedList;
import javafx.scene.control.Button;
public class Event {
//var 
    private String nameOfEvent;
    //how to make var for location?
    private String location;
    private String startTime;
    //idk if we want to keep this running
    private String endTime; 
    private String typeOfEvent;
    private LinkedList<String> listOfUpdate = new LinkedList<String>();
    
    //constructor
    public Event(String eventName, String myLocation, String myStartTime, 
            String myEndTime, String myTypeEvent){
        nameOfEvent = eventName;
        location = myLocation;
        startTime = myStartTime;
        endTime = myEndTime;
        typeOfEvent = myTypeEvent;
        
    }
    
    public String getEventName(){
        return nameOfEvent;
    }
    public String getEventLocation(){
        return location;
    }
    
    public String getStartTime(){
        return startTime;
    }
    public String getEndTime(){
        return endTime;
    }
    public String getTypeOfEvent(){
        return typeOfEvent;
    }
    public void setUpdate(String newUpdate){
        listOfUpdate.add(newUpdate);

    }
    public LinkedList getUpdates(){
        return listOfUpdate;
    }
    public Button createButton() {
        Button newButton = new Button(getEventName());
        return newButton;
    }
    
    
    
}
