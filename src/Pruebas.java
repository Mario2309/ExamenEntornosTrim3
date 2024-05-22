import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class Pruebas {
    @Test
    public void testSetDniValid() {
        Persona persona = new Persona();

        // Caso de prueba: DNI válido
        String validDni = "1234568";
        boolean result = persona.setDni(validDni);
        assertTrue("El método debería devolver true para un DNI válido", result);
        assertEquals(validDni, persona.getDni(), "El DNI debería ser establecido correctamente");
    }

    @Test
    public void testSetDniInvalid() {
        Persona persona = new Persona();
        // Caso de prueba: DNI no válido (menos de 8 dígitos)
        String invalidDniShort = "1234567";
        boolean resultShort = persona.setDni(invalidDniShort);
        assertFalse("El método debería devolver false para un DNI con menos de 8 dígitos", resultShort);
        assertNotEquals(invalidDniShort, persona.getDni(), "El DNI no debería ser establecido");
    }

    @Test
    public void testSetEdadInvalid(){
        Persona persona = new Persona();
        // Caso de prueba: Edad no válida (menor de 18 años)
        int invalidEdad = 17;
        boolean resultEdad = persona.setEdad(invalidEdad);
        assertFalse("El método debería devolver false para una edad menor de 18", resultEdad);
    }

    @Test
    public void testSetEdadValid(){
        Persona persona = new Persona();
        // Caso de prueba: Edad válida (mayor o igual a 18 años)
        int validEdad = 18;
        boolean resultEdad = persona.setEdad(validEdad);
        assertTrue("El método debería devolver true para una edad mayor o igual a 18", resultEdad);
    }

    @Test
    public void testSetCorreoInvalid(){
        Persona persona = new Persona();
        // Caso de prueba: Correo no válido (sin @)
        String invalidCorreo = "example.com";
        boolean resultCorreo = persona.setCorreo(invalidCorreo);
        assertFalse("El método debería devolver false para un correo sin @", resultCorreo);
    }

    @Test
    public void testSetCorreoValid(){
        Persona persona = new Persona();
        // Caso de prueba: Correo válido (tiene @)
        String validCorreo = "example@example.com";
        boolean resultCorreo = persona.setCorreo(validCorreo);
        assertTrue("El método debería devolver true para un correo con @", resultCorreo);
    }
}
