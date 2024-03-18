package Model;

public class Mechanic extends User{
    public void cancelWork(int jobID){
        System.out.println("Cancel job.");

    }
    public boolean acceptWork(int jobID){
        return true;
    }
    public void browseJobs(){
        System.out.println("Browse jobs that are available.");

    }
    public void viewJobHistory(){
        System.out.println("View your job history.");

    }
}
