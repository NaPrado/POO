package RecuPrimerParcial.Rec1_23_01.Ej3;

public class CannotRideBikeException extends RuntimeException {
    private static final String MSG="Cannot Ride Bike";
    public CannotRideBikeException() {
        super(MSG);
    }
}
