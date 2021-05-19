package org.sid.exception;

public class EtudiantNotFoundException extends RuntimeException{
    public EtudiantNotFoundException(String message){
        super(message);
    }
}