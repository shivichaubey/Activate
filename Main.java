package active;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class Main extends Application {
	private Stage primaryStage;
	private static BorderPane mainLayout;

	@Override
	public void start(Stage primaryStage) throws IOException {
		this.primaryStage = primaryStage;
		this.primaryStage.setTitle("ACTIVATE");
		
		showMainView();
		showMainItems();
		
		
	}
	
	public static void showMainItems() throws IOException{
		FXMLLoader loader = new FXMLLoader();
		loader.setLocation(Main.class.getResource("view/MainItems.fxml"));
		BorderPane mainItems = loader.load(); 
		mainLayout.setCenter(mainItems);
	}
	public static void showAddEvent() throws IOException{
		FXMLLoader loader = new FXMLLoader();
		loader.setLocation(Main.class.getResource("events/AddEvent.fxml"));
		BorderPane singleEvent = loader.load(); 
		mainLayout.setCenter(singleEvent);
	}
	public  void showMainView() throws IOException{
		FXMLLoader loader = new FXMLLoader();
		loader.setLocation(Main.class.getResource("view/MainView.fxml"));
		mainLayout = loader.load();
		Scene scene = new Scene(mainLayout);
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	
	public static void showCurrentEventsScene() throws IOException{
		FXMLLoader loader = new FXMLLoader();
		loader.setLocation(Main.class.getResource("events/OngoingEvents.fxml"));
		BorderPane ongoingEvents = loader.load();
		mainLayout.setCenter(ongoingEvents);
	}

	public static void main(String[] args) {
		launch(args);
	}
	
}
