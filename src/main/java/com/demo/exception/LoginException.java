package com.demo.exception;

public class LoginException {
    public class CredencialesIncorrectasException extends Exception {
        public CredencialesIncorrectasException(String message) {
            super(message);
        }
    }

    public class UsuarioBloqueadoException extends Exception {
        public UsuarioBloqueadoException(String message) {
            super(message);
        }
    }

    public class UsuarioNoRegistradoException extends Exception {
        public UsuarioNoRegistradoException(String message) {
            super(message);
        }
    }

    public class SesionExistenteException extends Exception {
        public SesionExistenteException(String message) {
            super(message);
        }
    }

    public class AutenticacionException extends Exception {
        public AutenticacionException(String message) {
            super(message);
        }
    }
}
