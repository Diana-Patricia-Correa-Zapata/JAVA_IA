public class Metodos {

    public static void main(String[] args) { // void sin retorno solo imprime un valor

        double propina = calcularPropina(80000, 0.10);
        System.out.println("Propina: " + propina);
    }

 
    public static double calcularPropina(double subtotal, double porcentaje) {
        return subtotal * porcentaje;
    }

}

