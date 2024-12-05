class NoteBook {
    int pages;
    double price;
    String brand;
    String size;
}

public class code7 {
    public static void main(String[] args) {
        System.out.println("Main method Started !");

        NoteBook myNoteBook = new NoteBook();
        myNoteBook.pages = 300;
        myNoteBook.brand = "Classmate";
        myNoteBook.price = 340.18;
        myNoteBook.size = "A4-size.20.";

        System.out.println("NoteBook brand is : " + myNoteBook.brand);
        System.out.println("NoteBook page is : " + myNoteBook.pages);
        System.out.println("NoteBook price is : " + myNoteBook.price);
        System.out.println("NoteBook size is : " + myNoteBook.size);
        System.out.println("Main method Ended !");
    }
}
