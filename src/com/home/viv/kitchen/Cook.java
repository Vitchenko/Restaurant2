package com.home.viv.kitchen;

/**
 * Created by viv on 21.07.2017.
 */
public class Cook {
    String name;

    public Cook(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Cook{" + "name='" + name + '\'' + '}';
    }
}
