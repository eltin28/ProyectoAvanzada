package com.demo.exception;

public class SolicitudException {
    public class SolicitudInvalidaException extends Exception {
        public SolicitudInvalidaException(String message) {
            super(message);
        }
    }

    public class SolicitudRepetidaException extends Exception {
        public SolicitudRepetidaException(String message) {
            super(message);
        }
    }

    public class SolicitudNoEncontradaException extends Exception {
        public SolicitudNoEncontradaException(String message) {
            super(message);
        }
    }

    public class SolicitudNoProcesadaException extends Exception {
        public SolicitudNoProcesadaException(String message) {
            super(message);
        }
    }

    public class SolicitudCanceladaException extends Exception {
        public SolicitudCanceladaException(String message) {
            super(message);
        }
    }
}
