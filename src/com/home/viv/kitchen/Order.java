package com.home.viv.kitchen;

import com.home.viv.ConsoleHelper;
import com.home.viv.Tablet;

import java.io.IOException;
import java.util.ArrayList;

/**


 */
public class Order {


    private Tablet tablet;


    ArrayList<Dish> dishes = new ArrayList<>();

    public Order(Tablet tablet) throws IOException {
        this.dishes = ConsoleHelper.getAllDishesForOrder();
        this.tablet=tablet;
    }

    public int getTotalCookingTime(){

        int rezTime=0;

        for(Dish dish:dishes){
            rezTime+=dish.getDuration();
        }

        return rezTime;
    }

    public void createOrder(){

    }

    @Override
    public String toString() {

        //Your order: [Juice, Fish] of Tablet{number=5}

        StringBuilder str=new StringBuilder();
        for(int i=0;i<dishes.size();i++){
            if(i==dishes.size()-1){
                str.append(dishes.get(i).name());}
            else{
                str.append(dishes.get(i).name()+", ");
            }

        }

        return "Your order: [" + str.toString() + "] of Tablet{number="+ tablet.number +"}";
    }

    public boolean isEmpty(){
        boolean rezult;
        if(dishes.size()==0)
            {rezult=true;}
        else
            {rezult =false;}
        return rezult;
    }
}
