package day45_custom_constructors;

public class Employee {

    String name;
    int id;
    String jobTitle;
    double salary;

    public Employee(String inputName, int idNum, String title, int income){
        name = inputName;
        id = idNum;
        jobTitle = title;
        salary = income;
    }

    public void goToMeeting(){
        System.out.println(name + " is going to the meeting");
    }

    @Override
    public String toString() {
        return "Employee{" +
                "Name: '" + name + '\'' +
                ", Id: " + id +
                ", Job Title: '" + jobTitle + '\'' +
                ", Salary: " + salary +
                '}';
    }

}
