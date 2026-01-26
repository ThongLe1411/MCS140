/**
 * LESSON 1: INTRO TO THE JAVA LANGUAGE
 * course objective:
 * - have the idea of a computer
 * - A program is a series of instruction that tell the computer
 * what to do
 * 
 * we will learn Java programming language, multiple purpose, high level, which feels like nature language (Eng + math)
 * 
 * - cross-platfrom language 
 * 
 * We write "sourced code", this is stored in a .java file 
 * 
 * This code is then "compiled" by a separate program (a Java compiler)
 * - 1. check for error, ensures the code is proper, "valid" Java code.
 * - 2. translate to a lower-level, virtual machine language (similar to an actual machine language, 
 * but run on a special Java program). The Virtual code is stored in a .class file (byte code).
 * 
 * That file then is run on the virtual machine, which interprets it into the actual machine language
 * 
 * -3. Optimizes the code. It strips away unnecessary portions that are just for us humans can also rearrange
 * or replace to make the code more efficient. 
 * 
 * Integrated Development Environment (IDE)
 * 
Java names must be valid identifiers for classes, variables, and methods
Valid identifier can only contain: letters, digits, $, and _
Java is case-sensitive (upper != lowercase)
Cannot start with Digits

First letter in the file is capitalized !
Java reversed/ keywords cannot be used as identifiers 

Inside the class, we have the main method (every java program has) to be runnable/ executable
 */
public class FirstProgram {
    //the class name should match up with the program's name
    public static void main(String[] args) {
        //Prints "Hello, World" out in the terminal
        System.out.println("Hello, World!");
        System.out.println("Goodbye world");
    }

}

