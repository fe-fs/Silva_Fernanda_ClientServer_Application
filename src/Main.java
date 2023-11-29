/*
 * Client/Server Application
 * Name: Fernanda Frederico Ribeiro da Silva
 * Class: Software Development I CEN-3024C-16046
 * Professor: Walauskis
 */

import javafx.application.Application;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) {
        // Create and show the Server window
        Server server = new Server();
        server.start(new Stage());

        // Create and show the Client window
        Client client = new Client();
        client.start(new Stage());
    }

    public static void main(String[] args) {
        launch(args);
    }
}
