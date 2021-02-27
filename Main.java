
import java.text.SimpleDateFormat;

import java.util.*;
//kinda done?

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Would you like to enter a new event?");
		System.out.println("input:");
		String input = keyboard.nextLine();
		String eventName; 
		String eventLocation;
		double eventStartTime;
		double eventEndTime;
		String eventType;
		ListOfEvents lEvents = new ListOfEvents();
		ArrayList<Event> aEvents = new ArrayList<Event>();
		aEvents = lEvents.makeArray();
       //idk why this is not adding 	
		while(!input.equals("no")){
			System.out.println("Enter Event Name");
			eventName = keyboard.nextLine();
			System.out.println("Enter Event Location");
			eventLocation = keyboard.nextLine();
			System.out.println("Enter Event StartTime");
			eventStartTime = keyboard.nextDouble();
			System.out.println("Enter Event EndTime");
			eventEndTime = keyboard.nextDouble();
			System.out.println("Enter Event Type");
			keyboard.nextLine();
			//idk why this is breaking
			eventType = keyboard.nextLine();
			Event e = new Event(eventName, eventLocation, eventStartTime, eventEndTime, eventType);
			aEvents.add(e);
			System.out.println("Would you like to add another event?");
			input = keyboard.nextLine();
			
		}
		
		System.out.println("Congratulations! Here are your events!:");
		for(Event q : aEvents){
			System.out.println(q.getEventName());
		}
		
		System.out.println("Please Select an Event to Update or say no");
		String updateInput;
		updateInput = keyboard.nextLine();
		if(updateInput.equals("no")){
			keyboard.close();
			System.out.println("Thank you for choosing ACTIVATE!");
			
		}
		//allows users to update events
		else{
			//reaches inside the else
			String  stillUpdate = "yes";
			while(!stillUpdate.equals("no")){
			for(Event i : aEvents){
				if(i.getEventName().equals(updateInput)){
					System.out.println("Please enter your update!");
					String eventUpdate;
					eventUpdate = keyboard.nextLine();
					i.setUpdate(eventUpdate);
				}
				}
			System.out.println("Would you like to update again?");
			stillUpdate = keyboard.nextLine();
			}
			}
		for(Event a: aEvents){
			System.out.println(a.getEventName());
			System.out.println(a.getUpdates().toString());


		}
		}
			// need to come up with a way to go back and update but maybe future feature
		}
		
		
		



