package userException;   //Package userException created which holds different class files 

public class BankATM {    //creation of class BankATM 
	
	final int atmID = 123;     //declaration of final integer type variable
	final String bankName = "State Bank of India", location = "Gateway of India";		//declaration of final String type variable
	double balance = 20000;			//declaration of double type variable
	
	
	public void withdraw(double amt) throws BankATMException {   //method withdraw is created which throws BankATMException (UserDefined)
		if(balance <= 10000 || amt >= balance)			//condition checks if balance is less than 10000 or amount is grater than balance
	      {
	         throw new BankATMException(balance);		//throw the exception (User Defined)
	      }
	      else		
	      {
	    	     balance =  balance - amt;		//if condition fails deduct the amount from balance and store the new balance in balance variable	
	      }
    }
	
	public void deposite(double amt) {			//method deposite which will deposite amount in the account
		
		balance = balance + amt;									//adds the amount from balance and store the new balance in balance variable	
		System.out.println("Amount Depositted Successfully!");	//prints message on console
		System.out.println("Current Balance: " +balance);			//displays the balance on console
	}
	public void display() {				//display method is created
		
		System.out.println("Atm ID: " +atmID+ "\t\t Bank: "+bankName+ " "+location);   //prints message on console
		System.out.println();							//creates a new line on console (blank line)
		System.out.println("Current Balance: " +balance);		//prints message on console (balance)
	}
}

