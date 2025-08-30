package SuperKeyword;
// SUPER = refers to parent class.
// used in constructors and method overriding.
// calls the parent constructor to initialize attributes.

class Person{
    String first;
    String last;
    Person(String first, String last){
        this.first = first;
        this.last = last;
    }
    void showName(){
        System.out.println(this.first + " " + this.last);
    }
}

class Student extends Person{
    String middle;
    double gpa;
    Student(String first, String middle, String last, double gpa) {
        super(first, last);
        this.middle = middle;
        this.gpa = gpa;
    }
    void showGPA(){
        System.out.println(this.first +" "+ this.middle + " " + this.last +"'s gpa is: " + this.gpa);
    }
}

class Employee extends Person{
    int salary;
    Employee(String first, String last, int salary){
        super(first, last);
        this.salary = salary;
    }
    void showSalary(){
        System.out.println(this.first +"'s salary is $" + this.salary);
    }
}

public class Main {
    public static void main(String[] args){

        Person person = new Person("Leo", "Aandrew");
        Student student = new Student("Monkey", "D", "Luffy", 9.99);
        Employee employee = new Employee("Zoro", "Zoro", 50000);

        person.showName();
        student.showGPA();
        employee.showSalary();
    }
}
