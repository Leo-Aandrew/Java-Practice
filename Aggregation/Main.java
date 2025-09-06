package Aggregation;

// AGGREGATION = "Has-A" relationship (weak)
// where one class contains a reference to another class, but both can (exist independently).
// here library object has a relationship with book object but both can exist independently ie. if we remove the Library class still the Book class exist.

class Book{
    String title;
    int pages;

    Book(String title, int pages){
        this.title = title;
        this.pages = pages;
    }

    String displayInfo(){
        return this.title + " (" + this.pages + " pages)";
    }

}

class Library{
    String name;
    int year;
    Book[] books;

    Library(String name, int year, Book[] books){
        this.name = name;
        this.year = year;
        this.books = books;
    }

    void displayInfo(){
        System.out.println("The " + this.year + " " + this.name);
        System.out.println("Books Available: ");
        for(Book book : books){
            System.out.println(book.displayInfo());
        }
    }


}

public class Main {
    public static void main(String[] args){
        Book book1 = new Book("Thirukural", 1330);
        Book book2 = new Book("The Lion King", 65);
        Book book3 = new Book("Ponniyin Selvan", 75);

        Book[] books = {book1, book2, book3};

        Library library = new Library("Dindigul Central Library", 1952, books);
        library.displayInfo();
    }
}
