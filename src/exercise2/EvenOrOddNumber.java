package exercise2;

import java.util.Scanner;

public class EvenOrOddNumber{

public static void main(String args[])
  {
    int num;
    System.out.println("Zahl");

    Scanner input = new Scanner(System.in);
    num = input.nextInt();

    if ( num % 2 == 0 )
        System.out.println("Number is even");
     else
        System.out.println("Number is odd");
  }
}