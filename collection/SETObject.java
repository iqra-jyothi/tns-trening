package com.collection;



import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;


class Employees{
	int id;
	String name;
	double salary;
	String department;
	Employees(	int id,
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

class Cmp implements Comparator<Employees> {
    @Override
    public int compare(Employees o1, Employees o2) {
        int cmp = Double.compare(o1.salary, o2.salary);
        if (cmp != 0) return cmp;
        return Integer.compare(o1.id, o2.id); // tie-breaker
    }
}

public class SETObject {
public static void main(String[]args)
{
	TreeSet<Employees> t=new TreeSet<>(new Cmp());
	LinkedHashSet<Employees>al=new LinkedHashSet<>();
	al.add(new Employees(1,"jyo",34560.32,"it"));
	al.add(new Employees(2,"jyo",58456.32,"cs"));
	al.add(new Employees(3,"jyo",60056.32,"cv"));
	al.add(new Employees(4,"jyo",78056.32,"ec"));
	al.add(new Employees(5,"jyo",20456.32,"ml"));
	al.add(new Employees(6,"jyo",45456.32,"ai"));
	al.add(new Employees(5,"jyo",20456.32,"ml"));
	al.add(new Employees(6,"jyo",45456.32,"ai"));
	t.addAll(al);
	
	Iterator<Employees> itr=al.iterator();
	while(itr.hasNext())
	{
		Employees e=itr.next();
		System.out.println(e.tostring());
	}
	//filter
	Iterator<Employees> itf=al.iterator();
	while(itf.hasNext())
	{
		Employees e=itf.next();
		if(e.salary>50000) {
		System.out.println(e.tostring());
		}
	}
	//increase salary
	Iterator<Employees> sal=al.iterator();
	double newsal;
	while(sal.hasNext())
	{
		Employees e=sal.next();
		if(e.department=="it") {
			 newsal=e.salary+(e.salary*10/100);
			 e.salary=newsal;
				System.out.println(e.tostring());
			 }

	}
	//remove
	Iterator<Employees> rem=al.iterator();
	while(rem.hasNext())
	{
		Employees e=rem.next();
		if(e.salary<30000)
		{
			System.out.println(e.tostring()+" deleted");
			rem.remove();
		}
//		System.out.println(e.tostring());
	}
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the emid id to display");
	int emid=sc.nextInt();
	for(Employees e:al)
	{
		if(e.id==emid)
		{
			System.out.println(e.tostring());
		}
	}
	Iterator<Employees> itd=al.iterator();
	while(itd.hasNext())
	{
		Employees e=itd.next();
		System.out.println(e.tostring());
	}
	
	System.out.println("Employees sorted by salary:");
	for (Employees e : t) {
	    System.out.println(e);
	}
	
}

}
