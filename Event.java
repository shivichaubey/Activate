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
	private String update;
	
	//constructor
	public Event(String eventName, String myLocation, double myStartTime, 
			double myEndTime, String myTypeEvent, String myUpdate ){
		nameOfEvent = eventName;
		location = myLocation;
		startTime = myStartTime;
		endTime = myEndTime;
		typeOfEvent = myTypeEvent;
		update = myUpdate;
		update =null;
				
		
	}
	
}
