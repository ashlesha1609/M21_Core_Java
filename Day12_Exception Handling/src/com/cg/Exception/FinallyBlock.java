package com.cg.Exception;

import java.util.Scanner;

public class FinallyBlock {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int x=s.nextInt();
		//if any exception will be there in a try block
		//that exception will handle by catch block
		try
		{
			int res=15/x;
			System.out.println(res);
		}
		catch 
		{
			System.out.println("Exception Handled");
		}
		finally
		{
			System.out.println("Whether any exception occur or not, the finally block is always executed");
		}
		
	}

}
