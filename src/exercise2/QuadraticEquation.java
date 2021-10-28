package exercise2;

import java.util.Scanner;

public class QuadraticEquation {

public static void main(String args[]){
   Scanner input = new Scanner(System.in);
  
  int a = input.nextInt();
  int b = input.nextInt();
  int c = input.nextInt();

  double x;
  double x1;
  double x2;
  double D = b*b -(4*a*c);

     if (a != 0){
        if (D >= 0){
          x1 = (-b + Math.sqrt(D))/ 2*a;
          x2 = (-b - Math.sqrt(D))/ 2*a;

          System.out.println(x1);
          System.out.println(x2);
            } else {
           System.out.println("Imaginary values");
            }
            }else{
               if (b !=0 ) {
               x = (0 - c) /b ;
               System.out.println(x);
              } else {
                if(c !=0 ) {
                  System.out.println("No values");
                } else{
                  System.out.println("Many values");
                }
        }
      }
    }

  }