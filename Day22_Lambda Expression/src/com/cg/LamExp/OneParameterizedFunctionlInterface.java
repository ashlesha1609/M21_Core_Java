package com.cg.LamExp;

interface B
{
	String print(String str);
}
public class OneParameterizedFunctionlInterface {

	public static void main(String[] args) {
		B obj=(String str)->
		{
			return str;
		};
		System.out.println(obj.print("Lambda Expression"));

	}

}
