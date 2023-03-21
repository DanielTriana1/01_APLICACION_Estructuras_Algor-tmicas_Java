import java.util.Scanner;
public class reto6 {
    public static void main(String[] args) {
        Scanner captura= new Scanner (System.in);
        String eleccion, nomb;
       int resp,cont=0;
       Double apuesta, apuestaG=0.0, apuestaGL=0.0;
       int numero = (int)(Math.random()*2+1);
       System.out.println("Gana dinero jugando al carisellazo");
        System.out.println("Digita tu nombre");
        nomb=captura.next();
    do {        
        System.out.println("¿Cuanto vas a apostar?");
        apuesta=captura.nextDouble();
        System.out.println("elije tu opcion ¿cara o sello?");
        eleccion=captura.next();
        System.out.println("Cara sera 1 y sello 2.");
    switch (eleccion){
        case "cara":
        if(numero==1){
            System.out.println("La opcion aleatoria fue: "+numero+". Cara");         
            apuestaG=apuesta*(2+(cont*0.25));
            System.out.println("Enhorabuena "+nomb+" ganaste, obtuviste el total de: "+apuestaG);
            apuestaGL+=apuestaG;
        }
        else{
            System.out.println("La opcion aleatoria fue: "+numero);         
            apuestaG=apuesta-apuesta;
            System.out.println("lo sentimos "+nomb+" perdiste, quedaste con el total de: "+apuestaG);
            apuestaGL-=apuesta;
        }
        break;

        case "sello":
        if(numero==2){
            System.out.println("La opcion aleatoria fue: "+numero+". Sello");         
            apuestaG=apuesta*(2+(cont*0.25));
            System.out.println("Enhorabuena "+nomb+" ganaste, obtuviste el total de: "+apuestaG);
            apuestaGL+=apuestaG;
        }
        else{
            System.out.println("La opcion aleatoria fue: "+numero);         
            apuestaG=apuesta-apuesta;
            System.out.println("lo sentimos "+nomb+" perdiste, quedaste con el total de: "+apuestaG);
            apuestaGL-=apuesta;
        }
           
        break;

        default:
        System.out.println(nomb+" no es una opcion valida.");
        break;
    }
    cont++;
    System.out.println(nomb+" ¿Desea seguir jugando? 1.Si / 2.No");
    resp=captura.nextInt();
} while (resp==1);
System.out.println("veces que jugaste: "+cont);
System.out.println("dinero final conseguido: "+apuestaGL);
    captura.close();
}
}