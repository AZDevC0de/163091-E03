package com.company;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class Main {

    public static void main(String[] args) {
        LinkedHashSet<Integer> hset = new LinkedHashSet<>();
        hset.add(11);
        hset.add(55);
        hset.add(33);
        hset.add(15);
        usunPrzedostatni(hset);
        for (Integer x: hset) {
            System.out.println(x);
        }
    }
    public static <T> void usunPrzedostatni(LinkedHashSet<T>hset)
    {
        Iterator<T> it = hset.iterator();
        int i = 0;
        T r = null;
        while (it.hasNext()){
            T el = it.next();
            if(i==hset.size()-2) {
                r=el;
            }
            i++;
        }
        hset.remove(r);
    }
}
