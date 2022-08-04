package com.cg.LamExp;
interface D
{
	int add(int a,int b);
}

public class LambdaExpresssion {

	public static void main(String[] args) {
		D obj=(int a,int b)->(a*b);
		System.out.println("Multiplication od A and B is:"+obj.add(12,14));
		
	}

}
