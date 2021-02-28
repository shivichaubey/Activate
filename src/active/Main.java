package active;

import java.io.IOException;
import java.util.ArrayList;
import active.events.UpdateEventsController;
import active.eventsAndThat.Event;
import active.eventsAndThat.eventListManager;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class Main extends Application {
    private Stage primaryStage;
    private static BorderPane mainLayout;
    static ArrayList<Button> buttonList = new ArrayList<Button>();
    private static String eName;
    static ArrayList<String> updates = UpdateEventsController.getUpdateList();
    

    @Override
    public void start(Stage primaryStage) throws IOException {
        this.primaryStage = primaryStage;
        this.primaryStage.setTitle("ACTIVATE");

        showMainView();
        showMainItems();

    }
    public static String getEName() {
        return eName;
    }


    public static void showMainItems() throws IOException {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(Main.class.getResource("view/MainItems.fxml"));
        BorderPane mainItems = loader.load();
        mainLayout.setCenter(mainItems);
    }


    public static void showAddEvent() throws IOException {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(Main.class.getResource("events/AddEvent.fxml"));
        BorderPane singleEvent = loader.load();
        mainLayout.setCenter(singleEvent);
    }


    public void showMainView() throws IOException {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(Main.class.getResource("view/MainView.fxml"));
        mainLayout = loader.load();
        Scene scene = new Scene(mainLayout);
        primaryStage.setScene(scene);
        primaryStage.show();
    }


    public static void showAboutTheAppScene() throws IOException {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(Main.class.getResource("help/AboutTheApp.fxml"));
        BorderPane help = loader.load();
        mainLayout.setCenter(help);
    }


    public static void showAboutTheTeam() throws IOException {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(Main.class.getResource("aboutus/AboutTheTeam.fxml"));
        BorderPane teaminfo = loader.load();
        mainLayout.setCenter(teaminfo);
    }


    public static void showCurrentEventsScene() throws IOException {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(Main.class.getResource("events/OngoingEvents.fxml"));
        GridPane ongoingEvents = loader.load();
        mainLayout.setCenter(ongoingEvents);
        for (int i = 0; i < eventListManager.getEventList().size(); i++) {
            Button newButton = new Button(eventListManager.getEventList().get(i)
                .getEventName());
            ongoingEvents.add(newButton, 1, i + 1);
            buttonList.add(newButton);
            eName = eventListManager.getEventList().get(i).getEventName();
            String eLocation = eventListManager.getEventList().get(i)
                .getEventLocation();
            String eStartTime = eventListManager.getEventList().get(i)
                .getStartTime();
            String eEndTime = eventListManager.getEventList().get(i)
                .getEndTime();
            String eType = eventListManager.getEventList().get(i)
                .getTypeOfEvent();
            newButton.setOnAction(new EventHandler<ActionEvent>() {
                @Override
                public void handle(ActionEvent e) {
                    try {
                        showUpdateEventView(eName, eLocation, eStartTime,
                            eEndTime, eType);
                    }
                    catch (IOException e1) {
                        // TODO Auto-generated catch block
                        e1.printStackTrace();
                    }
                }
            });
        }
    }


    private static void showUpdateEventView(
        String name,
        String location,
        String start,
        String end,
        String type)
        throws IOException {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(Main.class.getResource("events/updateEvents.fxml"));
        GridPane teaminfo = loader.load();
        mainLayout.setCenter(teaminfo);
        teaminfo.add(new TextField(name), 0, 3);
        teaminfo.add(new TextField(location), 0, 4);
        teaminfo.add(new TextField(start), 0, 5);
        teaminfo.add(new TextField(end), 0, 6);
        teaminfo.add(new TextField(type), 0, 7);
        for (int i = 1; i<updates.size()+1; i++) {
            teaminfo.add(new TextField(updates.get(i-1)), 0, i+8);
        }

    }



    public static void main(String[] args) {
        launch(args);
    }

}
