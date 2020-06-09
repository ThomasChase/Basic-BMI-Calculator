/*
 * Created by Thomas Chase
 * Created on June 04,2020
 * This program will get a users height and weight and calculate their BMI and compare it to health guidelines
 */

import java.util.Scanner;

public class BmiCalculator {

	public static void main(String[] args) {
		// Create a new scanner object for getting input from the window
		Scanner input = new Scanner(System.in);
		
		//Variable declaration
		double weight = 0;
		double height  =0;
		double bmi = 0;
		
		//User interaction
		System.out.println("Welcome to the BMI calculator!%n");
		System.out.println("Please enter your weight in pounds: ");
		weight = input.nextDouble();
		System.out.println("%nPlease enter your height in inchs: ");
		height = input.nextDouble();
		
		//Verify inputs are valid and calculate the BMI
		if((height != 0) && (weight != 0)) {
			bmi = ((weight * 703) / (height * height));
		}else {
			System.out.println("One or more peremeters is 0 or was not entered!%n");
		}
		
		//Output info to the user
		System.out.printf("%nYour BMI is: %.2f%n", bmi);
		
		//Compare to Department of health and human services 
		if(bmi != 0) {	//verify there is a BMI to compare to
			if(bmi < 18.5) {
				System.out.printf("Based on your BMI of %.2f, you are considered underweight.",bmi);
			}else if((bmi >=18.5) && (bmi <= 24.9)) {
				System.out.printf("Based on your BMI of %.2f, you are considered a normal weight.",bmi);
			}else if((bmi >= 25) && (bmi <= 29.9)) {
				System.out.printf("Based on your BMI of %.2f, you are considered overweight.",bmi);
			}else if(bmi >= 30) {
				System.out.printf("Based on your BMI of %.2f, you are considered obese.",bmi);
			}
		}
	}
}
