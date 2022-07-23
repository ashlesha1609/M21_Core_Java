package com.cg.array;

class Employee
{
	public int EmpId;
	public String Name;
	
	Employee(int id,String name)
	{
		EmpId=id;
		Name=name;
	}
}

public class NonPrimitiveArray {

	public static void main(String[] args) {
		Employee arr[]=new Employee[3];
		arr[0]=new Employee(12,"Ashlesha");
		arr[1]=new Employee(122,"Aditya");
		arr[2]=new Employee(122,"Ashu");
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("Element at"+i+" index is "+arr[i].EmpId+" "+arr[i].Name);
		}
		

	}

}
