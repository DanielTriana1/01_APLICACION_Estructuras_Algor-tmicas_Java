import java.util.Scanner;
public class reto2 {
public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        String Nmama;
        String Nbebe;
        String Nvacuna;
        double Pbebe = 0;
        int Mbebe = 0;
        double Cdosis = 0;
        System.out.println("Nombre de la Madre");
        Nmama = lectura.nextLine();
        System.out.println("Nombre del Bebe");
        Nbebe = lectura.nextLine();
        System.out.println("Nombre de la Vacuna");
        Nvacuna = lectura.nextLine();
        System.out.println("Peso del Bebe");
        Pbebe = lectura.nextDouble();
        System.out.println("Meses del bebe");
        Mbebe = lectura.nextInt();
        Cdosis = ((Pbebe + 10)/(Mbebe * 10 )*8);
        System.out.println("Nombre de Madre: " + Nmama);
        System.out.println("Nombre del Bebe: " + Nbebe);
        System.out.println("Por el peso " + Pbebe + " y sus meses " +Mbebe+ ", la dosis a suministar es: " + Cdosis);
        System.out.println("Nombre Vacuna: " + Nvacuna);



        lectura.close();
    }
    
}