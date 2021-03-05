import java.util.ArrayList;
import java.util.List;

public class Plan {

    public static final int MIN_BEATS = 90;
    public static final int MAX_BEATS = 160;

    private long number;
    private char type;
    private List<Week> weeks;

    public Plan(long number) {
        this.number = number;
        this.weeks= new ArrayList<>();
    }

    public void addWeek(Week week) { this.weeks.add(week); }

    public long  getNumber() {return number:}

    public char getType() {
        return type;
    }


    public double averageBeats() {
        double wab = 0;
        for (Week w: this.weeks)
            wab =+ w.averageBeats();

        return this.weeks.size() == 0 ? 0 : wab / this.weeks.size();
    }
}
