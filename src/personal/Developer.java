package personal;

public class Developer {

    String name;
    int ID;
    String jobTitle;
    int salary;

    static boolean canCode;

    public Developer(String name, int ID){
        this.name = name;
        this.ID = ID;

    }

    public Developer(String name, int ID, String jobTitle, int salary){

        this(name, ID);
        this.jobTitle = jobTitle;
        this.salary = salary;

    }

    public void coding(){
        System.out.println(name + " is coding");
    }

    public void fixingBug(){
        System.out.println(name + " is fixing a bug");
    }

    static {
        canCode = true;
    }

    @Override
    public String toString() {
        return "Developer{" +
                "name='" + name + '\'' +
                ", ID=" + ID +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary=" + salary +
                '}';
    }
}
