package com.cg.array;

public class Array {

	public static void main(String[] args) {
		int arr[]= {11,22,33,44,55};
		//System.out.println(arr[4]);
        //System.out.println(arr[2]+" "+arr[4]);
		/*for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" "); //11,
		}*/
		//enhance for loop
		for(int x:arr)
		{
			System.out.print(x+" ");
		}
	}

}
