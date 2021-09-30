package ch.zli.aa.punchclockjavafx.punchclockjavafx;

import javafx.fxml.FXML;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

import java.io.IOException;

public class MainController {

    @FXML
    TextField checkInTime;

    @FXML
    TextField checkOutTime;

    @FXML
    DatePicker checkIn;

    @FXML
    DatePicker checkOut;

    @FXML
    TableView tableView;

    @FXML
    TextField id_textfield;

    @FXML
    TextField project;

    @FXML
    TextField category;

    public void saveData() throws IOException {

    }

    public void logout() throws IOException {

        Application.getInstance().toLogin_view();
    }

    public void delete() throws IOException {

    }

    public void admin() throws IOException {

        Application.getInstance().toAdmin_view();
    }

}