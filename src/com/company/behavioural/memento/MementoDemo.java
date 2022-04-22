package com.company.behavioural.memento;

public class MementoDemo {
    public static void main(String[] args) {
        Originator originator = new Originator();
        CareTaker careTaker = new CareTaker();
        originator.setState("State #1");
        careTaker.addMemento(originator.saveStateToMemento());
        originator.setState("State #2");
        careTaker.addMemento(originator.saveStateToMemento());
        originator.setState("State #3");
        careTaker.addMemento(originator.saveStateToMemento());

        System.out.println("Current State -> " + originator.getState());
        originator.getStateFromMemento(careTaker.getMemento(0));
        System.out.println("First State -> " + originator.getState());
        originator.getStateFromMemento(careTaker.getMemento(1));
        System.out.println("Second State -> " + originator.getState());
        originator.getStateFromMemento(careTaker.getMemento(2));
    }
}
