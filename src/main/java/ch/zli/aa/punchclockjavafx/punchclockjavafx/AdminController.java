package ch.zli.aa.punchclockjavafx.punchclockjavafx;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.control.TreeTableView;

import java.io.IOException;

/**
 * Class:
 *
 * @Author: Ayushan Ahilan
 * @Version:
 */
public class AdminController {

    @FXML
    TreeTableView treeTableView;

    @FXML
    TextField idToDelete;
    public void backToMain() throws IOException {

        Application.getInstance().toMain_view();
    }

    public void deleteUser() throws IOException {

    }

    public void saveUpdatetUser() throws IOException {

    }

    public void enterIDUpdate() throws IOException {

    }
}
