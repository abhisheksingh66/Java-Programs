package com.company;

class Librarie{
    int no_of_books;
    String[] book;
    Librarie(){
        this.no_of_books=0;
        this.book=new String[100];
    }

    void addBook(String book){
        this.book[no_of_books]=book;
        no_of_books++;
        System.out.println(book + " book has been addded");
    }

    void showBook(){
        System.out.println("Available Books are : ");

        for (String book :this.book ){

            if(book == null){
                break;
            }
            System.out.println(" * " + book);
        }
    }
}



public class Libraray {
    public static void main(String[] args) {
        Librarie l1=new Librarie();
        l1.addBook("Go To Hell !");
        l1.addBook("Coding !");
        l1.addBook("Java Book !");
        l1.addBook("Dsa Book !");
        l1.showBook();
    }
}
