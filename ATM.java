import java.util.*;
public class ATM {

	public static void displayBalance(int balance)
	{
		System.out.println("Current Balance : " + balance);
		System.out.println();
	}

	public static int amountWithdrawing(int balance, int withdrawAmount)
	{
		System.out.println("Withdrawn Operation:");
		System.out.println("Withdrawing Amount : " + withdrawAmount);
		if (balance >= withdrawAmount)
		{
			balance = balance - withdrawAmount;
			System.out.println("Please collect your money and collect the card");
			displayBalance(balance);
		}
		else {
			System.out.println("Sorry! Insufficient Funds");
			System.out.println();
		}
		return balance;
	}

	
	public static int amountDepositing(int balance, int depositAmount)
	{
		System.out.println("Deposit Operation:");
		System.out.println("Depositing Amount : " + depositAmount);
		
		balance = balance + depositAmount;
		System.out.println("Your Money has been successfully deposited");
		
		displayBalance(balance);
		return balance;
	}

	public static void main(String args[])
	{
		int balance, withdrawAmount, depositAmount, i;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the balance in the account: ");
        balance = sc.nextInt();

        System.out.println("Enter a number:\n1. To check balance\n2. To withdraw money\n3. To deposit money");
        i = sc.nextInt();
        if(i == 1)
		displayBalance(balance);
		else if(i == 2){
            System.out.println("Enter the amount to withdraw: ");
            withdrawAmount = sc.nextInt();
            balance	= amountWithdrawing(balance, withdrawAmount);
        }
        else if(i == 3){
            System.out.println("Enter the amount to deposit: ");
            depositAmount = sc.nextInt();
            balance = amountDepositing(balance, depositAmount);
        }
        else
        System.out.println("Enter a valid number");
    }
}
