import java.util.Scanner;
public class reto5 {
    public static void main(String[] args) {
        Scanner captura = new Scanner (System.in);
        int resp, precio, precioT=0;
        System.out.println("¿Cuantos productos vas a comprar?");
        resp=captura.nextInt();
        for (int i=1;i<=resp;i++){
            System.out.println("¿cuanto costo el producto No."+i+"?");
            precio=captura.nextInt();
            precioT+=precio; 
        }
        System.out.println("el costo total de su compra es: "+precioT);
        captura.close();
    }
    
}
