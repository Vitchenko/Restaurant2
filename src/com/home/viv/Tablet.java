package com.home.viv;

import com.home.viv.kitchen.Order;
import javafx.beans.InvalidationListener;
import javafx.beans.Observable;


import java.util.logging.Level;
import java.util.logging.Logger;

/**
  */
public class Tablet extends java.util.Observable {

    public int number;
    private static Logger log = Logger.getLogger(Tablet.class.getName());

    public Tablet(int number) {
        this.number = number;
    }

    public void createOrder(){

        Order order = null;

        try {

            order = new Order(this);
            ConsoleHelper.writeMessage(order.toString());

            if(!order.isEmpty())
            {
                setChanged();
                notifyObservers(order);
            }

        }
        catch (Exception ex){
            log.log(Level.SEVERE, "Exception: ", ex);
        }
    }



    @Override
    public String toString() {
        return "Tablet{" +
                "number=" + number +
                '}';
    }


}
