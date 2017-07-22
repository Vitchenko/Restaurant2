package com.home.viv.kitchen;

import com.home.viv.ConsoleHelper;

import java.util.Observable;
import java.util.Observer;

/**
 3. Метод void update пусть выведет в консоль следующее:
 order + " was cooked by " + cook
 */
public class Waitor implements Observer {
    @Override
    public void update(Observable o, Object arg) {
        Cook cook;
        cook=(Cook)o;
        ConsoleHelper.writeMessage(arg + " was cooked by " + cook.name);
    }
}
