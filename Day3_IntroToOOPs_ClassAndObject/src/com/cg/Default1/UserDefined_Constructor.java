package com.cg.Default1;
import java.util.Scanner;
class C
{
	int rollno;
	String name;
	int rollno1;
	String name1;
	
	C(int r,String n)
	{
		rollno=r;
		name=n;
		rollno1=r;
		name1=n;
	}
	void print()
	{
		System.out.println("Roll No is: "+rollno+" and Name is: "+name);
	}
}

public class UserDefined_Constructor {

	public static void main(String[] args) {
	
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the first name and roll no. :");
		int rollno=s.nextInt();
		String name=s.nextLine();
		System.out.println("Enter the second name and roll no. :");
		int rollno1=s.nextInt();;
		String name1=s.nextLine();
		C obj=new C(rollno,name);
		C obj1=new C(rollno1,name1);
		obj.print();
		obj1.print();
		s.close();
	}
}
