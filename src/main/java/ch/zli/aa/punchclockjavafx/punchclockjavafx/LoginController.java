package ch.zli.aa.punchclockjavafx.punchclockjavafx;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import org.json.simple.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.ProtocolException;
import java.net.URL;

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
        Application.getInstance().toMain_view();

    }

    public void goToSignUp() throws IOException {
        Application.getInstance().toSignUP_view();
    }

    public void login(ActionEvent actionEvent) throws IOException {

        JSONObject jObject = new JSONObject();
        jObject.put("password", password.getText());
        jObject.put("username", username.getText());

        URL url = new URL("http://localhost:8080/auth/User");

        HttpURLConnection con = (HttpURLConnection) url.openConnection();
        con.setRequestMethod("POST");
        con.setRequestProperty("Content-Type", "application/json");

        con.setDoOutput(true);
        OutputStream os = con.getOutputStream();
        os.write(jObject.toString().

                getBytes());
        os.flush();
        os.close();
        BufferedReader in = new BufferedReader(
                new InputStreamReader(
                        con.getInputStream()));
        String inputLine;

        String tokenJSON = "";
        while ((inputLine = in.readLine()) != null) {
            tokenJSON = inputLine;
        }
        in.close();

        System.out.println(con.getResponseCode());

        if (con.getResponseCode() == 200) {
            Application.getInstance().toMain_view();
        } else {

        }
    }
}
