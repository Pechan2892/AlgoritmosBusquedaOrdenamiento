package com.proyecto.algoritmos;

public class BusquedaBinaria {
    public boolean buscar(int[] array, int clave) {
        int izquierda = 0;
        int derecha = array.length - 1;

        while (izquierda <= derecha) {
            int medio = (izquierda + derecha) / 2;

            if (array[medio] == clave) {
                return true; // Clave encontrada
            } else if (array[medio] < clave) {
                izquierda = medio + 1; // Buscar en la mitad derecha
            } else {
                derecha = medio - 1; // Buscar en la mitad izquierda
            }
        }

        return false; // Clave no encontrada
    }
}