package org.example;

public class Calculator {

    // Méthode pour additionner deux entiers
    public int addi(int a, int b) {
        return a + b;
    }

    // Méthode pour soustraire deux entiers
    public int sous(int a, int b) {
        return a - b;
    }

    // Méthode pour multiplier deux entiers
    public int multi(int a, int b) {
        return a * b;
    }

    // Méthode pour diviser deux entiers
    public int div(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("La division par zéro n'est pas autorisée.");
        }
        return a / b;
    }
}
