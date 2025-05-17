package com.proyecto.algoritmos.util;

public class MensajeSecreto {

    // Método que devuelve un mensaje secreto basado en la clave mágica
    public static String asociarMensaje(int clave) {
        switch (clave) {
            case 1234:
                return "El portal al reino sumergido se abrirá cuando el sol cruce la cima del monte hueco.";
            case 5678:
                return "Bajo la tercera luna de piedra, encontrarás la biblioteca olvidada del conocimiento prohibido.";
            case 9876:
                return "El mapa del tesoro está oculto en la última página del códice rojo, sellado por el sabio Alerion.";
            default:
                return "Clave incorrecta. No hay mensaje disponible.";
        }
    }
}

