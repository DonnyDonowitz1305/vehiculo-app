import java.util.Scanner;  // Importando la clase Scanner para recibir entrada desde el teclado

public class Vehiculo {  // Defino la clase Vehiculo
    public static void main(String[] args) {  // Método principal donde comienza la ejecución del programa
        Scanner scanner = new Scanner(System.in);  // Crea un objeto Scanner para leer la entrada del usuario
        
        System.out.print("Ingrese la marca del vehículo: ");  // Solicito la marca del vehículo
        String marca = scanner.nextLine();  // Lee y almacena la entrada del usuario en la variable 'marca'
        
        System.out.print("Ingrese el modelo del vehículo: ");  // Solicito el modelo del vehículo
        String modelo = scanner.nextLine();  // Lee y almacena la entrada del usuario en la variable 'modelo'
        
        System.out.print("Ingrese la cilindrada del vehículo (en cc): ");  // Solicito la cilindrada del vehículo
        String cilindrada = scanner.nextLine();  // Lee y almacena la entrada del usuario en la variable 'cilindrada'
        
        System.out.print("Ingrese el tipo de combustible: ");  // Solicito el tipo de combustible
        String combustible = scanner.nextLine();  // Lee y almacena la entrada del usuario en la variable 'combustible'
        
        System.out.print("Ingrese la capacidad en pasajeros: ");  // Solicito la capacidad en pasajeros
        int capacidad = scanner.nextInt();  // Lee y almacena la entrada del usuario en la variable 'capacidad'
        
        // Muestra en pantalla los datos ingresados por el usuario
        System.out.println("\nLa marca que ha ingresado es: " + marca);
        System.out.println("El modelo que ha ingresado es: " + modelo);
        System.out.println("La cilindrada que ha ingresado es: " + cilindrada + " cc");
        System.out.println("El tipo de combustible es: " + combustible);
        System.out.println("Tiene una capacidad de " + capacidad + " pasajeros.");
    }
}
