package TP3.Ej7;

public class CannotExtract extends Exception{
        private static final String MESSAGE = "Can´t Extract";
        CannotExtract(){
            super(MESSAGE);
        }
}
