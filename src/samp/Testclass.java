package samp;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

public class Testclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
List<Integer> li=new ArrayList<Integer>();
for(int i=1;i<=5;i++)
	li.add(i);
	Iterator<Integer> it=li.iterator();
		while(it.hasNext())
			{
					System.out.println(it.next());
			}
		li.forEach(new Consumer<Integer>() {

			@Override
			public void accept(Integer t) {
				// TODO Auto-generated method stub
				System.out.println("List is"+t);
			}
		});


		//traversing with Consumer interface implementation
		samp1 action = new samp1();
				li.forEach(action);
	}

}

 class samp1 implements Consumer<Integer>{

	@Override
	public void accept(Integer t) {
		// TODO Auto-generated method stub
		System.out.println("heloo"+t);
	}
	
}
