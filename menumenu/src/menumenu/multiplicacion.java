
package menumenu;

import java.util.Scanner;

public class multiplicacion {
    public static void multiplicar(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nDigite un numero: ");
        int num1 = scanner.nextInt();
        System.out.print(num1 + " * ");
        int num2 = scanner.nextInt();
        
        int multiplicacionn = num1 + num2;
        
        System.out.print("Multiplicacion: "+ multiplicacionn + "\n\n");
    }
}
