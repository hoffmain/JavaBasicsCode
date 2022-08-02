package com.syntax.class26;

public interface Movable {
    void move();
}


class Car implements Movable{

    @Override
    public void move() {
        System.out.println("A car can move");
    }

    public void park(){
        System.out.println("You can park me");
    }
}

class Person implements Movable{

    @Override
    public void move() {
        System.out.println("Humans can also move");
    }
}

class Test{
    public static void main(String[] args) {
        Movable moveAble=new Car(); //widening
        moveAble.move();
        ((Car)(moveAble)).park(); //narrowing

        //with interfaces, we can also use polymorphism
        Movable[] movables={new Car(), new Person()};
    }
}