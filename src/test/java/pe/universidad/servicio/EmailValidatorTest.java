package pe.universidad.servicio;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class EmailValidatorTest {

    EmailValidator validator = new EmailValidator();

    @Test
    void testEmailValido() {
        assertTrue(validator.isValid("paul@gmail.com"));
    }
         
/*
    @Test
    void testEmailSinArroba() {
        assertFalse(validator.isValid("paulgmail.com"));
    }
         */
/*
    @Test
    void testEmailSinPunto() {
        assertFalse(validator.isValid("correo@dominio"));
    }
         */
/*
    @Test
    void testEmailConEspacioInicio() {
        assertFalse(validator.isValid(" correo@gmail.com"));
    }
         */
/*
    @Test
    void testEmailNulo() {
        Exception ex = assertThrows(IllegalArgumentException.class,
                () -> validator.isValid(null));
        assertEquals("El email no puede estar vacío", ex.getMessage());
    }
         */
/*
    @Test
    void testEmailVacio() {
        assertThrows(IllegalArgumentException.class,
                () -> validator.isValid("  "));
    }
                 */
}