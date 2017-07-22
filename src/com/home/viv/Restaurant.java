package com.home.viv;

import com.home.viv.kitchen.Cook;
import com.home.viv.kitchen.Dish;
import com.home.viv.kitchen.Order;
import com.home.viv.kitchen.Waitor;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by viv on 20.07.2017.
 */
public class Restaurant {

    public static void main(String[] args) throws IOException {

        Tablet tablet=new Tablet(3);
        Order order=new Order(tablet);
        Cook cook=new Cook("Ivan");
        cook.update(tablet,order);
        Waitor waitor=new Waitor();
        waitor.update(cook,order);


  /**5. Пишем main.
   Для объекта Observable добавляем свой объект Observer. См. п.2 и описание паттерна в wikipedia
   Называем повара, имя не влияет на тесты. В моем варианте - это Amigo :)

   Сверим выводы в консоль. Пример моего вывода:
   Your order: [Water] of Tablet{number=5}
   Start cooking - Your order: [Water] of Tablet{number=5}
   Your order: [Water] of Tablet{number=5} was cooked by Amigo

   */



    }

}
