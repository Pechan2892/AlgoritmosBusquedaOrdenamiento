package com.proyecto.algoritmos;

public class App {
    public static void main(String[] args) {

        // ← Se genera el arreglo aleatorio
        GeneradorNumeros g = new GeneradorNumeros(1000);

        // ← Se crea el objeto QuickSort
        QuickSort qs = new QuickSort();

        // ← Imprime el arreglo desordenado
        System.out.println("Arreglo Original: ");
        g.imprimeNumeros();

        // ← Ordena el arreglo
        System.out.println("Arreglo Ordenado con QuickSort: ");
        qs.ordenar(g.getNumeros());

        // ← Vuelve a imprimir, ahora está ordenado
        g.imprimeNumeros();

    }
}

