package userException;     //Package userException created which holds different class files 

public class BankATMException extends Exception {    //class BankATMException created which extends Eception class (Creating userdefine Exception class)
		 
	private double amount;			//declaration of double type variable
	public BankATMException(double amount)		//constructor created
	{	
		this.amount = amount;		//assigns the value of amount to amount using this keyword
	} 
	public double getAmount()		//getAmount method created
	{	
		return amount;         //returns the value of amount
	} 
}
