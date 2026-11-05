module co.edu.uniquindio.poo.empresajfx {
    requires javafx.controls;
    requires javafx.fxml;

    opens co.uniquindio.edu.empresajfx to javafx.fxml;
    exports co.uniquindio.edu.empresajfx;
    exports co.uniquindio.edu.empresajfx.viewController;
    opens co.uniquindio.edu.empresajfx.viewController to javafx.fxml;

}
