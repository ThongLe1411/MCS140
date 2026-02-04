import java.util.Scanner; 
/*
data types used for arithmetic
int-for storing integer values only (not decimal/fractional values) - 32 bits
int range: -2^31 to 2^31 - 1 

alternative for int but longer range: long 

double - for storing "floating-point" decimal (64 bits) => double is default when working with decimal values.
float - like double but has 32 bits

arithmetic:
2 different kinds of division: 
- integer division - but it truncates the decimal part, just keep the whole number
- decimal division 20/8.0

System.out.printf() command (rounding the a certain number of decimals)

double area = 19.34512312; 
System.out.printf("The area is %.2f", area ); //round the nearest hundredth (2 decimals)



*/
public class Arithmetic_anh_number{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in); 
    
    System.out.println("In what year were you born? ");
        //make an integer variable and read in the user's year
        int userBirthYear = input.nextInt();
        int userAge = 2026 - userBirthYear;
        System.out.println("So you are " + userAge + " years old");
  }


  
}
