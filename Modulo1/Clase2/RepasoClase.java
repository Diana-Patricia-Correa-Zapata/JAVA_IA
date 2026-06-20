package Modulo1.Clase2;

import java.util.Scanner;

public class RepasoClase {

    public static void main(String[] args) {
        
        String nombres;
        int edad;



        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite el nombre: ");
        nombres = entrada.nextLine();
        System.out.println("Digite la edad: ");
        edad = entrada.nextInt();



        System.out.println("El nombre es: " + nombres);
        System.out.println("La Edad es: " + edad);

    }
}



