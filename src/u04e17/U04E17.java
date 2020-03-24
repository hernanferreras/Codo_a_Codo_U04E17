
package u04e17;

import java.util.Scanner;
public class U04E17 {

    public static void main(String[] args) {
       int num, i;
       Scanner entrada = new Scanner(System.in);
       System.out.print("Ingrese un numero: ");
       num = entrada.nextInt();
       for (i=1; i<=(10); i++){
           System.out.println(num+"*"+i+"="+(num*i));
       }
    }
}