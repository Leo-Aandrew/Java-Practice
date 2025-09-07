package Generics;

// Generics = A concept where you can write a class, interface, or method that is compatible with different data types.
//            <T> type parameter (placeholder that gets replaced with a real type).
//            <String> type argument (specifies the type).

class Product<T, U>{
    T item;
    U price;

    Product(T item, U price){
        this.item = item;
        this.price = price;
    }

    public T getItem(){
        return this.item;
    }

    public U getPrice(){
        return this.price;
    }
}

public class Main {
    public static void main(String[] args){

        Product<String, Double> product1 = new Product<>("Apple", 50.60);
        Product<String, Double> product2 = new Product<>("Ticket", 230.60);

        System.out.println(product1.getItem());
        System.out.println(product1.getPrice());

        System.out.println(product2.getItem());
        System.out.println(product2.getPrice());
    }
}
