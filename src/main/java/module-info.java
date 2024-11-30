module com.example.csc311_db_ui_semesterlongproject {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;
    requires com.azure.storage.blob;
    requires com.opencsv;
    requires java.desktop;
    requires java.prefs;
    requires kernel;
    requires layout;


    opens viewmodel;
    exports viewmodel;
    opens dao;
    exports dao;
    opens model;
    exports model;
}