package day11_if_statements;

public class IfPractice {

    public static void main(String[] args) {

        double hourlyRate = 10.5;
        double hoursWorked = 30;
        double netPay;

        String message;

        if (hoursWorked > 40){

            double overTime = hoursWorked - 40;
            netPay = 40 * hourlyRate;
            netPay += overTime * hourlyRate * 1.5; // netPay = netPay + new calc

            message = "You worked " + hoursWorked + " hours, so you got paid for " + overTime + " hours overtime, so your total net pay is: " + netPay;

        }
        else {

            netPay = hoursWorked * hourlyRate;

            message = "You worked " + hoursWorked + " hours, your total net pay is: " + netPay;

        }

        System.out.println(message);
    }


}
