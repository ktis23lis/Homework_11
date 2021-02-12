package com.company;

import java.security.Key;
import java.util.*;

public class Main {

    public static void main(String[] args) {

//Задание 1.
//        HashMap<Integer, Integer> hm = new HashMap<>();
//        hm.put(1, 33);
//        hm.put(2, 34);
//        hm.put(3, 60);
//        hm.put(4, 21);
//        changeItem(hm,60, 21);
//        HashMap<Integer, String> hm2 = new HashMap<>();
//        hm.put(1, "a");
//        hm.put(2, "b");
//        hm.put(3, "c");
//        hm.put(4, "d");
//        changeItem(hm2,"a", "d");
//Задание 2.
//        String [] a = {"a","c","b"};
//        Integer []b = {1,2,3};
//       addArrInList(a);
//       addArrInList(b);
//Задание3.
        Apple apple1 = new Apple();
        Apple apple2 = new Apple();
        Apple apple3 = new Apple();
        Box<Apple> box = new Box<>();
        box.put(apple2);
        box.put(apple3);
        box.put(apple1);


        Apple ap1 = new Apple();
        Apple ap2 = new Apple();
        Apple ap3 = new Apple();
        Box<Apple> box2 = new Box<>();
        box.put(ap1);
        box.put(ap2);
        box.put(ap3);

        Orange orange = new Orange();
        Orange orange1 = new Orange();
        Box<Orange>box1 = new Box<>();
        box1.put(orange);
        box1.put(orange1);

        Box.arrChange(box, box2);
        System.out.println(box.getWeight());
        System.out.println(box.getWeight());
        System.out.println(box1.getWeight());
        System.out.println(box.compare(box1));
    }

//2. Написать метод, который преобразует массив в ArrayList;
    public static <T> void addArrInList (T[]arr ){
        ArrayList<T>arrayList = new ArrayList<>();
        arrayList.addAll(Arrays.asList(arr));
        System.out.println(arrayList);
    }

//1. Написать метод, который меняет два элемента массива местами (массив может быть любого ссылочного типа);
    public static <K,T> void changeItem(Map<K, T> hashMap, T c1, T c2) {
        if (hashMap.containsValue(c1) == true && hashMap.containsValue(c2) == true) {
            System.out.println("Before change "+ hashMap);
            for (Map.Entry<K, T> entry : hashMap.entrySet()) {
                if (c1.equals(entry.getValue())) {
                    K g =  entry.getKey();
                    for (Map.Entry<K, T> entry1 : hashMap.entrySet()) {
                        if (c2.equals(entry1.getValue())) {
                            K w =  entry1.getKey();
                            T s = c1;
                            hashMap.replace(g, c1, c2);
                            hashMap.replace(w, c2, s);
                            System.out.println("After change "+ hashMap);
                        }
                    }
                    break;
                }
            }
        }else  System.out.println("Data error");
    }
}
