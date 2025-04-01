
package menumenu;

import java.util.Scanner;

public class Menumenu {

    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        int op;
        
        do {
            
            System.out.println("..Menu..\n");
            System.out.println("1. suma");
            System.out.println("2. resta");
            System.out.println("3. multiplicacion");
            System.out.println("4. salir");
            System.out.print("\nDiginte una opcion: ");
        op = scanner.nextInt();
        
        switch (op){
            case 1 -> suma.sumanum();
            case 2 -> resta.restanum();
            case 3 -> multiplicacion.multiplicar();
            case 4 -> System.out.println("Adios...");
            default -> System.out.println("\nOpcion no valida\n");
        }
            
        } while (op != 4);
        
        scanner.close();
    }
    
}
class suma {
    public static void sumanum(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nDigite un numero: ");
        int num1 = scanner.nextInt();
        System.out.print(num1 + " + ");
        int num2 = scanner.nextInt();
        
        int sumaa = num1 + num2;
        
        System.out.print("Suma: "+ sumaa + "\n\n");
    }
}

class resta {
    public static void restanum(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nDigite un numero: ");
        int num1 = scanner.nextInt();
        System.out.print(num1 + " - ");
        int num2 = scanner.nextInt();
        
        int restaa = num1 - num2;
        
        System.out.print("Resta: "+ restaa + "\n\n");
    }
}