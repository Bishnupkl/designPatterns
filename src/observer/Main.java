package observer;

public class Main {
    public static void main(String[] args) {
        JobSeeker bishnuPokhrel = new JobSeeker("Bishnu Pokhrel");
        JobSeeker suluPoudel = new JobSeeker("Sulu Poudel");

        EmploymentAgency agency = new EmploymentAgency();
        agency.attach(bishnuPokhrel);
        agency.attach(suluPoudel);
//        agency.detach(suluPoudel);

        agency.addJob(new JobPost("Software Engineer"));
    }
}
