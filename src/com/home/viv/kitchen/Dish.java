package com.home.viv.kitchen;

/**
 * Created by viv on 20.07.2017.
 */
public enum Dish {

    Fish, Steak, Soup, Juice, Water;

    public static String allDishesToString(){
        StringBuffer allDish=new StringBuffer() ;

        Dish dish = null;
        Dish[] dishes=dish.values();

        for(int i=0; i<dishes.length;i++) {

            if(dishes[i].ordinal()<dishes.length-1)
            {
                allDish.append(dishes[i].name() + ", ");
            }
            else
            {
                allDish.append(dishes[i].name());
            }
        }

        return allDish.toString();
    }

}
