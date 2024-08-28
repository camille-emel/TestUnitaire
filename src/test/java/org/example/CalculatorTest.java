package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

class CalculatorTest {
    Calculator calc = new Calculator();

    @Test
    public void troisplusquatre() {
        assertEquals(7, calc.addi(3,4));
    }
    @Test
    public void troismoinquatre() {
        assertEquals(-1, calc.sous(3, 4));
    }
    @Test
    public void troisfoisquatre() {
        assertEquals(12, calc.multi(3, 4));
    }
    @Test
    public void tropgroschiffre() {
        assertEquals(88891142400, calc.multi(8989800, 9888));
    }
    @Test
    public void quizediviserpartrois() {
        assertEquals(5, calc.div(15, 3));
    }
    @Test
    public void troisdiviserparzero() {
        ArithmeticException thrown = assertThrows(ArithmeticException.class, () -> calc.div(3, 0));
        assertEquals("La division par zéro n'est pas autorisée.", thrown.getMessage());
    }
}