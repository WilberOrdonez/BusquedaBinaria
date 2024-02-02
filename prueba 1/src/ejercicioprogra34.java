/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Leticia
 */
public class ejercicioprogra34 {

    // Función para realizar la búsqueda binaria
    static int busquedaBinaria(int[] arreglo, int elemento) {
        int izquierda = 0;
        int derecha = arreglo.length - 1;

        while (izquierda <= derecha) {
            int medio = izquierda + (derecha - izquierda) / 2;

            // Verificar si el elemento está presente en la mitad
            if (arreglo[medio] == elemento)
                return medio;

            // Si el elemento es mayor, ignorar la mitad izquierda
            if (arreglo[medio] < elemento)
                izquierda = medio + 1;

            // Si el elemento es menor, ignorar la mitad derecha
            else
                derecha = medio - 1;
        }

        // Si el elemento no está presente en el arreglo
        return -1;
    }

    public static void main(String[] args) {
        // Ejemplo de uso
        int[] arreglo = { 5, 8, 10, 20, 30};
        int elementoABuscar = 10;

        int resultado = busquedaBinaria(arreglo, elementoABuscar);

        if (resultado == -1)
            System.out.println("Elemento no encontrado en el arreglo");
        else
            System.out.println("Elemento encontrado en la posición " + resultado);
    }
}
