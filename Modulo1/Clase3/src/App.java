import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);

         System.out.println("Cuantas personas en la mesa: ");
        int personas = sc.nextInt();

        sc.nextLine();

        System.out.println("Nombre del cliente: ");
        String nombre = sc.nextLine();

       
        System.out.println("Mesa de " + nombre + " , " + personas + " persona.");

         //! 

        double subtotal = 120000;
        boolean tieneCupon = true;

        boolean aplicaDescuento = subtotal > 100000 && tieneCupon; // && valida las 2 funciones los hace obligatorio II valida uno O otro
        System.out.println("Aplica descuento? " + aplicaDescuento);


        int unidades = 5;
        double comoDecimal = unidades; // coinversion implicita 
        System.out.println("Implicita: " + comoDecimal);

        double precio = 19990.75;
        int precioRecortado = (int) precio;
        System.out.println("Casting: " + precioRecortado);

        



    }
}
