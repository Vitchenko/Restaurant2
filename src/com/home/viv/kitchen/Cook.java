package com.home.viv.kitchen;

import com.home.viv.ConsoleHelper;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by viv on 21.07.2017.
 */
public class Cook implements Observer {
    String name;

    public Cook(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Cook{" + "name='" + name + '\'' + '}';
    }
/**3. Метод void update(Observable observable, Object arg), который необходимо реализовать,
 принимает два параметра.
 -observable - объект, который отправил нам значение
 -arg - само значение, в нашем случае - это объект Order
 На данном этапе мы сымитируем обработку и выведем в консоль "Start cooking - " + order
 */
    @Override
    public void update(Observable o, Object arg) {
        ConsoleHelper.writeMessage("Start cooking - " + arg);
    }
}
