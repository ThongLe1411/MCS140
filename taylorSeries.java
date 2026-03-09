import java.util.Scanner;
/*
TAYLOR SERIES MCS140
 */
public class taylorSeries{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("The power of e: ");
        double x = input.nextInt();
        double term = 1;
        //System.out.println("how many terms your want ?");
        //int numOfTerm = input.nextInt();

        System.out.println("The theoretical value is " + Math.exp(x));
        double sum = 0;
        int n ;
        for (n = 0; (sum + term) != sum; n++) {
            sum += term;
            term *= x / (n + 1);
        }
        System.out.println("The calculated values using Taylor series: "+sum);
        System.out.println("The number of term " + (n+1));
        
        
    }

}
