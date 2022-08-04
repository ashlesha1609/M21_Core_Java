package com.cg.LamExp;
interface E
{
	String show(String str1,String str2);
}

public class LambdaExp {

	public static void main(String[] args) {
		E obj=(String str1, String str2)->
		{
			return str1+str2;
		};
		System.out.println("Strings are: "+obj.show("Ashlesha", "Ashvini"));

	}

}
