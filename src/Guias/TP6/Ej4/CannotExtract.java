package Guias.TP6.Ej4;

public class CannotExtract extends Exception{
        private static final String MESSAGE = "Can´t Extract";
        CannotExtract(){
            super(MESSAGE);
        }
}
