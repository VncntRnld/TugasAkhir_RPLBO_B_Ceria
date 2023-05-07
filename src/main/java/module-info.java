module com.mbanking.mbankingceria {
    requires javafx.controls;
    requires javafx.fxml;

    requires com.dlsc.formsfx;

    opens com.mbanking.mbankingceria to javafx.fxml;
    exports com.mbanking.mbankingceria;
}