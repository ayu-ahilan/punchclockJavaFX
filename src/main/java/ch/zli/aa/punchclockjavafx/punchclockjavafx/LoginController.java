package ch.zli.aa.punchclockjavafx.punchclockjavafx;

import java.io.IOException;

/**
 * Class:
 *
 * @Author: Ayushan Ahilan
 * @Version:
 */
public class LoginController {
    public void goToMain() throws IOException {
        HelloApplication.getInstance().toMain_view();

    }

    public void goToSignUp() throws IOException {
        HelloApplication.getInstance().toSignUP_view();
    }
}
