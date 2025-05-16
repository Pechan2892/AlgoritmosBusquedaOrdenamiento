package com.proyecto.algoritmos.busqueda;

public class BusquedaBinaria {

    /**
     * Realiza una búsqueda binaria sobre un arreglo ordenado.
     *
     * @param array El arreglo de números enteros ordenado.
     * @param objetivo El número que se desea buscar.
     * @return true si el número fue encontrado, false en caso contrario.
     */
    public boolean buscar(int[] array, int objetivo) {
        int izquierda = 0;
        int derecha = array.length - 1;

        while (izquierda <= derecha) {
            int medio = izquierda + (derecha - izquierda) / 2;

            if (array[medio] == objetivo) {
                return true;
            } else if (array[medio] < objetivo) {
                izquierda = medio + 1;
            } else {
                derecha = medio - 1;
            }
        }

        return false;
    }
}
