package com.company;

import java.util.ArrayList;

public class Box <N extends Fruit> {
    public Number res;
    public N obg;

    public ArrayList<N> arrayList = new ArrayList<>();

//Сохраняем фрукты в массив
    public void put(N obg) {
        arrayList.add(obg);
    }
//Узнаем вес коробки
    public float getWeight() {
        Integer i = arrayList.size();
        if (i > 0) {
            Number s = arrayList.get(0).getWeight();
            res =  s.floatValue() * i;


        }
        return res.floatValue();
    }


//Сравниваем коробки
    public boolean compare (Box<?>box){
        return Math.abs(this.getWeight()-box.getWeight())<0.0002F;
    }
//Пересыпаем фрукты
    public static  <N extends Fruit> void arrChange (Box <N>b1, Box <N>b2){
         b1.arrayList.addAll(b2.arrayList);

    }


}