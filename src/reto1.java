import java.util.Scanner;
public class reto1 {
    public static void main(String[] args ) {
        Scanner lectura = new Scanner(System.in);
        double kelvinG = 0;
        
        System.out.println("escriba los grados kelvin: ");
        kelvinG = lectura.nextDouble();
        double CentiG = kelvinG - 273.15;
        System.out.println("La conversion de Kelvin a centigrado es: " + CentiG);
        lectura.close();



        
    }



}


