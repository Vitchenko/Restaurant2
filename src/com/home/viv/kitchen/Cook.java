package com.home.viv.kitchen;

import com.home.viv.ConsoleHelper;

import java.util.Observable;
import java.util.Observer;

/**
 4. В классе-Observable перед отправкой заказа сделаем следующее:
 4.1. Установим флаг setChanged()
 4.2. Отправим обсерверу заказ notifyObservers(order);

 */
public class Cook extends Observable implements Observer {
    String name;

    public Cook(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Cook{" + "name='" + name + '\'' + '}';
    }

    @Override
    public void update(Observable o, Object arg) {

        /**Start cooking - Your order: [Soup, Juice, Water] of Tablet{number=5}, cooking time 23min*/
        Order order;
        order=(Order)arg;
        ConsoleHelper.writeMessage("Start cooking - " + arg + ", cooking time " +order.getTotalCookingTime()+"min");
        setChanged();
        notifyObservers(arg);
    }
}
