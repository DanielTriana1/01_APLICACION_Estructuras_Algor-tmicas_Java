import java.util.Scanner;
public class reto7 {
    public static void main(String[] args){
        Scanner captura = new Scanner (System.in);
        int resp=0,cont1=0,cont=0;
        String eleccion,nomb;
        Double apuesta, apuestaG=0.0, apuestaGL=0.0;
        int numero = (int)(Math.random()*3+1);
        System.out.println("Gana dinero jugando al piedra, papel y tijera");
        System.out.println("Digita tu nombre");
        nomb=captura.next();

       
            do{      if (cont1<=3){   
        System.out.println("¿Cuanto vas a apostar? Minimo 10.000");
        apuesta=captura.nextDouble();
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
                    cont1++;
                    apuestaGL-=apuesta;
                }
                else{
                    System.out.println("La opcion aleatoria fue: "+numero);         
                    apuestaG=apuesta*(2+(cont*0.25));
                    System.out.println("Enhorabuena "+nomb+" ganaste, obtuviste el total de: "+apuestaG);
                }
                break;

                case "papel":
                if(numero==1){
                    System.out.println("La opcion aleatoria fue: "+numero);         
                    apuestaG=apuesta*(2+(cont*0.25));
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
                    cont1++;
                    apuestaGL-=apuesta;
                }
                break;

                case "tijera":
                if(numero==1){
                    System.out.println("La opcion aleatoria fue: "+numero);         
                    apuestaG=apuesta-apuesta;
                    System.out.println("lo sentimos "+nomb+" perdiste, quedaste con el total de: "+apuestaG);
                    cont1++;
                    apuestaGL-=apuesta;
                }
                else if(numero==2){
                    System.out.println("La opcion aleatoria fue: "+numero);         
                    apuestaG=apuesta*(2+(cont*0.25));
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
            cont++;
            System.out.println(nomb+" ¿Desea seguir jugando? 1.Si / 2.No");
            resp=captura.nextInt();   
         }
         else{ 
            System.out.println("Lo siento "+nomb+", solo puedes perder tres veces");
            resp=2;
         }
        }while (resp==1);

    System.out.println("veces que jugaste: "+cont);
System.out.println("dinero final conseguido: "+apuestaGL);
     captura.close();

    }
}
