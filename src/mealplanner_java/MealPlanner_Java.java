/* Author - Marlan Cardoso | marleysbr@gmail.com */

package mealplanner_java;

import java.util.Scanner;

public class MealPlanner_Java {
    
    public static void main(String[] args) {
       
        Scanner scan = new Scanner(System.in);
        int age;
        boolean genderBoolean;
        String gender;
        double metricHeight;
        double imperialHeight;
        double metricWeight;
        double imperialWeight;
        int activityNumber;
        
        System.out.println("### Welcome to Fitness Calculator and Planner ### "
                + "\n-------------------------------------------------");
        System.out.println("Please enter the following values:");
        System.out.print("Age: \t\t\t\t\t"); age = scan.nextInt();
        System.out.print("Gender (please enter male or female): \t"); gender = scan.next();
        System.out.print("Height (Metrics - cm): \t"); metricHeight = scan.nextDouble();
        System.out.print("Height (Imper - foot/inches): \t"); imperialHeight = scan.nextDouble();
        System.out.print("Weight (Metric - kg): \t"); metricWeight = scan.nextDouble();
        System.out.print("Weight (Imper - pounds): \t"); imperialWeight = scan.nextDouble();
        System.out.print("Activity Level: \t"); activityNumber = scan.nextInt();
      
        if(gender.equals("male"))
            genderBoolean = true;
        else
            genderBoolean = false;
        
        Calculator ctr = new Calculator(age, genderBoolean, metricHeight, imperialHeight, metricWeight, imperialWeight, activityNumber);
        ctr.showValues();
        
    }
    
}