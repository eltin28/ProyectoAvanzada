package com.demo.exception;

public class ConexionException {
    public static class ConexionFallidaException extends Exception {
        public ConexionFallidaException(String message) {
            super(message);
        }
    }

    public static class TiempoEsperaExcedidoException extends Exception {
        public TiempoEsperaExcedidoException(String message) {
            super(message);
        }
    }

    
}
