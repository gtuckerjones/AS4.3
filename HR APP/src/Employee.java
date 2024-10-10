import java.time.Period;

public class Employee {
    //properties
    private String name;
    private Job[] jobHistory;
    private int jobCount;
    
    //constructor
    public Employee(String name, int jobHistory) {
        this.name = name;
        this.jobHistory = new Job[jobHistory]; 
        this.jobCount = 0; 
    }
    
    //adds the amount of jobs into the array
    public void addJob(Job job) {
        if (jobCount < jobHistory.length) {
            jobHistory[jobCount] = job; 
            jobCount++; 
        } else {
            System.out.println("Job history is full. Cannot add more jobs.");
        }
    }

    //goes through the array and displays everyjob in the array
    public void displayJobHistory() {
        for (int i = 0; i < jobCount; i++) {
            System.out.println("//////////////");
            System.out.println("Job details:");
            jobHistory[i].displayJobDetails();
            System.out.println("Job Satisfaction:");
            jobHistory[i].assessJobSatisfaction();
        }
    }
   
    //adds up all of the years of experience
    public int getTotalExperience() {
        int totalYears = 0;
        for (int i = 0; i < jobCount; i++) {
            Period duration = jobHistory[i].calculatingJobDuration();
            totalYears += duration.getYears();
        }
        return totalYears;
    }
}
