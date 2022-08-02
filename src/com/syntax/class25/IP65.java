package com.syntax.class25;

public interface IP65 {
    // private String make="LG"; interface can only have public fields
    // protected String make="LG"; interface can only have public fields

    // public static final String make="LG"; no need to write public static final because all the fields
    //by default are public static final
    //String make="Samsung"; //needs to be initialized

    void wash();

}
interface FiveG{
    void speed();
}
interface FastChargeAble{
    void charging();
}

class S21Ultra implements IP65, FastChargeAble, FiveG{

    @Override
    public void wash() {
        System.out.println("You guys can wash me easily ezi pizi no issues");
    }

    @Override
    public void charging() {
        System.out.println("I support fast charging now because I have implements this requirement as well");
    }

    @Override
    public void speed() {
        System.out.println("You can download things super fast because not I also support 5G");
    }

    public static void main(String[] args) {
        IP65 ip65=new S21Ultra();
        ip65.wash();
    }
}
