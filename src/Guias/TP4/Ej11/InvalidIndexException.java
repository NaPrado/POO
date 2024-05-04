package Guias.TP4.Ej11;

public class InvalidIndexException extends Exception{
    InvalidIndexException(){
        super("Index out of bounds");
    }
}
