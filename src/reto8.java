import java.util.Scanner;
public class reto8 {
    public static void main(String[] args) {
        Scanner captura = new Scanner (System.in);
        int resp=0,cont=1;
        int numero = (int)(Math.random()*100+1);
        System.out.println("Debes adivinar el numero de la maquina, del 1 a 100. Solo tienes 10 oportunidades");
        System.out.println("numero: "+numero );

   do{
            if (cont<=10){
                  System.out.println("Digita un numero");  
                  resp=captura.nextInt();
                  if (resp==numero){
                    System.out.println("adivinaste! en "+cont+" intentos");
                  return;
                  }
                  else if (resp<numero){
                    System.out.println(resp+" es menor al numero de la maquina");
                    cont++;
                  }
                  else{
                    System.out.println(resp+" es mayor al numero de la maquina");
                    cont++;
                  }
                }
        } while (cont<=10);
        System.out.println("Lo sentimos se acabaron las oportunidades");
        captura.close();
    }
}
