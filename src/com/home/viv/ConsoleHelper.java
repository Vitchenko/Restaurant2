package com.home.viv;

import com.home.viv.kitchen.Dish;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**

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

/*4. Запустим приложение и введем 'fff', 'Soup' и 'exit'. В итоге наш заказ - Your order: [Soup],
а 'fff' проигнорировано.
Давай уведомим пользователя, что блюда 'fff' нет. Выведем аналогичную фразу
fff is not detected*/
        while(true) {

            curStr=readString();

            if(!curStr.equals("exit")){
                try {
                    allDishforOrder.add(Dish.valueOf(curStr));
                }
                catch (IllegalArgumentException e) {
                    writeMessage(curStr + " is not detected");
                }
            }
            else break;
        }


        return allDishforOrder;
    }

}
