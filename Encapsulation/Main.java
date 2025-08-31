package Encapsulation;

// ENCAPSULATION =  Bundling of data and methods together into a single unit called class.
// It restricts direct access to some of an object or data.
// Private access modifier (restricts direct access in main class).
// Public GETTER & SETTER method ( allow access to private data ).

class BankAccount{
    private String accountHolder;
    private int balance;

    public void setAccountHolder(String accountHolder){   // SETTER METHOD
        this.accountHolder = accountHolder;
    }

    public void setBalance(int balance){
        this.balance = balance;
    }

    public String getAccountHolder(){   // GETTER METHOD
        return accountHolder;
    }

    public int getBalance(){
        return balance;
    }
}

public class Main {
    public static void main(String[] args){
        BankAccount bank = new BankAccount();
/*
        bank.accountHolder = "Leo"; // This will output an error.
        bank.balance = 10000;       // Because we can't access the private attributes directly.
*/
        bank.setAccountHolder("Leo");   // SETTER
        bank.setBalance(10000);

        System.out.println("The account holder " + bank.getAccountHolder() + " has $" + bank.getBalance() + " in his account.");   // GETTER
    }
}
