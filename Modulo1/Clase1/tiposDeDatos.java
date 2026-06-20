package Modulo1.Clase1;

import java.util.Scanner;

public class tiposDeDatos {
    public static void main(String[] args) throws Exception {
        
        // Declarar variables

        int edad;
        double salario;
        float promedio;
        char sexo;
        boolean estado;
        String nombres;

        // entrada de datos 
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite el nombre del estudiante: ");
        nombres = entrada.nextLine(); // line lee todo el nombre 
        System.out.println("Digite la edad: ");
        edad = entrada.nextInt();
        System.out.println("Digite el salario: ");
        salario = entrada.nextDouble();
        System.out.println("Digite el promedio: ");
        promedio = entrada.nextFloat();
        System.out.println("Digite el sexo: ");
        sexo = entrada.next().charAt(0); // Solo captura un solo codigo 
        System.out.println("Digite el estado del estudiante: ");
        estado = entrada.nextBoolean();

        


        // salida de datos 
        System.out.println("El nombre del estudiante es: " + nombres);
        System.out.println("La edad es: " + edad);
        System.out.println("El salario es: " + salario);
        System.out.println("El promedio es: " + promedio);
        System.out.println("El sexo es: " + sexo);
        System.out.println("El estado del estudiante es: " + estado);




    }
}
