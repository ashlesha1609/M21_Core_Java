package com.cg.thisKeyword;

public class StaticBlock {
	static int num;
	static String str;
	//static block: if u want to initiate
	static
	{
		num=15;
		str="Ashlesha";
	}

	public static void main(String[] args) {
		//StaticBlock s=new StaticBlock();
		//System.out.println(s.num);
		//System.out.println(s.str);
		System.out.println(num);
		System.out.println(str);


	}

}
