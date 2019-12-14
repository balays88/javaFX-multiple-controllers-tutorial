package com.mvp.java.controllers;

import javafx.fxml.FXML;
import javafx.scene.control.SingleSelectionModel;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.control.TextArea;

public class MainController {

    @FXML private ConsoleTabController consoleTabController;
    @FXML private TabPane tabPane;
    SingleSelectionModel<Tab> selectionModel;

    public TextArea getVisualLog() {
        return  loggerTabController.getLoggerTxtArea();
    }
    
    public Tab setTabText(){
        return selectionModel.getSelectedItem();
    }

    @FXML private void initialize() {
        consoleTabController.injectMainController(this);
        selectionModel = tabPane.getSelectionModel();
    }
}
