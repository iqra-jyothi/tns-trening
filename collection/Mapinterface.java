package com.collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

class Employe{
	int id;
	String name;
	double salary;
	String depart;
	Employe(int id,
	String name,
	double salary,
	String depart
	)
	{
		this.id=id;
		this.name=name;
		this.salary=salary;
		this.depart=depart;
	
	
	}
	public String toString() {
		return "employee id "+id+"name"+name+" salary"+salary+"department "+depart;
	}
	
}
public class Mapinterface {
public static void main(String[]args)
{
//	for(Map.Entry<Integer,String>m:map.entrySet()) {
//		System.out.println(m.getKey()+" ->"+m.getValue());}
//			for(Integer key:map.keySet())
//			{
//				System.out.println(key+ " "+map.get(key));
//			}
	Map<Integer,Employe>hm=new HashMap<>();
	hm.put(1,new  Employe(1,"ranjit",50000.9,"it"));
	hm.put(2,new  Employe(2,"rakesh",59000.9,"ec"));
	hm.put(3,new  Employe(3,"raj",57000.9,"it"));
	hm.put(4,new  Employe(4,"hasish",55000.9,"cs"));
	hm.put(5,new  Employe(5,"raju",60000.9,"is"));
	//display all emploree
	for(Map.Entry<Integer,Employe>entry:hm.entrySet())
	{
		System.out.println(entry.getKey()+ "->"+entry.getValue());
	}
	Scanner sc=new Scanner(System.in);
	System.out.println("enter id to check");
	int i=sc.nextInt();
	if(hm.containsKey(i))
	{
		System.out.println("employee with id "+i+ "exits: "+hm.containsKey(i));
		System.out.println("employee "+i+"details"+hm.get(i));
	}
	else {
		System.out.println("employee with id "+i+ "exits: "+hm.containsKey(i));
	}
	System.out.println("enter id get");
	int id=sc.nextInt();
	
	if(hm.containsKey(id))
	{
		System.out.println("employee with id "+id+ "exits: "+hm.containsKey(id));
		System.out.println("employee "+id+"details"+hm.get(id));
	}
	else {
		System.out.println("employee with id "+id+ "exits: "+hm.containsKey(id));
	}
	double newsal;
	for(Integer key:hm.keySet())
	{
		if(hm.get(key).depart.equals("it"))
		{
			 newsal=hm.get(key).salary+(hm.get(key).salary*10/100);
			 hm.get(key).salary=newsal;
				System.out.println(hm.get(key));
			 }
		}
	Iterator<Integer> itr = hm.keySet().iterator();
	while (itr.hasNext()) {
	    Integer key = itr.next();
	    if (hm.get(key).salary < 52000) {
	        System.out.println("Deleted: " + hm.get(key));
	        itr.remove(); // ✅ safe removal
	    }
	}

	for(Integer key:hm.keySet())
		{
			System.out.println(key+ " "+hm.get(key));
		}
	int count=0;
	for(Integer key:hm.keySet())
		{
		if(hm.get(key).depart.equals("it"))
		{
			count++;
		}
		System.out.print(count);
	
	
	}
	
	
}
}
