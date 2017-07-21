package com.home.viv;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 5. У нас все завязано на работу с консолью. Однако, при возникновении исключений, наше приложение умрет.
 Чтобы узнать причину - добавим в Tablet статический логгер java.util.logging.Logger, инициализированный
 именем класса.
 6. В методе createOrder класса Tablet обработаем исключения ввода-вывода.
 Запишем в лог "Console is unavailable.". Уровень лога - SEVERE - это самый серьезный уровень, мы не
 можем работать.

 */
public class Tablet {

    public int number;
    private static Logger log = Logger.getLogger(Tablet.class.getName());

    public Tablet(int number) {
        this.number = number;
    }

    public void createOrder(){
        try{

        }
        catch (Exception ex){
            log.log(Level.SEVERE, "Exception: ", ex);
        }
    }
}
