package com.demo.exception;

public class ComentarioException {
    public class ComentarioNotFoundException extends Exception {
        public ComentarioNotFoundException(String message) {
            super(message);
        }
    }

    public class ComentarioCreationException extends Exception {
        public ComentarioCreationException(String message) {
            super(message);
        }
    }

    public class ComentarioUpdateException extends Exception {
        public ComentarioUpdateException(String message) {
            super(message);
        }
    }

    public class ComentarioDeleteException extends Exception {
        public ComentarioDeleteException(String message) {
            super(message);
        }
    }

    public class ComentarioValidationException extends Exception {
        public ComentarioValidationException(String message) {
            super(message);
        }
    }

    public class ComentarioAuthorizationException extends Exception {
        public ComentarioAuthorizationException(String message) {
            super(message);
        }
    }
}
