package mavenwebapp;

import junit.framework.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestBankAccount {
	@Test
	public void testDebitWithSufficientFund(){
		BankAccount bank = new BankAccount(10);
		double amount = bank.debit(5);
		Assert.assertEquals(5.0,amount);
	}
}