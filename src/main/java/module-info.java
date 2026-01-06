module dk.easv.thorsmovieplayer {
    requires javafx.controls;
    requires javafx.fxml;


    opens dk.easv.thorsmovieplayer to javafx.fxml;
    exports dk.easv.thorsmovieplayer;
}