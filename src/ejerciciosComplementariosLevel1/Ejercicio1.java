package ejerciciosComplementariosLevel1;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
         String nombre;
        Scanner scanner=new Scanner(System.in);
        System.out.print("Ingrese su nombre: ");
        nombre= scanner.nextLine();
        System.out.println("HOLA "+nombre+"!!!");
    }
}
