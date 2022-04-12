package day05_variables;

public class SalaryCalculator {

    public static void main(String[] args) {

        /*
        variables: salary, stateTaxRate, federalTaxRate,  stateTax, federalTax, totalTax, salaryAfterTax
                100000    0.08         0.21

         */

        int salary = 112_000;
        double stateTaxRate = 0.08, federalTaxRate = 0.21;

        double stateTax = salary * stateTaxRate;
        double federalTax = salary * federalTaxRate;
        double totalTax = federalTax + stateTax;
        double salaryAfterTax = salary - totalTax;

        System.out.println("Your total salary after Federal and State tax is: " + salaryAfterTax);
        System.out.println("State Tax: " + stateTax);
        System.out.println("Federal Tax: " + federalTax);
        System.out.println("Total Tax: " + totalTax);





    }


}
