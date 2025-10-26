package com.collection;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class IteratorList {
	public static void main(String args[])
	{
//		ArrayList<Integer>al=new ArrayList<>();
		List<Integer>l=new ArrayList<>();
		l.add(2);
		l.add(null);
		l.add(3);
		l.add(5);
	System.out.println(l);	
	ListIterator<Integer> itr=l.listIterator(l.size());
	while(itr.hasPrevious())
	{
		System.out.println(itr.previous());
	}
	}
	

}
