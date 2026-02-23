import java.util.Scanner;
/*LEARNING ABOUT LOOPS - SHYAM KURUP*/
public class learningLoops {
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);

        //prompt the user for a positive integer:
        System.out.println("How many integers you want to take the average: ");
        int userInt = keyboard.nextInt();

        int runningSum = 0;
        int sum;
        int counter = 1;
        while(counter <= userInt){
            System.out.println("Enter next integer: ");

            int nextNumber = keyboard.nextInt();
            runningSum += nextNumber;

            counter++;

        }

        //casting
        double average = (double) runningSum/userInt;

        System.out.printf("The mean of your number list is  %.2f" , average);



//        int currentNumber = userInt;
//
//        while (currentNumber>=0){
//            System.out.println(currentNumber);
//            currentNumber--; //shortest and most concise
//        }


    }
}
