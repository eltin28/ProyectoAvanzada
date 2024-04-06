package com.demo.exception;

public class ArchivoException {
    public class ArchivoNoEncontradoException extends Exception {
        public ArchivoNoEncontradoException(String message) {
            super(message);
        }
    }

    public class PermisoDenegadoException extends Exception {
        public PermisoDenegadoException(String message) {
            super(message);
        }
    }

    public class ArchivoCorruptoException extends Exception {
        public ArchivoCorruptoException(String message) {
            super(message);
        }
    }

    public class OperacionArchivoException extends Exception {
        public OperacionArchivoException(String message) {
            super(message);
        }
    }
}
