package com.cg.LamExp;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class ComparableLambda {

	public static void main(String[] args) {
		Comparator<String>obj=(s1,s2)->Integer.compare(s1.length(),s2.length());
        String str[]= {"abc","Ashlesha","Ashvini"};
        Collections.sort(Arrays.asList(str),obj);
        //System.out.println(obj);
        for(String i:str)
        {
        	System.out.println(i);
        }
	}

}
