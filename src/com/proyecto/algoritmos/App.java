package com.proyecto.algoritmos;

import com.proyecto.algoritmos.busqueda.BusquedaBinaria;
import com.proyecto.algoritmos.ordenamiento.MergeSort;
import com.proyecto.algoritmos.ordenamiento.QuickSort;
import com.proyecto.algoritmos.util.GeneradorNumeros;
import com.proyecto.algoritmos.util.MensajeSecreto;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        // Generamos el array de números aleatorios
        GeneradorNumeros generador = new GeneradorNumeros();
        int[] numeros = generador.generarNumeros(1000, 1000, 9999);

        // Selección aleatoria de la "clave mágica"
        int claveMagica = generador.seleccionarClave(numeros);
        String mensajeSecreto = MensajeSecreto.asociarMensaje(claveMagica);

        // Mostramos el array original y el ordenado
        System.out.println("Array generado:");
        generador.mostrarArray(numeros);


        //Ordenamiento MergeSort
        MergeSort mergeSort = new MergeSort();

        // 1) Llamamos a ordenar(...) y guardamos el resultado en un nuevo array
        int[] numerosOrdenados = mergeSort.ordenar(numeros);

        // 2) Lo imprimimos con el método mostrarArray(...)
        System.out.println("Array ordenado con MergeSort:");
        generador.mostrarArray(numerosOrdenados);
        System.out.println();



        // Ordenamiento usando QuickSort
        QuickSort quickSort = new QuickSort();
        //quickSort.ordenar(numeros);
        System.out.println("\nArray ordenado con QuickSort:");
        generador.mostrarArray(numeros);


        // Búsqueda binaria para encontrar la clave mágica
        BusquedaBinaria busqueda = new BusquedaBinaria();
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nIngresa el número mágico: ");
        int numeroIngresado = scanner.nextInt();

        boolean encontrado = busqueda.buscar(numeros, numeroIngresado);
        if (encontrado) {
            System.out.println("¡Correcto! " + mensajeSecreto);
        } else {
            System.out.println("Número incorrecto.");
        }
    }
}

