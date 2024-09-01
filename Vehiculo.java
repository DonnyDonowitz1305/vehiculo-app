import java.util.Scanner;  // Importa la clase Scanner para recibir entrada desde el teclado

public class Vehiculo {  // Define la clase Vehiculo
    public static void main(String[] args) {  // Método principal donde comienza la ejecución del programa
        Scanner scanner = new Scanner(System.in);  // Crea un objeto Scanner para leer la entrada del usuario

        // Solicita el nombre del usuario
        System.out.print("Ingrese su nombre: ");
        String nombre = scanner.nextLine();  // Lee y almacena el nombre del usuario

        // Solicita la edad del usuario
        System.out.print("Ingrese su edad: ");
        int edad = scanner.nextInt();  // Lee y almacena la edad del usuario
        scanner.nextLine();  // Limpia el buffer de entrada

        // Solicita la marca del vehículo
        System.out.print("Ingrese la marca del vehículo: ");
        String marca = scanner.nextLine();  // Lee y almacena la marca del vehículo

        // Solicita el modelo del vehículo
        System.out.print("Ingrese el modelo del vehículo: ");
        String modelo = scanner.nextLine();  // Lee y almacena el modelo del vehículo

        // Solicita la cilindrada del vehículo
        System.out.print("Ingrese la cilindrada del vehículo (en cc): ");
        String cilindrada = scanner.nextLine();  // Lee y almacena la cilindrada del vehículo

        // Solicita el tipo de combustible
        System.out.print("Ingrese el tipo de combustible: ");
        String combustible = scanner.nextLine();  // Lee y almacena el tipo de combustible

        // Solicita la capacidad en pasajeros
        System.out.print("Ingrese la capacidad en pasajeros: ");
        int capacidad = scanner.nextInt();  // Lee y almacena la capacidad en pasajeros

        // Muestra en pantalla los datos ingresados por el usuario
        System.out.println("\nDatos ingresados:");
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Marca del vehículo: " + marca);
        System.out.println("Modelo del vehículo: " + modelo);
        System.out.println("Cilindrada del vehículo: " + cilindrada + " cc");
        System.out.println("Tipo de combustible: " + combustible);
        System.out.println("Capacidad en pasajeros: " + capacidad);
    }
}
