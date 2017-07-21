package com.home.viv.kitchen;

import com.home.viv.ConsoleHelper;
import com.home.viv.Tablet;

import java.io.IOException;
import java.util.ArrayList;

/**
 +4. В классе Order (заказ) должна быть информация, относящаяся к списку выбранных пользователем блюд.
 Т.е. где-то должен быть список всех блюд, и должен быть список выбранных блюд в классе Order.
 Нам нужен класс Dish(Блюдо), создадим его в пакете kitchen. Пусть это будет энум с какими-то данными, например,
 Fish, Steak, Soup, Juice, Water

 +3. Вернемся к классу Order: в нем есть ссылка на планшет, и еще есть список выбранных блюд.
 Создайте поле dishes - список блюд. Инициализируйте его в конструкторе, вызвав метод
 getAllDishesForOrder из ConsoleHelper.

 4. Перепишите метод toString в классе Order. Пусть он возвращает пустую строку, если нет блюд в заказе, иначе
 вывод должен быть аналогичный примеру в порядке добавления блюд. Используйте ConsoleHelper.
 Пример:
 Your order: [Juice, Fish] of Tablet{number=5}


 */
public class Order {

    Tablet tablet=new Tablet();//???



    ArrayList<Dish> dishes = new ArrayList<>();

    public Order() throws IOException {
        this.dishes = ConsoleHelper.getAllDishesForOrder();
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
}
