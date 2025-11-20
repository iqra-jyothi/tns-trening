package com.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
class Emp{
	String name;
	double salary;
	 Emp(String name,double salary)
	{
		this.name=name;
		this.salary=salary;
	}
    public String getName() { return name; }
    public double getSalary() { return salary; }
    @Override
    public String toString() {
        return  " - " + name + " - " + salary + " - ";
    }
	
	
}
public class StreamApi {
	
public static void main(String[]args)

{
	List<Integer>al=new ArrayList<>(Arrays.asList(1,4,98,78,543,234,1,4,7,7));
	List<String>str=new ArrayList<>(Arrays.asList("HII","WOLD","JYOTHI"));
	al.stream().filter(n->n>50)
	
	.forEach(System.out::println);
	str.stream().map(n->n.toLowerCase()).forEach(System.out::println);
	long c=str.stream().filter(n->(n.length()>5)).count();
	System.out.print(c);
	List<Integer>ans=al.stream().distinct().collect(Collectors.toList());
	System.out.print(ans);
	List< Emp>emp=new ArrayList<>();
	emp.add(new Emp("jyothi",2346.24));
	emp.add(new   Emp("ashish",30000.24));
	emp.add(new Emp("kari",45000.24));
	emp.add(new Emp("evil",50000.24));
	emp.stream().filter(e->e.getSalary()>30000).forEach(System.out::println);
	emp.stream().sorted(Comparator.comparing( Emp::getSalary)).forEach(System.out::println);
	emp.stream().filter(e->e.getName().matches("[aeiou].*")).forEach(System.out::println);
	
}
}
