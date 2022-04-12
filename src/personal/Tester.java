package personal;

public class Tester {

    private String name;
    private int ID;
    private String jobTitle;
    private double salary;

    public Tester(String name, int ID, String jobTitle, double salary) {
        this.name = name;
        this.ID = ID;
        this.jobTitle = jobTitle;
        this.salary = salary;
    }

    public Tester(String name, int ID) {
        this.name = name;
        this.ID = ID;
    }

    public void smokeTesting(){

        System.out.println(name + " is currently smoke testing");

    }

    public void creatingTicket(){

        System.out.println(name + " with ID number " + ID + " is currently creating a ticket");

    }

    @Override
    public String toString() {
        return "Tester{" +
                "name='" + name + '\'' +
                ", ID=" + ID +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary=" + salary +
                '}';
    }
}
