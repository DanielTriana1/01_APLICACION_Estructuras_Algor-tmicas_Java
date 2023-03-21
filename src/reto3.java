import java.util.Scanner;
public class reto3 {
    public static void main(String[] args){
        Scanner captura = new Scanner (System.in);
        int apuesta,apuestaG;
        String eleccion,nomb;
        int numero = (int)(Math.random()*2+1);
        System.out.println("Gana dinero jugando al carisellazo");
        System.out.println("Digita tu nombre");
        nomb=captura.next();
        System.out.println("¿Cuanto vas a apostar? Minimo 10.000");
        apuesta=captura.nextInt();
        if (apuesta>=10000){
            System.out.println("elije tu opcion ¿cara o sello?");
            eleccion=captura.next();
            System.out.println("Cara sera 1 y sello 2.");
            switch (eleccion){
                case "cara":
                if(numero==1){
                    System.out.println("La opcion aleatoria fue: "+numero+". Cara");         
                    apuestaG=apuesta*2;
                    System.out.println("Enhorabuena "+nomb+" ganaste, obtuviste el total de: "+apuestaG);
                }
                else{
                    System.out.println("La opcion aleatoria fue: "+numero);         
                    apuestaG=apuesta-apuesta;
                    System.out.println("lo sentimos "+nomb+" perdiste, quedaste con el total de: "+apuestaG);
                }
                break;

                case "sello":
                if(numero==2){
                    System.out.println("La opcion aleatoria fue: "+numero+". Sello");         
                    apuestaG=apuesta*2;
                    System.out.println("Enhorabuena "+nomb+" ganaste, obtuviste el total de: "+apuestaG);
                }
                else{
                    System.out.println("La opcion aleatoria fue: "+numero);         
                    apuestaG=apuesta-apuesta;
                    System.out.println("lo sentimos "+nomb+" perdiste, quedaste con el total de: "+apuestaG);
                }
                   
                break;

                default:
                System.out.println(nomb+" no es una opcion valida.");
                break;
            }
            
    }
     captura.close();

    }
}
