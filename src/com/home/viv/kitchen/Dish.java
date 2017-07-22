package com.home.viv.kitchen;

/**
 1. Предположим, у нас известно время приготовления каждого блюда в минутах. Захардкодим его в классе Dish.
 1.1. Измените создание элементов энама - Fish(25), Steak(30), Soup(15), Juice(5), Water(3);
 1.2. Создайте поле private int duration с геттером.
 Чтобы создать геттер, нажмите Alt+Insert и выберите пункт Getter. Далее выберите имя поля и нажмите OK(Enter).
 */
public enum Dish {

    Fish(25), Steak(30), Soup(15), Juice(5), Water(3);
    private int duration;


    Dish(int duration) {
        this.duration=duration;
    }

    public int getDuration() {
        return duration;
    }

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
