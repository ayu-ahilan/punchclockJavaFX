package ch.zli.aa.punchclockjavafx.punchclockjavafx;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

import java.io.IOException;

public class MainController {
    public void saveData() throws IOException {

    }

    public void logout() throws IOException {

        HelloApplication.getInstance().toLogin_view();
    }

    public void delete() throws IOException {

    }

    public void admin() throws IOException {

        HelloApplication.getInstance().toAdmin_view();
    }

}