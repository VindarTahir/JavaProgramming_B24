package day46_constructors;

import com.sun.prism.shader.AlphaOne_Color_AlphaTest_Loader;

public class Offer {

    String location;
    String company;
    double salary;
    boolean isFullTime;
    int numberOfPTO;

    public Offer(String company, double salary, boolean isFullTime){    // Overloaded
        this.company = company;
        this.salary = salary;
        this.isFullTime = isFullTime;
    }

    public Offer(String location, String company, double salary, boolean isFullTime, int numberOfPTO){

        this.location = location;
        this.company =  company;
        this.salary = salary;
        this.isFullTime = isFullTime;
        this.numberOfPTO = numberOfPTO;
    }

    @Override
    public String toString() {
        return "Offer{" +
                "location='" + location + '\'' +
                ", company='" + company + '\'' +
                ", salary=" + salary +
                ", isFullTime=" + isFullTime +
                ", numberOfPTO=" + numberOfPTO +
                '}';
    }

    public static void main(String[] args) {

        Offer offer = new Offer("California", "CyberTek", 132_000, true, 50);
        System.out.println(offer);

    }
}
