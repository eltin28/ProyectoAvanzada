package com.demo.exception;

public class SolicitudException {



    public static class SolicitudNoEncontradaException extends Exception {
        public SolicitudNoEncontradaException(String message) {
            super(message);
        }
    }


}
