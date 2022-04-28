package com.company.behavioural.state;

public class StatePatternDemo {
    Controller controller;

    public StatePatternDemo(String conn) {
        controller = new Controller();
        if (conn.equalsIgnoreCase("man")) {
            this.controller.setManagementConn();
        } else if (conn.equalsIgnoreCase("sal")) {
            this.controller.setSalesConn();
        } else if (conn.equalsIgnoreCase("acc")) {
            this.controller.setAccountConnection();
        } else {
            throw new IllegalStateException("Invalid connection");
        }
        controller.open();
        controller.close();
        controller.log();
        controller.update();
    }

    public static void main(String[] args) {
        new StatePatternDemo("");
    }
}
