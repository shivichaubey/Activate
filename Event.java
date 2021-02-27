import java.util.LinkedList;
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
	private LinkedList<String> policeList = new LinkedList<String>();
	private LinkedList<String> violenceList = new LinkedList<String>();
	private LinkedList<String> injuryList = new LinkedList<String>();
	private LinkedList<String> gunsList = new LinkedList<String>();
	private LinkedList<String> hateList = new LinkedList<String>();
	private LinkedList<String> crimeList = new LinkedList<String>();
	private LinkedList<String> notSafe = new LinkedList<String>();
	private LinkedList<String> covidList = new LinkedList<String>();


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
		if(newUpdate.contains("police")){
			policeList.add(newUpdate);
			
		}
		if(newUpdate.contains("covid")){
			covidList.add(newUpdate);
			
		}
		if(newUpdate.contains("violence")){
			violenceList.add(newUpdate);
			
		}
		if(newUpdate.contains("injury")){
			injuryList.add(newUpdate);
			
		}
		if(newUpdate.contains("guns")){
			gunsList.add(newUpdate);
			
		}
		if(newUpdate.contains("hate")){
			hateList.add(newUpdate);
			
		}
		if(newUpdate.contains("crime")){
			crimeList.add(newUpdate);
			
		}
		if(newUpdate.contains("not safe")){
			notSafe.add(newUpdate);
			
		}

	}
	
	public LinkedList getUpdates(){
		return listOfUpdate;
	}
	
	public LinkedList getViolenceList(){
		return violenceList;
	}
	public LinkedList getCovidList(){
		return covidList;
	}
	public LinkedList getPoliceList(){
		return policeList;
	}
	public LinkedList getInjuryList(){
		return injuryList;
	}
	public LinkedList getGunsList(){
		return gunsList;
	}
	public LinkedList getHateList(){
		return hateList;
	}
	public LinkedList getCrimeList(){
		return crimeList;
	}
	public LinkedList getNotSafeList(){
		return notSafe;
	}
	
	
}
