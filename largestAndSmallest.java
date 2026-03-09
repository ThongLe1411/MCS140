import java.util.Scanner;

public class largestAndSmallest{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("How many elements you want in your array?");
        int n = input.nextInt();
        int[] values = new int[n];
        System.out.println("Now type in your array: ");
        for(int i = 0; i<n; i++){
            System.out.print("Type element " + (i+1) + " : ");
            values[i] = input.nextInt();
            System.out.println();
        }
        //Displaying all the element of the array
        for(int j = 0; j < n; j++){
            System.out.print(values[j] + " ");
        }
        //find the largest element in the array
        int largestNum = values[0];
        int smallestNum = values[0];
        for(int a = 1; a<n ; a++){
            if(values[a] > largestNum){
                largestNum = values[a];
            }
            if(values[a] < smallestNum){
                smallestNum = values[a];
            }
        }
        System.out.println();
        System.out.println("the largest number in the array is " + largestNum);
        System.out.println("the smallest number in the array is " + smallestNum);

    }
}
