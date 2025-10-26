package com.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

class Employee{
	int id;
	String name;
	double salary;
	String department;
	Employee(	int id,
	String name,
	double salary,
	String department)
	{
		this.id=id;
		this.name=name;
		this.department=department;
		this.salary=salary;
	}
	
	public String tostring()
	{
		return "employe id"+ id +" name: "+name+" salary "+salary+" department: "+ department;
	}
}
public class ListObject {
public static void main(String[]args)
{
	List<Employee>al=new ArrayList<>();
	al.add(new Employee(1,"jyo",34560.32,"it"));
	al.add(new Employee(2,"jyo",58456.32,"cs"));
	al.add(new Employee(3,"jyo",60056.32,"cv"));
	al.add(new Employee(4,"jyo",78056.32,"ec"));
	al.add(new Employee(5,"jyo",20456.32,"ml"));
	al.add(new Employee(6,"jyo",45456.32,"ai"));
	Iterator<Employee> itr=al.iterator();
	while(itr.hasNext())
	{
		Employee e=itr.next();
		System.out.println(e.tostring());
	}
	//filter
	Iterator<Employee> itf=al.iterator();
	while(itf.hasNext())
	{
		Employee e=itf.next();
		if(e.salary>50000) {
		System.out.println(e.tostring());
		}
	}
	//increase salary
	Iterator<Employee> sal=al.iterator();
	double newsal;
	while(sal.hasNext())
	{
		Employee e=sal.next();
		if(e.department=="it") {
			 newsal=e.salary+(e.salary*10/100);
			 e.salary=newsal;
				System.out.println(e.tostring());
			 }

	}
	//remove
	Iterator<Employee> rem=al.iterator();
	while(rem.hasNext())
	{
		Employee e=rem.next();
		if(e.salary<30000)
		{
			System.out.println(e.tostring()+" deleted");
			al.remove(e);
		}
//		System.out.println(e.tostring());
	}
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the emid id to display");
	int emid=sc.nextInt();
	for(Employee e:al)
	{
		if(e.id==emid)
		{
			System.out.println(e.tostring());
		}
	}
	Iterator<Employee> itd=al.iterator();
	while(itd.hasNext())
	{
		Employee e=itd.next();
		System.out.println(e.tostring());
	}
	
}
}
