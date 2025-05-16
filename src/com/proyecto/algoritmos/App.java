package com.proyecto.algoritmos;

public class App {
    public static void main(String[] args) {

        GeneradorNumeros g = new GeneradorNumeros(1000);
        QuickSort qs = new QuickSort();

        System.out.println("Arreglo Original: ");
        //g.imprimeNumeros();

        System.out.println("Arreglo Ordenado con QuickSort: ");
        qs.ordenar(g.getNumeros());
        g.imprimeNumeros();

    }
}

