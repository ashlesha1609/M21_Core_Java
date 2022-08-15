package com.cg.client;

import com.cg.Application.MMBankFactory;
import com.cg.Application.MMCurrentAcc;
import com.cg.Application.MMSavingAcc;
import com.cg.Framework.BankFactory;
import com.cg.Framework.CurrentAcc;
import com.cg.Framework.SavingAcc;

public class Client
{
	public static void main(String[]args){
		BankFactory b = new MMBankFactory();
		SavingAcc s = new MMSavingAcc(131,"Ashlesha H",54280,true);
		CurrentAcc c = new MMCurrentAcc(141,"Ashvini s",78150,40000);
		s.withdraw(10000);
		c.withdraw(20000);
		System.out.println(s);
		System.out.println(c);
	}
}
                                           







/*
import com.cg.application1.MMCurrentAcc;
import com.cg.application1.MMSavingAcc;
import com.cg.framework1.BankFactory;
import com.cg.framework1.CurrentAcc;
import com.cg.framework1.SavingAcc;

public class Client1 {

	public static void main(String[] args) {
		@SuppressWarnings("unused")
		BankFactory b = new MMBankFactory();
		SavingAcc s = new MMSavingAcc(131,"Ashlesha H",54280,true);
		CurrentAcc c = new MMCurrentAcc(141,"Ashvini s",78150,40000);
		s.withdraw(10000);
		c.withdraw(20000);
		System.out.println(s);
		System.out.println(c);
	}
}
*/