package com.val.riazanski;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;

public class SpeedTest {
    //fields
    private static long linkTime = 0;
    private static long arrayTime = 0;
    private static long hashTime = 0;
    private static final long anInt = 5000000;
    //methods
    static void getLinkTime() {
        LinkedList linkedList = new LinkedList();
        long start = System.currentTimeMillis();
            for (int i = 0; i < anInt; i++) {
                linkedList.add(i);
            }
            long finish = System.currentTimeMillis();
        linkTime = finish - start;
    }
    static void getArrayTime() {
        ArrayList arrayList = new ArrayList();
        long start = System.currentTimeMillis();
        for (int i = 0; i < anInt; i++) {
            arrayList.add(i);
        }
        long finish = System.currentTimeMillis();
        arrayTime = finish - start;
    }
    static void getHashSetTime() {
        HashSet hashSet = new HashSet();
        long start = System.currentTimeMillis();
        for (int i = 0; i < anInt; i++) {
            hashSet.add(i);
        }
        long finish = System.currentTimeMillis();
        hashTime = finish - start;
    }
    public static void main(String[] args) {
        int nSeries = 10;
        long aLinkTime = 0;
        for (int i = 0; i < nSeries; i++) {
            getLinkTime();
            System.out.println(linkTime);
            aLinkTime = aLinkTime + linkTime;
        }
        System.out.println("среднее время добавления в LinkedList = " + aLinkTime / nSeries);

        long aArrayTime = 0;
        for (int i = 0; i < nSeries; i++) {
            getArrayTime();
            System.out.println(arrayTime);
            aArrayTime = aArrayTime + arrayTime;
        }
        System.out.println("среднее время добавления в ArrayList = " + aArrayTime / nSeries);

        long aHashTime = 0;
        for (int i = 0; i < nSeries; i++) {
            getHashSetTime();
            System.out.println(hashTime);
            aHashTime = aHashTime + hashTime;
        }
        System.out.println("среднее время добавления в ArrayList = " + aHashTime / nSeries);

    }

}
