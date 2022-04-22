package com.company.behavioural.memento;

import java.util.ArrayList;
import java.util.List;

public class CareTaker {
    public List<Memento> mementoList = new ArrayList<>();

    public void addMemento(Memento memento) {
        this.mementoList.add(memento);
    }

    public Memento getMemento(Integer index) {
        return mementoList.get(index);
    }
}
