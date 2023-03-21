import java.util.Scanner;
public class reto4 {
    public static void main(String[] args){
        Scanner captura = new Scanner (System.in);
        int apuesta,apuestaG;
        String eleccion,nomb;
        int numero = (int)(Math.random()*3+1);
        System.out.println("Gana dinero jugando al piedra, papel y tijera");
        System.out.println("Digita tu nombre");
        nomb=captura.next();
        System.out.println("¿Cuanto vas a apostar? Minimo 10.000");
        apuesta=captura.nextInt();
        if (apuesta>=10000){
            System.out.println("elije tu opcion");
            eleccion=captura.next();
            System.out.println("piedra sera 1, papel 2 y tijera 3.");
            switch (eleccion){
                case "piedra":
                if(numero==1){
                    System.out.println("La opcion aleatoria fue: "+numero);         
                    apuestaG=apuesta;
                    System.out.println(nomb+" fue un empate,quedaste con el total de: "+apuestaG);
                }
                else if(numero==2){
                    System.out.println("La opcion aleatoria fue: "+numero);         
                    apuestaG=apuesta-apuesta;
                    System.out.println("lo sentimos "+nomb+" perdiste, quedaste con el total de: "+apuestaG);
                }
                else{
                    System.out.println("La opcion aleatoria fue: "+numero);         
                    apuestaG=apuesta*2;
                    System.out.println("Enhorabuena "+nomb+" ganaste, obtuviste el total de: "+apuestaG);
                }
                break;

                case "papel":
                if(numero==1){
                    System.out.println("La opcion aleatoria fue: "+numero);         
                    apuestaG=apuesta*2;
                    System.out.println("Enhorabuena "+nomb+" ganaste, obtuviste el total de: "+apuestaG);
                }
                else if(numero==2){
                    System.out.println("La opcion aleatoria fue: "+numero);         
                    apuestaG=apuesta;
                    System.out.println(nomb+" fue un empate,quedaste con el total de: "+apuestaG);
                }
                else{
                    System.out.println("La opcion aleatoria fue: "+numero);         
                    apuestaG=apuesta-apuesta;
                    System.out.println("lo sentimos "+nomb+" perdiste, quedaste con el total de: "+apuestaG);
                }
                break;

                case "tijera":
                if(numero==1){
                    System.out.println("La opcion aleatoria fue: "+numero);         
                    apuestaG=apuesta-apuesta;
                    System.out.println("lo sentimos "+nomb+" perdiste, quedaste con el total de: "+apuestaG);
                }
                else if(numero==2){
                    System.out.println("La opcion aleatoria fue: "+numero);         
                    apuestaG=apuesta*2;
                    System.out.println("Enhorabuena "+nomb+" ganaste, obtuviste el total de: "+apuestaG);
                }
                else{
                    System.out.println("La opcion aleatoria fue: "+numero);         
                    apuestaG=apuesta;
                    System.out.println(nomb+" fue un empate,quedaste con el total de: "+apuestaG);
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
