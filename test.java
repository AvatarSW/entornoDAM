package cacular;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

class CalculadoraServiceTest {

    private final CalculadoraService service = new CalculadoraService();

    @Test
    @DisplayName("Suma básica de dos números")
    void testSuma() {
        assertEquals(5.0, service.calcular("2+3"), "2 + 3 debería ser 5");
    }

    @Test
    @DisplayName("Resta y multiplicación con caracteres personalizados")
    void testOperacionesCompuestas() {
        // Probamos que el reemplazo de 'x' por '*' funciona
        assertEquals(10.0, service.calcular("15-5"), "15 - 5 debería ser 10");
        assertEquals(12.0, service.calcular("3x4"), "3 x 4 debería ser 12");
    }

    @Test
    @DisplayName("División y manejo de decimales")
    void testDivision() {
        // Probamos que el reemplazo de '÷' por '/' funciona
        assertEquals(2.5, service.calcular("5÷2"), "5 ÷ 2 debería ser 2.5");
    }

    @Test
    @DisplayName("Error ante expresión mal formada")
    void testExpresionInvalida() {
        assertThrows(IllegalArgumentException.class, () -> {
            service.calcular("5++2");
        }, "Debería lanzar excepción ante sintaxis incorrecta");
    }

    @Test
    @DisplayName("Manejo de strings vacíos")
    void testVacio() {
        assertEquals(0, service.calcular(""), "Un string vacío debería devolver 0");
    }
}
