package exercise02;

import static org.junit.Assert.*;

import org.junit.Test;

public class AccountTest {

	@Test
	public void testAll() {
		Account currentAccount = new Account(1122, 100, "George");
		currentAccount.setAnnualInterestRate(1.5);
		currentAccount.deposit(30, "from mom");
		currentAccount.deposit(40, "from girlfriend");
		currentAccount.deposit(50, "from ex-girlfriend");
		currentAccount.withdraw(5, "donation to red cross");
		currentAccount.withdraw(4, "coffee");
		currentAccount.withdraw(2, "candy");
		
		//print the id, balance, annualInterestRate, Date created for the current account using the system.out.println statement
//		System.out.println("Account ID = " + currentAccount.getId());
//		System.out.println("Account Balance = " + currentAccount.getBalance());
//		System.out.println("Account Annual Interest Rate = " + currentAccount.getAnnualInterestRate());
//		System.out.println("Account Date created = " + currentAccount.getDateCreated());
//		System.out.println("Account Name = " + currentAccount.getName());
//		
//		//print all the transactions for the current account
//		
//		for(Transaction currentTransaction : currentAccount.getTransactions())
//		{
//			System.out.println("Tranaction date = " + currentTransaction.getDate()); 
//			System.out.println("Tranaction type = " + currentTransaction.getType());
//			System.out.println("Tranaction amount = " + currentTransaction.getAmount());
//			System.out.println("Tranaction balance = " + currentTransaction.getBalance());
//			System.out.println("Tranaction description = " + currentTransaction.getDescription());
//		}
		
		System.out.println(currentAccount);
		
		
		// check the account holder name "George"
			assertEquals("George", currentAccount.getName());
		// check the interest rate is 1.5
			assertEquals(1.5, currentAccount.getAnnualInterestRate(),0);
		// check the balance is 100+120-11 = 209
			assertEquals(209, currentAccount.getBalance(),0);
		// check the number of transaction is 6
			assertEquals(6, currentAccount.getTransactions().size(),0);
		// check all 3 withdraw transaction
			Transaction transaction1 = currentAccount.getTransactions().get(0);
			assertEquals(30, transaction1.getAmount(), 0);
		// check all 3 deposit transaction
	}

}
