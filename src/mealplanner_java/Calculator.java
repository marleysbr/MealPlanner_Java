/* Author - Marlan Cardoso | marleysbr@gmail.com */

package mealplanner_java;

public class Calculator {
    public int age;
    public boolean gender;
    public double metricHeight;
    public double imperialHeight;
    public double metricWeight;
    public double imperialWeight;
    public int activityNumber;
    public String activityLevel;
    public String[] activityLevelString = {"Null", "Sedentary", "Lightly Active", "Moderately Active", "Very Active", "Extra Active"};
    
    //Constructor
    public Calculator(int age, boolean gender, double metricHeight, double imperialHeight, double metricWeight, 
            double imperialWeight, int activityNumber) {
        this.age = age;
        this.gender = gender;
        this.metricHeight = metricHeight;
        this.imperialHeight = imperialHeight;
        this.metricWeight = metricWeight;
        this.imperialWeight = imperialWeight;
        this.activityNumber = activityNumber;
        //match Activity Level choosen by user to Array value
        for(int i = 0; i < activityLevelString.length; i++) {
            if(activityNumber == i) {
                activityLevel = activityLevelString[i];
            }
        }
    }
    
    //displays values selected by user
    public void showValues(){
        System.out.println("Age: " +age+ "\nMetric Height: " +metricHeight+
                "\nImperial Height: " +imperialHeight+ "\nMetric Weight: " +metricWeight+
                "\nImperial Weight: " +imperialWeight+ "\nActivity Level: " +activityLevel);
    }
    
}
