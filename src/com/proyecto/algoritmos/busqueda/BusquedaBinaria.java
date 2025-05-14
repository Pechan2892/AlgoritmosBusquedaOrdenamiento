package com.proyecto.algoritmos.busqueda;

public class BusquedaBinaria {
    //Metodo para la busqueda binaria
    public boolean buscar(int[] arr, int clave) {
        if (arr == null || arr.length == 0) {
            return false;//si el array esta vacio, no se puede buscar
        }
        return  busquedaBinaria(arr, clave, 0, arr.length - 1);//llamada recursiva
    }
     //Metodo recursivo para la busqueda binaria
    private  boolean busquedaBinaria(int[] arr, int clave, int bajo, int alto) {
        if (bajo > alto) {
            return false;//la clave no se encuentra en el array
        }
        //Encontrar el indice medio
        int  medio = bajo + (alto - bajo) / 2;
        //verificar si la clave esta en el medio
        if (arr[medio] == clave) {
            return true;
        }
        // Si la clave es menor que el elemento en el medio, buscar en la mitad izquierda
        if(clave < arr[medio]) {
            return busquedaBinaria(arr, clave, bajo, medio - 1);
        }
        // Si la clave es mayor que el elemento en el medio, buscar en la mitad derecha
        return busquedaBinaria(arr, clave, medio + 1, alto);
    }


}
