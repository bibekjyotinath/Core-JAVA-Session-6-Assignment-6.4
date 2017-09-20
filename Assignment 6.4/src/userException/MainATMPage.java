package userException;     //Package userException created which holds different class files 

import java.util.*;		//importing java.util package to use Scanner Class

public class MainATMPage {		//creation of main class MainATMPAage which holds the main method of the program

	public static void main(String[] args) {		//main method of the program	
		
		double amount;			//declaration of double type variable
		int choice;				//declaration of integer type variable
		char choice1 = 'n';		//declaration of char type variable
		
		Scanner sc = new Scanner(System.in);		//creating object of scanner class 
		BankATM atm = new BankATM();				//creating object of BankATM class
		
		do {																//do-while loop it will run atleast once during the execution of the program
			System.out.println("************ SBI ATM **************");		//prints the message on screen
			System.out.println(" 1. Withdraw Money ");						//prints the message on screen
			System.out.println(" 2. Deposite Money ");						//prints the message on screen
			System.out.println(" 3. Check Balance ");						//prints the message on screen
			System.out.println(" 4. Exit ");									//prints the message on screen
			System.out.println(" Enter your choice: ");						//prints the message on screen
			choice = sc.nextInt();											//takes i/p from user and stores it in choice variable
			switch(choice) {													//switch case which runs on the users input
				case 1: 														//if user opts 1 option this portion of the code will be executed
					System.out.println("Enter Amount you want to Withdraw: ");  //prints message on console
					amount = sc.nextDouble();								//takes i/p from user and stores it in amount variable 
					try {													//try block is used if there is a chance of when the system may face an exception and the code is written inside this block
					atm.withdraw(amount);									//calling of method withdraw and passing the parameter to the method using the object of BankATM class
					}
					catch(BankATMException e) {								//catch block catches the error and handles the error
						System.out.println("Sorry Amount cannot be transacted \n you have "+e.getAmount()+" in your account");    //prints message on console and prints value from getAmount method on the scren
					}
					break;															//break statement returns the controller out of this block
				case 2: 																//if user opts 2 option this portion of the code will be executed	
					System.out.println("Enter Amount you want to Deposite: ");		//prints message on console
					amount = sc.nextDouble();									//takes i/p from user and stores it in amount variable
					atm.deposite(amount);										//calling of method deposite and passing the parameter to the method using the object of BankATM class
					break;														//break statement returns the controller out of this block
				case 3:															//if user opts 3 option this portion of the code will be executed
					atm.display();												//calling of method display using the object of BankATM class
					break;														//break statement returns the controller out of this block
				case 4:															//if user opts 4 option this portion of the code will be executed
					System.exit(0);												//exit method is used to come out of the program
				default: System.out.println("Please enter correct choice!!");		//prints the default message if the user chooses the option which is not present here
			}
			System.out.println("Do you want to continue (y/n): ");				//prints message on console
			choice1 = sc.next().charAt(0);										//takes i/p from the user (1st character) and stores it in choice1 variable
		}while(choice1=='y'||choice1=='Y');										//while condition check the condition and then acts upon the condition 		
		sc.close();																//closing of scanner class
	}

}
