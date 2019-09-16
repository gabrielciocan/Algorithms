package org.fasttrackit;

import java.time.LocalDate;
import java.util.Scanner;

public class RetirementCalculator {

    public void calculateRetirementAge(){
        System.out.println("What is your current age?");
        Scanner scanner = new Scanner(System.in);
        int currentAge = scanner.nextInt();
        System.out.println("At what age would you like to retire?");
        int retiringAge = scanner.nextInt();
        int remainingYears = retiringAge - currentAge;
        LocalDate date = LocalDate.now();
        int currentYear = date.getYear();
        if(remainingYears < 0){
            System.out.println("You can already retire!");
        }
        else{
            System.out.println("You have " + (retiringAge - currentAge) + " years left until you can retire.\n" + "It's " + currentYear + ", so you can retire in " + (currentYear + remainingYears)+".");

        }
    }
}
