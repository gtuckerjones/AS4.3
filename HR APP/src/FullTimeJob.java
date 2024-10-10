
import java.time.LocalDate;
import java.time.Period;


public class FullTimeJob extends Job {

    //additional properties
    private double salary;
    private double weeklyHours;

    //constructor 
    public FullTimeJob(String companyName, String position, LocalDate startDate, LocalDate endDate, double salary, double weeklyHours) {
        this.companyName = companyName;
        this.position = position;
        this.startDate = startDate;
        this.endDate = endDate;
        this.salary = salary;
        this.weeklyHours = weeklyHours;
    }

    // displays name of company and employees position
    //displays the job duration
    //displays salary hours and job satisfaction
    public void displayJobDetails() {
        Period j = calculatingJobDuration();
        System.out.println("Company: " + companyName);
        System.out.println("Position: " + position);
        System.out.println("Employees weekly hours: " + weeklyHours);
        System.out.println("Employee Salary: $" + salary);
        System.out.println("Time spent at Job: " + j.getYears() + " years " + j.getMonths() + " month " + j.getDays() + " days ");
    }

    //displays employees start date and last day the employee worked
    public Period calculatingJobDuration() {
        return Period.between(startDate, endDate);
    }

    //outputs employee satisfaction based on hours and pay
    public void assessJobSatisfaction() {
        String pay = evaluateSalary();
        String hours = benefits();

        if (pay.equals("Good") && hours.equals("Low")) {

            System.out.println("Very High job satisfaction: Good pay and lots of free time");

        } else if (pay.equals("Good") && hours.equals("High")) {

            System.out.println("Moderate job satisfaction: Good pay but low amounts of free time");

        } else if (pay.equals("Good") && hours.equals("Average")) {

            System.out.println("High job satisfaction: average amount of free time and high pay");

        } else if (pay.equals("Bad") && hours.equals("Low")) {

            System.out.println("Moderate job satisfaction: high amount of free time but Bad pay");

        } else if (pay.equals("Bad") && hours.equals("High")) {

            System.out.println("Very Low job satisfaction: low amount of free time and low pay");

        } else if (pay.equals("Bad") && hours.equals("Average")) {

            System.out.println("Low job satisfaction: average amount of free time and low pay");

        } else if (pay.equals("Okay") && hours.equals("Low")) {

            System.out.println("Moderate job satisfaction: high amount of free time and okay pay");

        } else if (pay.equals("Okay") && hours.equals("High")) {

            System.out.println("Low job satisfaction: low amount of free time and moderate pay");

        } else {

            System.out.println("Moderate job satisfaction: moderate pay and average amount of free time");
        }
        
    }

    //outputs if the jobs pay is good
    public String evaluateSalary() {
        if (salary > 40000 && salary < 70000) {
            return "Okay";
        } else if (salary >= 70000) {
            return "Good";
        } else {
            return "Bad";
        }
    }

    //outputs if the hours are good
    public String benefits() {
        if (weeklyHours == 40) {
            return "Average";
        } else if (weeklyHours > 40) {
            return "High";
        } else {
            return "Low";
        }
    }

}
