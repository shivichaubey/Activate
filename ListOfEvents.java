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
	
	

}
