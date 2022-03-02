package com.company.structural.proxy.image;

public class RealImage implements Image {
    private final String fileName;

    public RealImage(String fileName) {
        this.fileName = fileName;
        loadFromDisk(fileName);
    }

    @Override
    public void display() {
        System.out.println("Display real image:: " + fileName);
    }

    public void loadFromDisk(String fileName) {
        System.out.println("Loading file from disk with file name:: " + fileName);
    }
}
