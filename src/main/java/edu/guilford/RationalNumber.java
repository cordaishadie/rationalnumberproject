package edu.guilford;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class RationalNumber 
{
    public static void main( String[] args )
    {
        // create a scanner object
        Scanner scan = new Scanner(System.in);
        
        // create a Rational object
        Rational r = new Rational();
        // print the Rational number using the toString method
        System.out.println("The Rational number r is: " + r.toString());

        // create a Rational object using the constructor that takes two arguments
        Rational r2 = new Rational(3, 4);
        // print the Rational number using the toString method
        System.out.println("The Rational number r2 is: " + r2.toString());
        
        // negate the Rational number using the negate method
        r2.negate();
        // print the negated Rational number using the toString method
        System.out.println("Ater negation, r2 becomes: " + r2.toString());
        
        // invert the Rational number using the invert method
        r2.invert();
        // print the inverted Rational number using the toString method
        System.out.println("After inversion, r2 becomes: " + r2.toString());
       
        // convert the Rational number to a double using the toDouble method and print it
        System.out.println("r2 as a double is: " + r2.toDouble());

        
        // explain to the user that they will now add fractions
        System.out.println("Now you will add fractions. You will be prompted to enter a numerator and a denominator for each fraction.");
        // prompt the user to enter a numerator
        System.out.print("Enter a numerator for the first fraction: ");
        // read the numerator from the user
        int numerator = scan.nextInt();
        // prompt the user to enter a denominator
        System.out.print("Enter a denominator for the first fraction: ");
        // read the denominator from the user
        int denominator = scan.nextInt();        
        // create a Rational object using the constructor that takes two arguments
        Rational r3 = new Rational(numerator, denominator);
        
        // prompt the user to enter a numerator
        System.out.print("Enter a numerator for the second fraction: ");
        // read the numerator from the user
        numerator = scan.nextInt();
        // prompt the user to enter a denominator
        System.out.print("Enter a denominator for the second fraction: ");
        // read the denominator from the user
        denominator = scan.nextInt();
        // create another Rational object using the constructor that takes two arguments
        Rational r4 = new Rational(numerator, denominator);

        // add the two Rational numbers using the add method and print the result
        System.out.println("The sum of " + r3.toString() + " and " + r4.toString() + " is " + r3.add(r4).toString());

        // add r2 to r3 using the add method and print the result
        System.out.println("The sum of " + r2.toString() + " and " + r3.toString() + " is " + r2.add(r3).toString());

    }
}
