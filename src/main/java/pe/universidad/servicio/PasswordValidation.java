package pe.universidad.servicio;

public class PasswordValidation {

    public static boolean isValid(String password) {

        if (password == null || password.isEmpty()) {
            throw new IllegalArgumentException("La contraseña no puede ser nula o vacía");
        }

        if (password.length() < 8 || password.length() > 64) {
            return false;
        }

        boolean hasUpper = false;
        boolean hasLower = false;
        boolean hasDigit = false;
        boolean hasSpecial = false;

        String specialChars = "!@#$%^&*()_-+=<>{}[]|\\:;\"'.,?/";

        if (password.startsWith(" ") || password.endsWith(" ")) {
            return false;
        }

        for (char c : password.toCharArray()) {
            if (Character.isUpperCase(c)) hasUpper = true;
            else if (Character.isLowerCase(c)) hasLower = true;
            else if (Character.isDigit(c)) hasDigit = true;
            else if (specialChars.contains(String.valueOf(c))) hasSpecial = true;
            else if (c == ' ') return false;
        }

        return hasUpper && hasLower && hasDigit && hasSpecial;
    }
}