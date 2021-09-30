package ch.zli.aa.punchclockjavafx.punchclockjavafx;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;

import java.io.IOException;

/**
 * Class:
 *
 * @Author: Ayushan Ahilan
 * @Version:
 */
public class SignUpController {

    @FXML
    TextField username;
    @FXML
    TextField password;
    @FXML
    TextField passwordAgain;

    public void signupAndgoLogin() throws IOException {

        Application.getInstance().toLogin_view();
    }

    public void goLogin() throws IOException {

        Application.getInstance().toLogin_view();
    }
}
