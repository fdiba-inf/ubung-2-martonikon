package exercise2;

import java.util.Scanner;

public class SumOfDigits {

  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
  
    int number = input.nextInt();
    int a = number /100 ;
    int b = (number /10)%10 ;
    int c = number %10 ;
    int sum = a + b + c;
  
    System.out.println("Sum of digits: "+ sum );
  }
}
