import java.util.ArrayList;
import java.util.LinkedList;
public class ListOfEvents {
	//builds linked list of events 
	private LinkedList<Event> eventList = new LinkedList<Event>();
	//default constructor 
	public ListOfEvents(){
		
	}
	public void addEvent(Event e){
		eventList.add(e);
	}
	public LinkedList getEventList(){
		return eventList;
	}
	
	public ArrayList makeArray(){
		ArrayList<Event> a = new ArrayList<Event>();
		for(Event r : eventList ){
			a.add(r);
		}
		return a;
		
	}
}
