package RecuPrimerParcial.Rec1_22_01.Ej2;

import java.time.LocalDate;

public class Departure {
    String id;
    LocalDate date;
    Departure(String id, LocalDate date) {
        this.id=id;
        this.date=date;
    }
    @Override
    public String toString() {
        return "(" + id + ", " + date + ")";
    }

    public LocalDate getDate() {
        return date;
    }

    public String getId() {
        return id;
    }
}
