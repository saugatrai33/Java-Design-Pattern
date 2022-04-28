package com.company.behavioural.state;

public class Controller {
    public static Account account;
    public static Management management;
    public static Sales sales;

    public static Connection connection;

    public Controller() {
        account = new Account();
        management = new Management();
        sales = new Sales();
    }

    public void setAccountConnection() {
        connection = account;
    }

    public void setManagementConn() {
        connection = management;
    }

    public void setSalesConn() {
        connection = sales;
    }

    public void open() {
        connection.open();
    }

    public void close() {
        connection.close();
    }

    public void update() {
        connection.update();
    }

    public void log() {
        connection.log();
    }
}
