package samp;

import java.util.ArrayList;
import java.util.List;

public class wildcard {
public static void main(String[] args) {
	

	List<x> list1=new ArrayList<x>();  
	list1.add(new x());  
	  
	List<y> list2=new ArrayList<y>();  
	list2.add(new y());  
	list2.add(new y());  
	  
	x.print(list1);  
	x.print(list2);  

}
	
}


abstract class A{
	abstract void get();
}
class x extends A{

	@Override
	void get() {
		// TODO Auto-generated method stub
		System.out.println("run");
	}
	public static void print(List<? extends A> m){
		for(A s:m){  
			s.get();//calling method of Shape class by child class instance  
			}  

	}
	
}
class y extends A{

	@Override
	void get() {
		// TODO Auto-generated method stub
	System.out.println("2nd method");	
	}
	
}