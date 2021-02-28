package active.eventsAndThat;

import java.util.*;

public class eventListManager {

    static ArrayList<Event> eventList;

    public eventListManager() {
        eventList = new ArrayList<Event>();
    }


    public void display() {
        for (Event party : this.eventList) {
            System.out.println(party.getEventName());
        }
    }


    public void add(Event e) {
        this.eventList.add(e);

    }
    
    public static ArrayList<Event> getEventList() {
        return eventList;
    }
    
}

// need to come up with a way to go back and update but maybe future feature
