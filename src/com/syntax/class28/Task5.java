package com.syntax.class28;

import java.util.ArrayList;
import java.util.Iterator;

public class Task5 {
    public static void main(String[] args) {
        /*
        Create an arrayList of even numbers from 1 to 500.
        Remove any number that is divisible by 5 from that arrayList.
         */

        ArrayList<Integer> evenNum=new ArrayList<>();

        for(int i=2; i<500; i+=2){
            evenNum.add(i);
        }
        System.out.println(evenNum);

        /*Iterator<Integer> iterator=evenNum.iterator();
        while(iterator.hasNext()){
            if(iterator.next()%5==0){
                iterator.remove();
            }
        }*/

        evenNum.removeIf(num->num%5==0);
            System.out.println(evenNum);

    }
}
