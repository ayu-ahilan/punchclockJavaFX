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
public class LoginController {

    @FXML
    TextField username;

    @FXML
    TextField password;
    public void goToMain() throws IOException {
        HelloApplication.getInstance().toMain_view();

    }

    public void goToSignUp() throws IOException {
        HelloApplication.getInstance().toSignUP_view();
    }
}
