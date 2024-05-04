package Guias.TP4.Ej9;

public class CannotExtract extends Exception{
        private static final String MESSAGE = "Can´t Extract";
        CannotExtract(){
            super(MESSAGE);
        }
}
