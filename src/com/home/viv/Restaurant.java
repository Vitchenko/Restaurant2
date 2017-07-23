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






    }

}
