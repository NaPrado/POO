package Taller3;

public class CannotRideException extends Exception{
    private static final String MESSAGE = "Can´t ride";
    CannotRideException(){
        super(MESSAGE);
    }
}
