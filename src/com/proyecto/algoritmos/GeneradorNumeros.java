package com.proyecto.algoritmos;
import java.util.Random;
public class GeneradorNumeros {

    //Arreglo privado, buena encapsulación
    private int [] numeros;


    // Constructor: recibe la cantidad y llena el arreglo con números aleatorios

    public GeneradorNumeros(int cantidad) {
        numeros = new int[cantidad];
        Random r = new Random();

        for (int i = 0; i < cantidad; i++) {
            numeros[i] = r.nextInt(90000) + 10000;
        }

    }

    //Getter para acceder al arreglo desde fuera (buena práctica)

    public int[] getNumeros() {
        return numeros;
    }

    //Método para imprimir el arreglo, 10 por línea

    public void imprimeNumeros() {
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i] + " ");
            if ((i + 1) % 10 == 0) {
                System.out.println();
            }
        }
    }
}
