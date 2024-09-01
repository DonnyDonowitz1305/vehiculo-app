import java.util.Scanner;

public class Vehiculo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese la marca del vehículo: ");
        String marca = scanner.nextLine();
        
        System.out.print("Ingrese el modelo del vehículo: ");
        String modelo = scanner.nextLine();
        
        System.out.print("Ingrese la cilindrada del vehículo (en cc): ");
        String cilindrada = scanner.nextLine();
        
        System.out.print("Ingrese el tipo de combustible: ");
        String combustible = scanner.nextLine();
        
        System.out.print("Ingrese la capacidad en pasajeros: ");
        int capacidad = scanner.nextInt();
        
        System.out.println("\nLa marca que ha ingresado es: " + marca);
        System.out.println("El modelo que ha ingresado es: " + modelo);
        System.out.println("La cilindrada que ha ingresado es: " + cilindrada + " cc");
        System.out.println("El tipo de combustible es: " + combustible);
        System.out.println("Tiene una capacidad de " + capacidad + " pasajeros.");
    }
}