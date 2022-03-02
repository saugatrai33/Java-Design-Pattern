package com.company.structural.proxy;

import com.company.structural.proxy.image.Image;
import com.company.structural.proxy.image.ProxyImage;

public class ProxyPatternDemo {
    public static void main(String[] args) {
        Image image = new ProxyImage("abc.jpt");
        image.display();
    }
}
