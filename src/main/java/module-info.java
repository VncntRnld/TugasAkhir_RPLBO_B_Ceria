module com.mbanking.mbankingceria {
    requires javafx.controls;
    requires javafx.fxml;

    requires com.dlsc.formsfx;

    opens com.mbanking.mbankingceria to javafx.fxml;
    exports com.mbanking.mbankingceria;
    exports com.mbanking.mbankingceria.Model;
    opens com.mbanking.mbankingceria.Model to javafx.fxml;
}