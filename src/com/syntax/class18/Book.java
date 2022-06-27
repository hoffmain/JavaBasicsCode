package com.syntax.class18;

public class Book {
    /*
    Write Book class that will have instance variables and 2 Constructors. While creating an object make sure:
    Instance variables are being initialized
    Both Constructors are being executed
     */

    String bookName;
    String author;
    int pages;

    void bookInfo(String bookName, String author){
        this.bookName=bookName;
        this.author=author;
        System.out.println("Book "+bookName+" Author "+author);
    }

    public void bookInfo(String bookName, String author, int pages){
        this.bookName=bookName;
        this.author=author;
        this.pages=pages;
        System.out.println("Book "+bookName+" Author "+author+" Page Number "+pages);
    }

    public static void main(String[] args) {
        Book book1=new Book();
        book1.bookInfo("How to Eat an Hamburger", "Roland Schitte");
        Book book2=new Book();
        book2.bookInfo("Yada Yada Yada", "Jerry Seinfeld", 108);
    }

}
