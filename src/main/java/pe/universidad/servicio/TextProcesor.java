
package pe.universidad.servicio;

public class TextProcesor {

    public String process(String text) {
        // 1. Validación de null
        if (text == null) {
            throw new IllegalArgumentException("El texto no puede ser nulo");
        }

        // 2. Validación de vacío o solo espacios
        if (text.trim().isEmpty()) {
            throw new IllegalArgumentException("El texto no puede estar vacío");
        }

        // 3. Validación de longitud
        if (text.length() > 1000) {
            throw new IllegalArgumentException("El texto excede el límite de 1000 caracteres");
        }

        // 4. Eliminar espacios al inicio y final
        String trimmed = text.trim();

        // 5. Invertir texto
        String reversed = new StringBuilder(trimmed).reverse().toString();

        // 6. Convertir a mayúsculas
        return reversed.toUpperCase();
    }
}