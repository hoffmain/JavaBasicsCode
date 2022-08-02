package com.syntax.reviewclass11;

import java.util.*;

public class ListDemo {
    public static void main(String[] args) {
        List<String> names=new ArrayList<>();
        names.add("Zameer");
        names.add("Kat");
        names.add("Urzalla");
        names.add("Selyman");

        //type "iter" + Enter
        for (String name : names) {
            //type "soutv"+ Enter
            System.out.println("name = " + name);
        }

        Collections.sort(names);
        System.out.println(names);

    }
}
