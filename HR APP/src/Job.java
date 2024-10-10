
import java.time.LocalDate;
import java.time.Period;

abstract class Job {
    protected String companyName;
    protected String position;
    protected LocalDate startDate;
    protected LocalDate endDate;

    public abstract void displayJobDetails();
    public abstract Period calculatingJobDuration();
    public abstract void assessJobSatisfaction();

    
}
