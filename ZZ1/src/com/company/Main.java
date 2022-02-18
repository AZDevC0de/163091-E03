package com.company;
import java.time.LocalTime;
import java.util.*;
import java.util.LinkedList;
import java.util.concurrent.TimeUnit;

public class Main {

    public static void redukuj (LinkedList list,int N) {
        int i = N-1;
        while (i < list.size()){
            list.remove(i);
            i--;
            i+=N;
        }

    }
    public static void main(String[] args) {
        LinkedList <Integer> a = new LinkedList<>();
        a.add(1);
        a.add(2);
        a.add(3);
        a.add(4);
        a.add(5);
        a.add(6);
        a.add(7);
        a.add(8);
        a.add(9);
        redukuj(a,3);
        for(Integer i:a ){
            System.out.println(i);
        }
        LinkedList<LocalTime>b=new LinkedList<>();
        b.add(LocalTime.now());
        b.add(LocalTime.now());
        b.add(LocalTime.now());
        b.add(LocalTime.now());
        b.add(LocalTime.now());
        b.add(LocalTime.now());
        b.add(LocalTime.now());
        redukuj(b,2);

        for(LocalTime i:b){
            System.out.println(i);
        }

    }
}
