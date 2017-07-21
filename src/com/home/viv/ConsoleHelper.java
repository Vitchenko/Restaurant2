package com.home.viv;

import com.home.viv.kitchen.Dish;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 1. Мы много работаем с консолью. Пора создать единую точку взаимодействия.
 Создайте класс ConsoleHelper с единственным BufferedReader, через который будете работать с консолью.
 Запомните, этот класс не хранит никаких данных и состояний, поэтому все методы будут статическими.
 Создайте в нем три метода:
 -writeMessage(String message) - для вывода message в консоль
 -String readString() - для чтения строки с консоли
 -List<Dish> getAllDishesForOrder() - просит ползователя выбрать блюдо и добавляет его в список.
 Введенное 'exit' означает завершение заказа.
 исключения пробрасывайте выше, на этом уровне не понятно, что с ними делать.
 */
public class ConsoleHelper {

    private static BufferedReader bufferedReader=new BufferedReader (new InputStreamReader(System.in));

    public static void writeMessage(String message){
        System.out.println(message);
    }

    public static String readString() throws IOException {

        return bufferedReader.readLine();
    }

    public static ArrayList<Dish> getAllDishesForOrder() throws IOException {

        ArrayList<Dish> allDishforOrder=new ArrayList();

        writeMessage("Choose a dish from list: " +Dish.allDishesToString());
        writeMessage("Insert name of dishes? (Type 'exit' to stop choices )");

        Dish dish = null;
        String curStr;

        while(true) {
            if(!(curStr=readString()).equals("exit")){
                allDishforOrder.add(dish.valueOf(curStr));
            }
            else break;
        }


        return allDishforOrder;
    }

}
