package ch.zli.aa.punchclockjavafx.punchclockjavafx;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Application extends javafx.application.Application {

    private Stage primaryStage;

    private static Application instance;

    public static Application getInstance() {
        return instance;
    }

    @Override
    public void start(Stage stage) throws IOException {

        Application.instance = this;
        this.primaryStage = stage;

        FXMLLoader fxmlLoader = new FXMLLoader(Application.class.getResource("login_view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 650, 350);
        this.primaryStage.setTitle("Login");
        this.primaryStage.setScene(scene);
        this.primaryStage.show();

    }

    public void toMain_view() throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("main_view.fxml"));
        this.primaryStage.setScene(new Scene(root, 600, 410));
        this.primaryStage.setTitle("Punch Clock");
        this.primaryStage.show();
    }

    public void toSignUP_view() throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("signUp_view.fxml"));
        this.primaryStage.setScene(new Scene(root, 600, 410));
        this.primaryStage.setTitle("signUp");
        this.primaryStage.show();
    }

    public void toAdmin_view() throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("admin_view.fxml"));
        this.primaryStage.setScene(new Scene(root, 600, 410));
        this.primaryStage.setTitle("Admin");
        this.primaryStage.show();
    }

    public void toLogin_view() throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("login_view.fxml"));
        this.primaryStage.setScene(new Scene(root, 600, 410));
        this.primaryStage.setTitle("Login");
        this.primaryStage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}