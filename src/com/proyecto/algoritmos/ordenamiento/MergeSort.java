package com.proyecto.algoritmos.ordenamiento;
//Cristian Alfredo Martinez Garcia
public class MergeSort {
    /**
     * Ordena el array usando Merge Sort y devuelve uno nuevo ordenado.
     */
    public int[] ordenar(int[] arr) {
        if (arr.length <= 1) {
            return arr; // Ya está ordenado
        }

        // 1) Dividir el array en dos mitades
        int mid = arr.length / 2;
        int[] izquierda  = Arrays.copyOfRange(arr, 0, mid);
        int[] derecha    = Arrays.copyOfRange(arr, mid, arr.length);


        // 2) Ordenar recursivamente cada mitad
        izquierda = ordenar(izquierda);
        derecha   = ordenar(derecha);



        // 3) Mezclar las dos mitades ordenadas
        return mezclar(izquierda, derecha);
    }

    /**
     * Combina dos arrays ordenados en uno solo manteniendo el orden.
     */
    private int[] mezclar(int[] izq, int[] der) {
        int[] resultado = new int[izq.length + der.length];
        int i = 0, j = 0, k = 0;

        // Comparar elementos de ambas mitades y agregarlos al resultado
        while (i < izq.length && j < der.length) {
            if (izq[i] <= der[j]) {
                resultado[k++] = izq[i++];
            } else {
                resultado[k++] = der[j++];
            }
        }
        // Agregar los restantes de la mitad izquierda (si quedan)
        while (i < izq.length) {
            resultado[k++] = izq[i++];
        }
        // Agregar los restantes de la mitad derecha (si quedan)
        while (j < der.length) {
            resultado[k++] = der[j++];
        }
        return resultado;
    }
}
