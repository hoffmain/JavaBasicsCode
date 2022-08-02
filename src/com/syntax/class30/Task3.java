package com.syntax.class30;

import java.util.HashMap;
import java.util.Map;

public class Task3 {
    /*
    Create a map of Best Buy store. Place item id and item name into it.
    Example(789556=Printer, 425325=TV, etc.)
    Retrieve all keys and values from a Best Buy map using EntrySet.
     */
    public static void main(String[] args) {
        HashMap<Integer,String> item=new HashMap<>();
        item.put(515424, "Printer");
        item.put(845262, "iPhone");
        item.put(748842, "TV");
        item.put(365411, "Refrigerator");
        item.put(357894, "iPad");
        item.entrySet();
        for(Map.Entry<Integer,String> entry:item.entrySet()){
            System.out.println(entry);
        }
    }
}
