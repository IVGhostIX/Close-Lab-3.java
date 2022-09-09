//Problem Description: 
// Design a class named MyInteger. The class contains:  
// • An int data field named value that stores the int value 
// represented by this object. 
// • A constructor that creates a MyInteger object for the 
// specified int value. 
// • A get method that returns the int value. 
// • Methods isEven(), isOdd(), and isPrime() that return true if 
// the value is even, odd, or prime, respectively. 
// • Static methods isEven(int), isOdd(int), and isPrime(int) 
// that return true if the specified value is even, odd, or 
// prime, respectively. 
// • Static methods isEven(MyInteger), isOdd(MyInteger), and 
// isPrime(MyInteger) that return true if the specified value 
// is even, odd, or prime, respectively. 
// • Methods equals(int) and equals(MyInteger) that return true 
// if the value in the object is equal to the specified value. 
// • A static method parseInt(char[]) that converts an array of 
// numeric characters to an int value.  
// • A static method parseInt(String) that converts a string into 
// an int value.  
 
// Draw the UML diagram for the class. Implement the class. 
// Write a client program that tests all methods in the class.
/**
 *
 * @author brandonmcbride
 */
public class CloseLab3 {

public static void main(String[] args) {
    MyInteger n1 = new MyInteger(5);
    System.out.println("n1 is even? " + n1.isEven());
    System.out.println("n1 is prime? " + n1.isPrime());
    System.out.println("15 is prime? " + MyInteger.isPrime(15));

    char[] chars = {'3', '5', '3', '9'};
    System.out.println(MyInteger.parseInt(chars));

    String s = "3539";
    System.out.println(MyInteger.parseInt(s));
    
    MyInteger n2 = new MyInteger(24);
    System.out.println("n2 is odd? " + n2.isOdd());
    System.out.println("45 is odd? " + MyInteger.isOdd(45));
    System.out.println("n1 is equal to n2? " + n1.equals(n2));
    System.out.println("n1 is equal to 5? " + n1.equals(5));
  }
}

// /**
//  * ********UML Class Diagram********
//  * 
// -int value
// ---------------------------------
// + Mylnteger(int value)
// + int getValue()
// + boolean isPrime
// + boolean isEven
// + boolean isOdd
// + static boolean isEven(int data)
// + static boolean sOdd(int data)
// + static boolean isPrime(int data)
// + static boolean isEven(Mylntegeri)
// + static boolean isOdd(Mylnteger i)
// + static boolean isPrime(Mylnteger mi
// + boolean equals(int data)
// + boolean equals(Mylnteger mi)
// + static int parselnt(String s)
//  */

class MyInteger {
  private int value;

  public int getValue() {
    return value;
  }

  public MyInteger(int value) {
    this.value = value;
  }

  public boolean isPrime() {
    return isPrime(value);
  }

  public static boolean isPrime(int num) {	
    if ((num == 1) || (num == 2)) {
      return true;
    }

    for (int i = 2; i <= num / 2; i++) {
      if (num % i == 0) {
        return false;
      }
    }

    return true;
  }

  public static boolean isPrime(MyInteger o) {
    return isPrime(o.getValue());
  }

  public boolean isEven() {
    return isEven(value);
  }
  
  public boolean isOdd() {
	return isOdd(value); 
  }
  
  public static boolean isEven(int n) {
    return n % 2 == 0;
  }
  
  public static boolean isOdd(int n) {
	return n % 2 != 0;
  }

  public static boolean isEven(MyInteger n) {
    return isEven(n.getValue());
  }

  public boolean equals(int anotherNum) {
    return value == anotherNum;
  }

  public boolean equals(MyInteger o) {
    return value == o.getValue();
  }

  public static int parseInt(char[] numbers) {
   

    int result = 0;
    for (int i = 0; i < numbers.length; i++) {
      result = result * 10 + (numbers[i] - '0');
    }

    return result;
  }

  public static int parseInt(String s) {
    
    int result = 0;
    for (int i = 0; i < s.length(); i++) {
      result = result * 10 + (s.charAt(i) - '0');
    }

    return result;
  }
}