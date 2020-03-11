package com.lesson4;

/*
SimpleCalculator -- define an instantiable class to perform arithmetic operations
This example shows how to declare an instantiable class, and in particular:
-- how to declare instance variables/ fields
-- how to declare setter and getter methods corresponding to the instance variables
-- how to declare a method to return a value
*/

//declare instance class
public class SimpleCalculator {
	//declare instance variables
	private double firstNumber;
	private double secondNumber;
	public double result;
	
	//declare action of our processing method
	public void multiply(){
		result = firstNumber * secondNumber;
	}
	
	public void devide(){
		result = firstNumber / secondNumber;
	}
	
	public void display(){
		System.out.println("our first numer: " + firstNumber);
		System.out.println("our second numer: " + secondNumber);
		System.out.println();	
	}
	//declare setter method-to receive a value from the used
	public void setFirstNumber(double number){
		//store the number in the firstNumber of instance variable
		firstNumber = number;
	}
	public void setSecondNumber(double num){
		//store the number in the secondNumber of instance variable
		secondNumber = num;
	}
	
	//getter method for instance variable result, which should retrieve/get the result of computing
	public double getResult(){
		return result;
	}
}
