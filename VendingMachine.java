
/*
@author Maryna Yesakova
 */
import java.util.Scanner;

public class VendingMachine 
{
    public static void main(String[] args) 
    {   
        int itemPrice;// hold the price of item
        
        // create scanner object to read input 
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter price of the item from 25 cents to a dollar in 5-cent increments ");
        itemPrice = keyboard.nextInt(); //input the price of item
        System.out.println("You bought an item for " + itemPrice + " cents and gave me a dollar, \nSo your change is");
       
        final int MAX_BILL = 100; // hold 100 cents which is max bill
        int change; // hold the change from 1 dollar
        
        //calculate the change
        change = MAX_BILL - itemPrice;
        
        final int QUARTER = 25;// hold the constant of quarter
        final int DIME = 10;// hold the constant of dime
        final int NICKEL = 5;// hold the constant of nickel
        
        //calculate how many coints shoud you recive from the machine
        int countQuarter = change / QUARTER;
        System.out.println(countQuarter + " quarters");//output number of quarters should the machine give the client
        change = change - countQuarter * QUARTER;
        int countDime = change / DIME;
        System.out.println(countDime + " dimes, and");//output number of dimes should the machine give the client
        change = change - countDime * DIME;
        int countNickel = change / NICKEL;
        System.out.println(countNickel + " nickels.");//output number of nickels should the machine give the client             
    } //end of main
} // end of class VendingMachine
