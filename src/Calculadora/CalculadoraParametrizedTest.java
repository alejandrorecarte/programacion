package Calculadora;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculadoraParametrizedTest {

    @ParameterizedTest
    @CsvSource({"20,5,25.", "15,5,20", "8,7,15"})
    void sumar (int num1, int num2, int valorEsperado){
        Calculadora calcu = new Calculadora(num1, num2);
        int valorObtenido = calcu.sumar();
        assertEquals(valorEsperado, valorObtenido, 0);
    }
}
