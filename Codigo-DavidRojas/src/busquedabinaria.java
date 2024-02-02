import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author vjere
 */
public class busquedabinaria {
    public static int busquedabinaria(int[] vector, int clave) {
        //Declaracion de variables para "limites"
        int limMenor = 0;
        int limMayor = vector.length - 1;
        //Ciclo que maneja la busqueda
        while (limMenor <= limMayor) {
            int medio = (limMenor + limMayor) / 2;
                if (vector[medio] == clave) {
                return medio;
                }       
                else if (vector[medio] < clave) {
                limMenor = medio + 1;
                }      
                else {
                limMayor = medio - 1;
                }
        }
       return -1;
    }
    public static void main(String[] args) {
        Scanner entradaDatos = new Scanner(System.in);
        int[] vector = new int[21];
        System.out.println("----- Ingreso de datos en el vector -----");
        for(int i = 0; i < vector.length; i++){
            System.out.println("Ingrese el numero en la posicion " + (i) + ":");
            vector[i] = entradaDatos.nextInt();
        }
        int clave = 0;
        System.out.println("----- Ingrese el numero que desea buscar -----");
        clave = entradaDatos.nextInt();
      
        int resultado = busquedabinaria(vector, clave);
            if (resultado == -1) {
            System.out.println("Elemento no encontrado");
            }
            else {
            System.out.println("Elemento encontrado en la posicion " + resultado);
            }
    }    
}