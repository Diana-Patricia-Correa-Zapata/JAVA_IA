public class Condicionales {
    public static void main(String[] args) {

        /*if solo */
        //double cuenta = 150000;
        //if (cuenta > 100000) { // si lo que hya en la cuenta es mayor a 100000 entonces aplica descuento 
           // System.out.println("Aplica descuento");
       // }

        double cuenta = 150000;

        if (cuenta >= 200000) { // si lo que hya en la cuenta es mayor a 100000 entonces aplica descuento 
            System.out.println("Descuento VIP (15%) ");}
        else if (cuenta > 100000){
            System.out.println("Descuento normal (10%)");
        } else {
            System.out.println("Sin descuento");
        }

    
    }


}
