import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author favio
 */
public class Algoritmo {
    
    public static int busquedaBinaria(int[] arreglo, int objetivo) {
        int inicio = 0;
        int fin = arreglo.length - 1;
        
        while (inicio <= fin) {
            int medio = (inicio + fin) / 2;
            int valorMedio = arreglo[medio];
            
            if (valorMedio == objetivo) {
                return medio;
            } else if (valorMedio < objetivo) {
                inicio = medio + 1;
            } else {
                fin = medio - 1;
            }
        }
        
        return -1;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] miArreglo = {2, 4, 6, 8, 10, 12, 14, 16, 18, 20};
        
        System.out.print("Ingrese el numero que desea buscar: ");
        int objetivo = scanner.nextInt();
        
        int resultado = busquedaBinaria(miArreglo, objetivo);
        if (resultado != -1) {
            System.out.println("El elemento " + objetivo + " se encuentra en la posicion " + resultado + ".");
        } else {
            System.out.println("El elemento " + objetivo + " no se encuentra en la lista.");
        }
        
        scanner.close();
    }   
}
