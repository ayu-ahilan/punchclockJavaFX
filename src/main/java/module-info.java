module ch.zli.aa.punchclockjavafx.punchclockjavafx {
    requires javafx.controls;
    requires javafx.fxml;


    opens ch.zli.aa.punchclockjavafx.punchclockjavafx to javafx.fxml;
    exports ch.zli.aa.punchclockjavafx.punchclockjavafx;
}