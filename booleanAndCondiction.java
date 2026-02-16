/*
Boolean => evaluate true and false (binary-based) 

conditional statements => tells the program to run or skip. Java has an if statement:

if(put boolean expression here){
  [block of code] 
}
boolean expression then will be read by compilers 
and decide to run or not run the block of code

basic comparison operators: 
&& and 
|| or 
==  equal
!= not equal
>= greater than or equal to 
<= less than or equal 


*/

import java.util.Scanner;
public class booleanAndCondition{
  public static void main(String[] args){
    Scanner userInput = new Scanner(System.in);
        System.out.println("Please enter an integer: ");

        int userInteger = userInput.nextInt();

        if(userInteger % 2 ==0){
            System.out.println("hey you got an even number"+ userInteger);
        } else if (userInteger % 2 == 1) {
            System.out.println("hey you got an odd number" + userInteger);
        }
        else {
            System.out.println("It seems like your number neither is even nor odd");
        }

    if(userInteger % 5 == 0 && userInteger > 0){
            System.out.println("Your number is a positive multiple of 5");
        }
  }
}
