package com.syntax.class25;

public class Human {
    final boolean canFlyWithOutAnyDevice; //with 'final' you need to initialize the value
    Human(){
        //final fields can also be initialized inside a constructor
        canFlyWithOutAnyDevice=false; // once value is assigned then you cannot change it
    }
}
