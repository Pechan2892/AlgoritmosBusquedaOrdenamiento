package com.proyecto.algoritmos;

public class QuickSort {

    // Método principal público que inicia el ordenamiento
    public void ordenar(int[] arreglo) {
        quickSort(arreglo, 0, arreglo.length - 1);
    }


    /* Método auxiliar para imprimir cualquier arreglo

       public void imprimir(int[] arreglo) {
       for (int i = 0; i < arreglo.length; i++) {
            System.out.print(arreglo[i] + " ");
        }
        System.out.println();    }

    */


    // Método interno recursivo de QuickSort
    private void quickSort(int[] arr, int inicio, int fin) {
        if (inicio < fin) {
            int pivote = particion(arr, inicio, fin);
            quickSort(arr, inicio, pivote - 1);
            quickSort(arr, pivote + 1, fin);
        }
    }

    // Método para particionar el arreglo según el pivote
    private int particion(int[] arr, int inicio, int fin) {
        int pivote = arr[fin];
        int i = inicio - 1;
        for (int j = inicio; j < fin; j++) {
            if (arr[j] <= pivote) {
                i++;
                intercambiar(arr, i, j);
            }
        }
        intercambiar(arr, i + 1, fin);
        return i + 1;
    }

    // Método para intercambiar dos elementos del arreglo
    private void intercambiar(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}

