
package general;

import java.util.InputMismatchException;
import java.util.Scanner;

class General {

    public void menu(){
        Scanner scanner = new Scanner(System.in);
        int op;
        do{
            System.out.println("--menu--");
            System.out.println("1. incializacion");
            System.out.println("2. cerrar");
            System.out.println("Selecciona una opcion: ");
            
            // Verificar si el usuario ingresó un número
            while (!scanner.hasNextInt()) {
                System.out.println("Error: Debes ingresar un número válido.");
                scanner.next(); // Limpiar el buffer del scanner
                System.out.print("Selecciona una opción: ");
            }
            op = scanner.nextInt();
            
            switch (op){
                case 1:
                    int num = -1;
                    System.out.print("Ingresa un número positivo: ");
                    
                    while (num <= 0) {
                        // Manejo de error si el usuario ingresa algo inválido
                        try {
                            num = scanner.nextInt();
                            if (num <= 0) {
                                System.out.print("Error: Ingresa un número positivo: ");
                            }
                        } catch (InputMismatchException e) {
                            System.out.println("Error: Debes ingresar un número entero válido.");
                            scanner.next(); // Limpiar el buffer del scanner
                            System.out.print("Ingresa un número positivo: ");
                        }
                    }

                    if (encontrarPrimo(num)){
                        System.out.println(num + " es un número primo.");
                    } else {
                        System.out.println(num + " no es un número primo.");
                    }
                    
                    System.out.print("Divisores de " + num + ": ");
                    variedadNumero(num);
                    break;
                case 2:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opcion invalida. inteta nuevamente");
            }
        }while (op !=2);
        
        scanner.close();
        
}
    
public boolean encontrarPrimo(int num){
    int contador = 0;
    for(int i = 1; i <= num; i++){
        if (num % i == 0){
            contador++;
        }
    }
    return contador == 2;
}    

public void variedadNumero(int numero) {
        for (int i = 1; i <= numero; i++) {
            if (numero % i == 0) {
                System.out.print(i + ", ");
            }
        }
        System.out.println();
    }
}
    
public class Main {
    
    public static void main(String[] args) {
        General programa = new General();
        programa.menu();
    }
    
}
