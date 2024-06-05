package com.example.week05;

import java.sql.Connection;
import java.sql.DriverManager;

public class DatabaseConnectivity {
    public Connection databaseLink;

    public Connection getConnection()
    {
        String databaseName="sample";
        String databaseUser="root";
        String databasePassword="1234";
        String url="jdbc:mysql://127.0.0.1:3306/" + databaseName;

        try{
           databaseLink = DriverManager.getConnection(url,databaseUser,databasePassword);
        } catch(Exception e) {
            e.printStackTrace();
        }

        return databaseLink;
    }
}
