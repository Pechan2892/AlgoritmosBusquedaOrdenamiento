package com.proyecto.algoritmos.util;

import java.util.Random;

public class GeneradorNumeros {

    // Método para generar un array de números aleatorios
    public int[] generarNumeros(int tamaño, int min, int max) {
        Random random = new Random();
        int[] numeros = new int[tamaño];

        for (int i = 0; i < tamaño; i++) {
            numeros[i] = random.nextInt((max - min) + 1) + min;
        }

        return numeros;
    }

    // Método para mostrar el contenido del array
    public void mostrarArray(int[] array) {
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    // Método para seleccionar una clave mágica al azar
    public int seleccionarClave(int[] array) {
        Random random = new Random();
        return array[random.nextInt(array.length)];
    }
}
