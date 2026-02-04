import java.util.Scanner;
public class Main { //Name of the class must be the name of the file!!!
    public static void main(String[] args){

//        System.out.print("Hi, ");
//        System.out.print(args[0]);
//        System.out.println(". How are you?");

        Scanner keyboard = new Scanner(System.in);
        //ask the user for their name

        System.out.println("what's your name: ");
        keyboard.next(); // tell the user to type

        //make a variable to store input
        String name = keyboard.next();
        System.out.println("Hi, " + name);
        System.out.println("nice to meet you " + name);

    }
}
