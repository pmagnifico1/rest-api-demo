package com.spring.spring_rest.exception;

public class StudentNotFoundException extends RuntimeException {

    private static final long serialVersionUID = 2690100846087976236L;

    public StudentNotFoundException(String message, Throwable cause) {
        super(message, cause);
        // TODO Auto-generated constructor stub
    }

    public StudentNotFoundException(String message) {
        super(message);
    }

    public StudentNotFoundException(Throwable cause) {
        super(cause);
        // TODO Auto-generated constructor stub
    }
}