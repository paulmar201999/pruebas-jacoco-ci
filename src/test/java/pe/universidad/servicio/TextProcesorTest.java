package pe.universidad.servicio;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TextProcesorTest {

    TextProcesor processor = new TextProcesor();

    @Test
    void testTextoValido() {
        String result = processor.process(" hola ");
        assertEquals("ALOH", result);
    }
        
/*
    @Test
    void testTextoNulo() {
        Exception ex = assertThrows(IllegalArgumentException.class,
                () -> processor.process(null));
        assertEquals("El texto no puede ser nulo", ex.getMessage());
    }
         */
/*
    @Test
    void testTextoVacio() {
        Exception ex = assertThrows(IllegalArgumentException.class,
                () -> processor.process(""));
        assertEquals("El texto no puede estar vacío", ex.getMessage());
    }
         */
/*
    @Test
    void testTextoSoloEspacios() {
        Exception ex = assertThrows(IllegalArgumentException.class,
                () -> processor.process("     "));
        assertEquals("El texto no puede estar vacío", ex.getMessage());
    }
         */
/*
    @Test
    void testTextoExcedeLongitud() {
        String largo = "a".repeat(1001);
        Exception ex = assertThrows(IllegalArgumentException.class,
                () -> processor.process(largo));
        assertEquals("El texto excede el límite de 1000 caracteres", ex.getMessage());
    }
         */
/*
    @Test
    void testTextoNormalSinEspacios() {
        String result = processor.process("PaulLaz");
        assertEquals("ZALLUAP", result);
    }
         */
}