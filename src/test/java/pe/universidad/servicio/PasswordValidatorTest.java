package pe.universidad.servicio;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class PasswordValidatorTest {
/*
    @Test
    void testPasswordNull() {
        Exception ex = assertThrows(IllegalArgumentException.class,
                () -> PasswordValidation.isValid(null));
        assertEquals("La contraseña no puede ser nula o vacía", ex.getMessage());
    }
/*
    @Test
    void testPasswordVacia() {
        Exception ex = assertThrows(IllegalArgumentException.class,
                () -> PasswordValidation.isValid(""));
        assertEquals("La contraseña no puede ser nula o vacía", ex.getMessage());
    }
        */

    @Test
    void testPasswordValida() {
        assertTrue(PasswordValidation.isValid("Seguro909!"));
    }

    /*
    @Test
    void testPasswordInvalidaFaltaRequisitos() {
        assertFalse(PasswordValidation.isValid("nosegura"));
    }
    */
/*
    @Test
    void testPasswordMuyCorta() {
        assertFalse(PasswordValidation.isValid("ABc123°°°°°"));
    }
        */
/*
    @Test
    void testPasswordConEspacioFinal() {
        assertFalse(PasswordValidation.isValid("ClaveSegura123 "));
    }
         */
}