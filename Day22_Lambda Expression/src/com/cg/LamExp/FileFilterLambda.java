package com.cg.LamExp;

import java.io.File;
import java.io.FileFilter;

public class FileFilterLambda {

	public static void main(String[] args) {
		//
		FileFilter obj=(File pathname)->pathname.getName().endsWith(".pptx");
		File dir=new File("C:\\Users\\PC\\Downloads");
		File[] contents=dir.listFiles(obj);
		for(File i:contents)
		{
			System.out.println(i);
		}
	}

}
