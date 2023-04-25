package edu.guilford;

public class Rational {
    
    // attributes
    private int numerator;
    private int denominator;

    // constructors
    // constructor that takes no arguments and generates random values for the attributes between -100 and 100
    public Rational() {
        numerator = (int)(Math.random() * 201) - 100;
        denominator = (int)(Math.random() * 201) - 100;
        // if the denominator is 0, select a new random value for the denominator
        if (denominator == 0) {
            this.denominator = (int)(Math.random() * 201) - 100;
        }
        else {
            this.denominator = denominator;
        }
    }

    // constructor that takes two arguments and uses them to initialize the attributes
    public Rational(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
        // prints a warning if the denominator is 0
        if (denominator == 0) {
            System.out.println("Warning! Denominator is zero!");
        }
    }

    // methods
    // getters and setters
    // getter for numerator
    public int getNumerator() {
        return numerator;
    }
    // setter for numerator
    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }
    // getter for denominator
    public int getDenominator() {
        return denominator;
    }
    // setter for denominator
    public void setDenominator(int denominator) {
        this.denominator = denominator;
    }

    // toString method that returns a string representation of the rational number
    public String toString() {
        return numerator + "/" + denominator;
    }

    // method that reverses the sign of the rational number by  
    // this method returns void because it does not return a new value, it just modifies the existing Rational object
    public void negate() {
        numerator = -numerator;
    }

    // method that reverses the rational number by swapping the numerator and denominator
    // and keeps the sign of the rational number in the numerator
    // this method returns void because it does not return a new value, it just modifies the existing Rational object
    public void invert() {
        int temp = numerator;
        numerator = denominator;
        denominator = temp;
    }

    // method that converts the rational number to a double
    public double toDouble() {
        return (double)numerator / denominator;
    }

    // method that simplifies the rational number by dividing the numerator and denominator by their greatest common divisor
    // find the greatest common divisor of two numbers using Euclid's algorithm
    public int gcd(int a, int b) {
        // base case
        if (b == 0) {
            return a;
        }
        // recursive case
        else {
            return gcd(b, a % b);
        }
    }
    // divide the numerator and denominator by their greatest common divisor
    public void reduce() {
        int gcd = gcd(numerator, denominator);
        numerator = numerator / gcd;
        denominator = denominator / gcd;
    }

    // method that takes a Rational number as an argument, adds it to the rational number represented 
    // by the current object, and returns a new Rational object
    public Rational add(Rational r) {
        // deterimine if the denominators are the same
        if (denominator == r.getDenominator()) {
            // if the denominators are the same, add the numerators and return a new Rational object
            return new Rational(numerator + r.getNumerator(), denominator);
        }
        else {
            // multiple the denominators together to get the common denominator
            int commonDenominator = denominator * r.getDenominator();
            // divide the common denominator by the denominator of the current object to get the multiplier for the numerator
            int multiplier1 = commonDenominator / denominator;
            // multiply the numerator of the current object by the multiplier
            int newNumerator1 = numerator * multiplier1;
            // divide the common denominator by the denominator of the Rational object passed as an argument to get the multiplier for the numerator
            int multiplier2 = commonDenominator / r.getDenominator();
            // multiply the numerator of the Rational object passed as an argument by the multiplier
            int newNumerator2 = r.getNumerator() * multiplier2;
            // add the numerators 
            int newNumerator = newNumerator1 + newNumerator2;
            // reduce the new Rational number
            Rational newRational = new Rational(newNumerator, commonDenominator);
            newRational.reduce();
            return newRational;
        }
    }
        
}
  


