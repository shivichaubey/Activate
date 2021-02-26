import java.util.*;
public class Event {
//var 
	private String nameOfEvent;
	//how to make var for location?
	private String location;
	private double startTime;
	//idk if we want to keep this running
	private double endTime; 
	private String typeOfEvent;
	private LinkedList<String> listOfUpdate = new LinkedList<String>();
	
	//constructor
	public Event(String eventName, String myLocation, double myStartTime, 
			double myEndTime, String myTypeEvent){
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
	
	public double getStartTime(){
		return startTime;
	}
	public double getEndTime(){
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
	
	
	
}
