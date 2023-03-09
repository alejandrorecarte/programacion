package Calculadora;

import static org.junit.jupiter.api.Assertions.*;

class CalculadoraTest {

    @org.junit.jupiter.api.Test
    void sumar() {
        Calculadora calc = new Calculadora(3, 3);
        assertEquals(6, calc.sumar());
    }

    @org.junit.jupiter.api.Test
    void restar() {
        Calculadora calc = new Calculadora(3, 3);
        assertEquals(0, calc.restar());
    }

    @org.junit.jupiter.api.Test
    void multiplicar() {
        Calculadora calc = new Calculadora(3, 3);
        assertEquals(9, calc.multiplicar());
    }

    @org.junit.jupiter.api.Test
    void dividir() {
        Calculadora calc = new Calculadora(3, 3);
        assertEquals(1, calc.dividir());
        Calculadora calc2 = new Calculadora(3, 0);
        assertThrows(ArithmeticException.class, () -> calc2.dividir());
    }
}