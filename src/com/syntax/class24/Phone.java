package com.syntax.class24;

public abstract class Phone {

    abstract void displayPictures();
    abstract void unlock();

    void sentText(){
        System.out.println("Use the messaging app to sent the message");
    }

}

class Iphone extends Phone{ // will show an error unless you fulfill all the requirements
// all requirements must be implemented in the parent abstract class

    @Override
    void displayPictures() {
        System.out.println("use the Photos app to display the pictures");
    }

    @Override
    void unlock() {
        System.out.println("use FaceId to unlock the phone");
    }
}
class Samsung extends Phone{
    @Override
    void displayPictures() {
        System.out.println("Use the Gallery to display the pictures");
    }

    @Override
    void unlock() {
        System.out.println("User Finger print sensor or face unlock your phone");
    }
}
class Tester{
    public static void main(String[] args) {
        //you cannot create objects of abstract classes
        Samsung samsung=new Samsung();
        samsung.displayPictures();
    }
}