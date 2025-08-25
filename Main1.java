public class Main1 {
    public static void main(String[] args){
// HERE I PRACTICED ON :
/*
       DATATYPES, SCANNER CLASS, OPERATORS, ++ & -- , PEMDAS, IF, ELSE IF , ELSE,
       RANDOM METHODS, MATH METHODS & CONSTANTS, FORMAT SPECIFIERS, NESTED IF , STRING METHODS,
       SUBSTRING METHOD, TERNARY OPERATOR, ENHANCED SWITCH CASE, LOGICAL OPERATOR
*/
//-----------------------------------------------------------------------------------------
// VALID USERNAME FOR NOT (USING LOGICAL OPERATOR):
//        Scanner sc = new Scanner(System.in);
//
//        String name;
//
//        System.out.print("Enter your username: ");
//        name = sc.nextLine();
//
//        if(name.length() < 4 || name.length() >12){
//            System.out.println("Username must b/w 4-12 characters");
//        }
//        else if(name.contains(" ") || name.contains("_")){
//            System.out.println("Username must not contains spaces or underscores");
//        }
//        else{
//            System.out.println(name);
//        }
//
//        sc.close();
//-----------------------------------------------------------------------------------------
// LOGICAL OPERATOR : (&&,||,!)
//        double temp = -10;
//        boolean isSunny = true;
//        if(temp <=30 && temp >=0 && isSunny){
//            System.out.println("Weather is good");
//            System.out.println("It is sunny");
//        }
//        else if(temp <=30 && temp >=0 && !isSunny){
//            System.out.println("Weather is good");
//            System.out.println("It is cloudy");
//        }
//        else if(temp > 30 || temp < 0){
//            System.out.println("Weather is bad");
//        }
//-----------------------------------------------------------------------------------------
// SIMPLE CALCULATOR :
//        Scanner sc = new Scanner(System.in);
//
//        double num1;
//        double num2;
//        char operator;
//        double result = 0;
//        boolean validOperation = true;
//
//        System.out.println("Simple Calculator: ");
//
//        System.out.print("Enter first number: ");
//        num1 = sc.nextDouble();
//
//        System.out.print("Enter the operator (+,-,*,/,^) :");
//        operator = sc.next().charAt(0);
//
//        System.out.print("Enter second number: ");
//        num2 = sc.nextDouble();
//
//        switch(operator){
//            case '+' -> result = num1 + num2;
//            case '-' -> result = num1 - num2;
//            case '*' -> result = num1 * num2;
//            case '/' -> {
//                if(num2 == 0){
//                    System.out.println("Can't divide by zero");
//                    validOperation = false;
//                }
//                else{
//                    result = num1 / num2;
//                }
//            }
//            case '^' -> result = Math.pow(num1,num2);
//            default -> {
//                System.out.println("Please enter a valid operator!");
//                validOperation = false;
//            }
//        }
//        if(validOperation) {
//            System.out.println(result);
//        }
//
//        sc.close();
//-----------------------------------------------------------------------------------------
// ENHANCED SWITCH CASE: (JAVA 14)
//        Scanner sc = new Scanner(System.in);
//
//        String day;
//
//        System.out.print("Enter the day of the week: ");
//        day = sc.nextLine().toUpperCase();
//
//        switch(day){
//            case "MONDAY","TUESDAY","WEDNESDAY","THURSDAY","FRIDAY" -> System.out.println("weekday");
//            case "SATURDAY","SUNDAY" -> {
//                System.out.println("weekend");
//                System.out.println("enjoy the leave!");
//            }
//            default -> System.out.printf("%s is not a day", day);
//        }
//        sc.close();
//-----------------------------------------------------------------------------------------
// TEMPERATURE PROBLEM (CELSIUS AND FAHRENHEIT):
//        Scanner sc = new Scanner(System.in);
//
//        double temp;
//        double newTemp;
//        String unit;
//
//        System.out.print("Enter the temperature: ");
//        temp = sc.nextDouble();
//
//        System.out.print("Convert to Celsius or Fahrenheit? (C or F): ");
//        unit = sc.next().toUpperCase();
//
//        newTemp = (unit.equals("C")) ? (temp-32)*5/9 : (temp*9/5)+32;
//
//        System.out.printf("%.2f°%s",newTemp, unit);
//
//        sc.close();
//-----------------------------------------------------------------------------------------
// TERNARY OPERATOR:
//        int num = 4;
//        String oddOrEven = (num%2 == 0) ? "EVEN" : "ODD";
//        System.out.println(oddOrEven);
//-----------------------------------------------------------------------------------------
// WEIGHT CONVERSION PROGRAM (lbs,kgs):
//        Scanner sc = new Scanner(System.in);
//
//        double weight;
//        double newWeight;
//        int choice;
//
//        System.out.println("Weight Conversion:");
//        System.out.println("1. kgs into lbs");
//        System.out.println("2. lbs into kgs");
//
//        System.out.print("Enter choice: ");
//        choice = sc.nextInt();
//
//        if(choice == 1){
//            System.out.print("Enter weight in (kgs): ");
//            weight = sc.nextDouble();
//            newWeight = weight * 2.20462262;
//            System.out.printf("The new weight in lbs is %.2f lbs", newWeight);
//        }
//        else if(choice == 2){
//            System.out.print("Enter weight in (lbs): ");
//            weight = sc.nextDouble();
//            newWeight = weight * 0.45359237;
//            System.out.printf("The new weight in kgs is %.2f kgs", newWeight);
//        }
//        else{
//            System.out.println("Enter a valid choice!");
//        }
//
//
//        sc.close();
//-----------------------------------------------------------------------------------------
// SUBSTRING METHOD: --> str.substring(start,end)
//        Scanner sc = new Scanner(System.in);
//
//        String email;
//        String username;
//        String domain;
//
//        System.out.print("Enter you email: ");
//        email = sc.nextLine();
//
//        if(email.contains("@")){
//            //        username = email.substring(0,3);
//            //        domain = email.substring(4);
//            username = email.substring(0,email.indexOf("@"));
//            domain = email.substring(email.indexOf("@")+1);
//
//            System.out.println(username);
//            System.out.println(domain);
//        }
//        else{
//            System.out.println("Emails must contains @ symbol");
//        }
//-----------------------------------------------------------------------------------------
// STRING METHODS:
//        String name = "Leo Aandrew";
//        String name1 = "     Leo Aandrew     ";
//        String name2 = "";
//        String password = "leo12345";
//
//        int length = name.length();
//        char letter = name.charAt(0);
//        int index = name.indexOf("e");
//        int lastIndex = name.lastIndexOf("e");
//        String upper = name.toUpperCase();
//        String lower = name.toLowerCase();
//
//        name1 = name1.trim();
//        name1 = name1.replace("o","a");
//
//
//
//        System.out.println(length);
//        System.out.println(letter);
//        System.out.println(index);
//        System.out.println(lastIndex);
//        System.out.println(upper);
//        System.out.println(lower);
//        System.out.println(name1);
//
//        if(name2.isEmpty()){
//            System.out.println("Your name is empty");
//        }
//        else{
//            System.out.println("Hello " + name2);
//        }
//
//        if(name.contains(" ")){
//            System.out.println("Your name contains a space");
//        }
//        else{
//            System.out.println("Your name doesn't contains a space");
//        }
//
//        if(password.equals("leo12345")){
//            System.out.println("Valid password");
//        }
//        else{
//            System.out.println("Not a Valid password");
//        }
//-----------------------------------------------------------------------------------------
// NESTED IF STATEMENTS:
//        boolean isStudent = true;
//        boolean isSenior = true;
//        double price = 100.00;
//
//        System.out.printf("The original amount is %.2f\n", price);
//
//        if(isStudent){
//            if(isSenior){
//                System.out.println("30% discount");
//                price *= 0.7;
//            }
//            else{
//                System.out.println("10% discount");
//                price *= 0.9;
//            }
//        }
//        else {
//            if(isSenior){
//                System.out.println("20% discount");
//                price *= 0.8;
//            }
//            else{
//                System.out.println("No discount");
//                price *= 1;
//            }
//
//        }
//
//
//        System.out.printf("The amount to pay is %.2f", price);
//-----------------------------------------------------------------------------------------
// COMPOUND INTEREST:
//        Scanner sc = new Scanner(System.in);
//
//        double principle;
//        double rate;
//        double years;
//        double amount;
//        double compoundInterest;
//
//        System.out.print("Enter principle amount: ");
//        principle = sc.nextDouble();
//
//        System.out.print("Enter rate of interest: ");
//        rate = sc.nextDouble();
//
//        System.out.print("Enter number of years: ");
//        years = sc.nextDouble();
//
//        amount = principle * Math.pow((1+(rate/100)),years);
//        compoundInterest = amount - principle;
//        System.out.printf("Compound Interest is = %.2f\n", compoundInterest);
//        System.out.printf("Total amount is = %.2f\n", amount);
//-----------------------------------------------------------------------------------------
// FORMAT SPECIFIERS (%s,%d,%f,%c,%b)(printf):
//        String name = "Leo";
//        char firstLetter = 'L';
//        int age = 21;
//        double height = 60.5;
//        boolean isEmployed = true;
//
//        System.out.printf("Hello %s\n", name);
//        System.out.printf("First name starts with %c\n", firstLetter);
//        System.out.printf("You are %d years old\n", age);
//        System.out.printf("You are %.1f inches tall\n", height);
//        System.out.printf("Employed: %b\n", isEmployed);
//
//        System.out.printf("%s is %d years old", name, age);
//-----------------------------------------------------------------------------------------
// CIRCLE (CIRCUMFERENCE, AREA, VOLUME):
//        Scanner sc = new Scanner(System.in);
//
//        double radius;
//        double circumference;
//        double area;
//        double volume;
//
//        System.out.print("Enter the radius: ");
//        radius = sc.nextDouble();
//
//        circumference = 2 * Math.PI * radius;
//        area = Math.PI * Math.pow(radius,2);
//        volume = (3.0/4.0) * Math.PI * Math.pow(radius,3);
//
//        System.out.printf("Circumference of a Cirle: %.1fcm\n", circumference);
//        System.out.printf("Area of a Cirle: %.1fcm²\n", area);
//        System.out.printf("Volume of a Cirle: %.1fcm³", volume);
//
//
//        sc.close();
//------------------------------------------------------------------------------------------
// HYPOTHENUSE c=Math.sqrt(a² + b²)
//        Scanner sc = new Scanner(System.in);
//
//        double a;
//        double b;
//        double c;
//
//        System.out.print("Enter the Adjacent length (a): ");
//        a = sc.nextDouble();
//
//        System.out.print("Enter the Opposite length (b): ");
//        b = sc.nextDouble();
//
//        c = Math.sqrt(Math.pow(a,2) + Math.pow(b,2));
//
//        System.out.println("Hypotenuse is " + c + "cm");
//------------------------------------------------------------------------------------------
//  MATH METHODS AND CONSTANTS:
//        System.out.println(Math.PI);
//        System.out.println(Math.E);
//
//        double result;
//
//        result = Math.pow(2,3); //8.0
//        result = Math.abs(-5.6); //5.6
//        result = Math.sqrt(9); //3.0
//        result = Math.round(3.14); //3.0
//        result = Math.ceil(3.14); //4.0
//        result = Math.floor(3.99); //3.0
//        result = Math.max(5, 10); //10.0
//        result = Math.min(5,10); //5.0
//        result = Math.random(); // 0 - 1
//        result = (int)(Math.random() * 100); // (int)-> typeCast double into integer. (*100)-> generates random number between 1-99
//        System.out.println(result);
//------------------------------------------------------------------------------------------
// RANDOM METHOD: (INT, DOUBLE, BOOLEAN)
// import java.util.Random;
//        Random random = new Random();
//
//        int num1;
//        int num2;
//        double num3;
//        boolean isHeads;
//
//        num1 = random.nextInt(); // print + or - number
//        num2 = random.nextInt(1, 7); // range b/w 1 - 7 but excludes 7
//        num3 = random.nextDouble(); // range b/w 0 - 1
//        isHeads = random.nextBoolean(); // true or false
//
//        System.out.println(num1);
//        System.out.println(num2);
//        System.out.println(num3);
//        if(isHeads){
//            System.out.println("Heads");
//        }
//        else{
//            System.out.println("Tails");
//        }
//------------------------------------------------------------------------------------------
// IF - ELSE IF - ELSE (AGE PROBLEM):
//        Scanner sc = new Scanner(System.in);
//
//        String name;
//        int age;
//        boolean isStudent;
//
//        System.out.print("Enter your name: ");
//        name = sc.nextLine();
//
//        System.out.print("Enter your age: ");
//        age = sc.nextInt();
//
//        System.out.print("Are you a student (true/false)? ");
//        isStudent = sc.nextBoolean();
//
//        // GROUP 1 (NAME)
//        if(name.isEmpty()){
//            System.out.println("You didn't enter your name!");
//        }
//        else{
//            System.out.println("Hello " + name + "!");
//        }
//
//        // GROUP 2 (AGE)
//        if(age >= 65){
//            System.out.println("You are a senior!");
//        }
//        else if(age >=18){
//            System.out.println("You are an adult!");
//        }
//        else if(age < 0){
//            System.out.println("You haven't born yet!");
//        }
//        else if(age == 0){
//            System.out.println("You are a baby!");
//        }
//        else{
//            System.out.println("You are a child!");
//        }
//
//        //GROUP 3 (isStudent)
//        if(isStudent){
//            System.out.println("You are a student!");
//        }
//        else{
//            System.out.println("You are not a student!");
//        }
//------------------------------------------------------------------------------------------
// SHOPPING CART PROGRAM
//        String item;
//        double price;
//        int count;
//        double total;
//
//        Scanner sc = new Scanner(System.in);
//
//        System.out.print("What item would you like to buy?: ");
//        item = sc.nextLine();
//
//        System.out.print("What is the price for each?: ");
//        price = sc.nextDouble();
//
//        System.out.print("How many would you like?: ");
//        count = sc.nextInt();
//
//        total = price * count;
//
//        System.out.println("\nYou have bought " + count + " " + item + "/s.");
//        System.out.println("Your total is $" + total);
//
//        sc.close();
//------------------------------------------------------------------------------------------
//ORDER OF OPERATORS [PEMDAS]:
//        double result = 3 + 4 * (7-5) / 2.0;
//        System.out.println(result);
//------------------------------------------------------------------------------------------
// INCREMENT AND DECREMENT OPERATORS:
//        int x = 1;
//
//        x++;
//        x--;
//        ++x;
//        --x;
//
//        System.out.println(x);
//------------------------------------------------------------------------------------------
// OPERATORS
//        int x = 10;
//        int y = 2;
//        int z;
//
//        z= x + y;
//        z= x - y;
//        z= x * y;
//        z= x / y;
//        z= x % y;
//
//        System.out.println(z);
//------------------------------------------------------------------------------------------
//AREA OF RECTANGLE
//        double width = 0;
//        double height = 0;
//        double area = 0;
//
//        Scanner sc = new Scanner(System.in);
//
//        System.out.print("Enter width: ");
//        width = sc.nextDouble();
//
//        System.out.print("Enter height: ");
//        height = sc.nextDouble();
//
//        area = width * height;
//
//        System.out.println("Area of rectangle: " + area + " cm^2");
//---------------------------------------------------------------------------------------
//SCANNER CLASS
//import java.util.Scanner;
//        Scanner sc = new Scanner(System.in);
//
//        System.out.print("Enter your age: ");
//        int age = sc.nextInt();
//        sc.nextLine();
//
//        System.out.print("Enter your name: ");
//        String name = sc.nextLine();
//
//        System.out.println("Name: "+ name +"\nAge: "+ age);
//
//        sc.close();
//-------------------------------------------------------------------------------------------
// DATA TYPES (PRIMITIVE, REFERENCE): (INT, DOUBLE, CHAR, BOOLEAN - STRING, ARRAY, OBJECT):
//        int age = 21;
//        double price = 99.99;
//        char dollar = '$';
//        boolean isStudent = true;
//        String name = "leo";
//
//
//        System.out.println("The price is "+ dollar + price);
//        System.out.println(isStudent);
//        System.out.println("Hi everyone, My name is " + name + " and I am " + age + " years old.");
//
//        if(isStudent){
//            System.out.println("You are a student");
//        }
//        else {
//            System.out.println("You are not a student");
//        }


    }
}
