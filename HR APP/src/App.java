
import java.time.LocalDate;


public class App {

    public static void main(String[] args) throws Exception {

        //creates an instance of the employee class
        Employee employee = new Employee("Alice", 5);

        FullTimeJob ft = new FullTimeJob("Google", "engineer", LocalDate.of(2017, 06, 26), LocalDate.of(2020, 10, 1), 80000, 52);
        PartTimeJob pt = new PartTimeJob("Walmart", "Cashier", LocalDate.of(2022, 06, 1), LocalDate.of(2024, 1, 26), 13.25,3);
        ContractJob ct = new ContractJob("Bob's Construction", "Contractor", LocalDate.of(2025, 05, 13), LocalDate.of(2026, 2, 13), 800.0);
        
        

        employee.addJob(ft);
        employee.addJob(pt);
        employee.addJob(ct);
        
        // Display employee's job history and total experice
        employee.displayJobHistory();
    }

}
