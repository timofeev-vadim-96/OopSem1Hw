import java.time.LocalDate;

public class Date {
    int year;
    int month;
    int date;

    public Date(int date, int month, int year) {
        this.year = year;
        this.month = month;
        this.date = date;
    }
    public Date() {
        this.year = LocalDate.now().getYear();
        this.month = LocalDate.now().getMonthValue();
        this.date = LocalDate.now().getDayOfMonth();
    }

    @Override
    public String toString() {
        return String.format("(%s, %s, %s)", date, month, year + "г.");
    }

}
