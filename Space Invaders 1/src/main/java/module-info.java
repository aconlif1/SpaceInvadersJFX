module com.abc.si {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.abc.si to javafx.fxml;
    exports com.abc.si;
}