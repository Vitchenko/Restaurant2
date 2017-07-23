package com.home.viv.ad;

/**
 2.Создадим класс Advertisement(Рекламное объявление) в пакете ad, у которого будут следующие поля:
 Object content - видео
 String name - имя/название
 long initialAmount - начальная сумма, стоимость рекламы в копейках. Используем long, чтобы избежать проблем с округлением
 int hits - количество оплаченных показов
 int duration - продолжительность в секундах
 Модификаторы доступа расставьте самостоятельно.

 3. В классе Advertisement создадим конструктор с порядком аргументов, соответствующим перечисленной
 последовательности всех полей класса

 4. В этом же пакете создадим еще два класса:
 AdvertisementStorage - хранилище рекламных роликов. У нас будет единственное.
 AdvertisementManager - у каждого планшета будет свой объект менеджера,
 который будет подбирать оптимальный набор роликов и их последовательность для каждого заказа.
 Он также будет взаимодействовать с плеером и отображать ролики

 5. Т.к. хранилище рекламных роликов AdvertisementStorage единственное для всего ресторана,
 то сделаем его синглтоном.


 */
public class Advertisement {
    private Object content;// content - видео
    private String name;// - имя/название
    private long initialAmount;// - начальная сумма, стоимость рекламы в копейках. Используем long, чтобы избежать проблем с округлением
    private int hits;// - количество оплаченных показов
    private int duration;// - продолжительность в секундах

    public Advertisement(String name, long initialAmount, int hits, int duration) {
        this.name = name;
        this.initialAmount = initialAmount;
        this.hits = hits;
        this.duration = duration;
    }
}
