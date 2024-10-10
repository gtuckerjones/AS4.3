
import java.time.LocalDate;
import java.time.Period;


public class PartTimeJob extends Job {

    //additional properties
    private double wage;
    private int weekDaysWorked;

    //constructor 
    public PartTimeJob(String companyName, String position, LocalDate startDate, LocalDate endDate, double wage, int weekDaysWorked) {
        this.companyName = companyName;
        this.position = position;
        this.startDate = startDate;
        this.endDate = endDate;
        this.wage = wage;
        this.weekDaysWorked = weekDaysWorked;
    }

    //displays all of the jobs information
    public void displayJobDetails() {
        Period j = calculatingJobDuration();
        System.out.println("Company: " + companyName);
        System.out.println("Position: " + position);
        System.out.println("Hourly wage: $" + wage);
        System.out.println("Number of days worked in a week: " + weekDaysWorked);
        System.out.println("Time spent at Job: " + j.getYears() + " years " + j.getMonths() + " month " + j.getDays() + " days ");
    }

    //displays when the employee first and last worked
    public Period calculatingJobDuration() {
        return Period.between(startDate, endDate);
    }

    //asses if the job is good for someone looking for a part time job
    public void assessJobSatisfaction() {
        String flex = Flexibility();
        String pay = evaluateWage();

        if (flex.equals("Good") && pay.equals("Good")) {

            System.out.print("Very good part time job");

        } else if (flex.equals("Good") && pay.equals("Okay")) {

            System.out.print("Good part time job");

        } else if (flex.equals("Bad") && pay.equals("Bad")) {

            System.out.print("Very Bad part time job");

        } else if (flex.equals("Bad") && pay.equals("Okay")) {

            System.out.print("Bad part time job");

        } else {

            System.out.print("Okay part time job");
        }

    }

    //decides if the job allows a good amount of days off for a part time job
    public String Flexibility() {
        if (weekDaysWorked < 5) {
            return "Good";
        } else {
            return "Bad";
        }
    }

    //decides if teh jobs wage is good
    public String evaluateWage() {
        if (wage > 11.0 && wage < 14.0) {
            return "Okay";
        } else if (wage >= 14.0) {
            return "Good";
        } else {
            return "Bad";
        }
    }

}
