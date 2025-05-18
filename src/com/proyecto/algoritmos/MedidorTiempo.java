package com.proyecto.algoritmos;

public class MedidorTiempo {

    //tiempo de ejecucion del codigo

    public long medirTiempo(Runnable algoritmo) {

        long inicio = System.nanoTime();
        algoritmo.run();
        long fin = System.nanoTime();
        return fin - inicio;

        }
}
