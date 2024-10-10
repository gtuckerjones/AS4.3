
import java.time.LocalDate;
import java.time.Period;


public class ContractJob extends Job {

    //additional propperties
    private double contractPay;

    //constructor 
    public ContractJob(String companyName, String position, LocalDate startDate, LocalDate endDate, double contractPay) {
        this.companyName = companyName;
        this.position = position;
        this.startDate = startDate;
        this.endDate = endDate;
        this.contractPay = contractPay;
        
    }

    //displays all of the job information
    public void displayJobDetails() {
        Period j = calculatingJobDuration();
        System.out.println("Company: " + companyName);
        System.out.println("Position: " + position);
        System.out.println("Number of weeks on contract: " + calculateWeeks());
        System.out.println("Weekly pay: $" + contractPay);
        System.out.println("Time spent at Job: " + j.getYears() + " years " + j.getMonths() + " month " + j.getDays() + " days ");
    }

    //shows start and end date of contract
    public Period calculatingJobDuration() {
        return Period.between(startDate, endDate);
    }

    //takes into detail of contract length and pay and out puts satisfaction
    public void assessJobSatisfaction() {
        String w = assessContractLength();
        String a = assessContractAmount();

        if (w.equals("Good") && a.equals("Good")) {

            System.out.print("Good Contract");

        } else if (w.equals("Long") && a.equals("Good")) {

            System.out.print("Long contract and good pay");

        } else if (w.equals("Short") && a.equals("Good")) {

            System.out.print("Short contract and good pay");

        } else if (w.equals("Long") && a.equals("Bad")) {

            System.out.print("Long contract and bad pay");

        } else if (w.equals("Short") && a.equals("Bad")) {

            System.out.print("Short contract and bad pay");

        } else {

            System.out.print("Good contract and bad pay");
        }

    }

    //evaluates the length of the contract
    public String assessContractLength() {
        if (calculateWeeks() > 12 && calculateWeeks() < 52) {
            return "Good";
        } else if (calculateWeeks() > 52) {
            return "Long";
        } else {
            return "Short";
        }
    }

    //evalutes the pay of the contract
    public String assessContractAmount() {
        if (contractPay > 750) {
            return "Good";
        } else {
            return "Bad";
        }
    }

    //takes the job duration method and uses it to calculate how many weeks are on the contract
    public int calculateWeeks()
    {
        Period time = calculatingJobDuration();
        return time.getYears() * 52 + time.getMonths() * 4 + time.getDays() / 7;
    }

}
