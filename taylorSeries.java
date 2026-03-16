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
        double sum = 0;
        
        System.out.println("Type the values of x in degrees: "); 
        double y = input.nextInt(); 
        y = Math.toRadians(y);

        double termSin = x;
        double sumSin = 0;

        double termCos = 1;
        double sumCos = 0;
        //System.out.println("how many terms your want ?");
        //int numOfTerm = input.nextInt();

        // System.out.println("The theoretical value is " + Math.exp(x));

        int n ;
        for (n = 0; (sum + term) != sum; n++) { //approximate e to the power of x
            sum += term;
            term *= x / (n + 1);
        }
        
        for (n = 1; (sumSin + termSin) != sumSin; n=n+2) { //approximate sinx
            sumSin += termSin;
            termSin *= -x*x/((n+1.0)*(n+2.0));
        }
        for(n = 0; (sumCos + termCos) != sumCos; n=n+2){ //approximate cosx 
            sumCos += termCos;
            termCos *=  -x*x/((n+1.0)*(n+2.0));
        }

        System.out.println("sin("+x+") is about: " + sumSin);
        System.out.println("cos("+x+") is about: " + sumCos);
        
        System.out.println("The calculated values using Taylor series: "+sum);
        System.out.println("The number of term " + (n+1));
        
        
    }

}
