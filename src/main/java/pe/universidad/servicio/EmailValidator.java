package pe.universidad.servicio;

public class EmailValidator {

    public boolean isValid(String email) {
        if (email == null || email.isBlank())
            throw new IllegalArgumentException("El email no puede estar vacío");

        if (email.startsWith(" ") || email.endsWith(" "))
            return false;

        if (!email.contains("@") || !email.contains("."))
            return false;

        if (email.indexOf('@') > email.lastIndexOf('.'))
            return false;

        return true;
    }
}