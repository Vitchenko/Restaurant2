package com.home.viv;

import com.home.viv.kitchen.Dish;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by viv on 20.07.2017.
 */
public class Restaurant {

    public static void main(String[] args) throws IOException {

        ArrayList<Dish> dishesForOrder = new ArrayList<>();
        dishesForOrder= (ArrayList<Dish>) ConsoleHelper.getAllDishesForOrder();
        System.out.println(dishesForOrder);

    }

}
