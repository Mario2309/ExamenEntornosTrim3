import java.util.Scanner;

public class RegistroUsuario {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Persona persona = new Persona();

        System.out.print("Ingrese el DNI: ");
        while (!persona.setDni(scanner.nextLine()));

        System.out.print("Ingrese el correo electrónico: ");
        while (!persona.setCorreo(scanner.nextLine()));

        System.out.print("Ingrese la contraseña: ");
        while (!persona.setContrasena(scanner.nextLine()));

        System.out.print("Ingrese el nombre: ");
        persona.setNombre(scanner.nextLine());

        System.out.print("Ingrese los apellidos: ");
        persona.setApellidos(scanner.nextLine());

        System.out.print("Ingrese la dirección postal: ");
        persona.setDireccionPostal(scanner.nextLine());

        System.out.print("Ingrese el código postal: ");
        persona.setCodigoPostal(scanner.nextLine());

        System.out.print("Ingrese el teléfono: ");
        persona.setTelefono(scanner.nextLine());

        System.out.print("Ingrese la edad: ");
        while (!persona.setEdad(scanner.nextInt()));

        System.out.println("Registro exitoso!");
        System.out.println("Detalles del usuario:");
        System.out.println(persona);
    }
}
