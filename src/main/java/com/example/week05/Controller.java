package com.example.week05;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class Controller {
    @FXML
    public Label labelid;
    public Label labelname;
    public Label labelage;

    @FXML
    public void connectBtn(ActionEvent actionEvent)
    {
        DatabaseConnectivity connect = new DatabaseConnectivity();
        Connection connectionDb=connect.getConnection();
        if (connectionDb!=null) {
            String connectQuery="select id, studentname, studentage from students";
            try{
                Statement stmt=connectionDb.createStatement();
                ResultSet queryOutput = stmt.executeQuery(connectQuery);
                while(queryOutput.next()){
                    labelid.setText(queryOutput.getString("id"));
                    labelname.setText(queryOutput.getString("studentname"));
                    labelage.setText(queryOutput.getString("studentage"));
                }
            } catch(Exception e) {
                e.printStackTrace();
            }
        }
    }
}
