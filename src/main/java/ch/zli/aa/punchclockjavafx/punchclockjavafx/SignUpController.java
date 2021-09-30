package ch.zli.aa.punchclockjavafx.punchclockjavafx;

import java.io.IOException;

/**
 * Class:
 *
 * @Author: Ayushan Ahilan
 * @Version:
 */
public class SignUpController {

    public void signupAndgoLogin() throws IOException {

        HelloApplication.getInstance().toLogin_view();
    }

    public void goLogin() throws IOException {

        HelloApplication.getInstance().toLogin_view();
    }
}
